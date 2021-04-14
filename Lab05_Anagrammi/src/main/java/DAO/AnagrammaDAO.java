package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class AnagrammaDAO {

	public boolean isCorrect(String anagramma) {
		
		String sql = "SELECT COUNT(*) as tot"
				+ " FROM parola"
				+ " WHERE parola.nome = ? ";
		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, anagramma);
			ResultSet rs = st.executeQuery();
			rs.next();
			int count = rs.getInt("tot");
			if(count>0) 
			{
				rs.close();
				st.close();
				conn.close();
				return true;
			}
			else 
			{
				rs.close();
				st.close();
				conn.close();
				return false;
			}
		}catch(SQLException e) {
			throw new RuntimeException("Errore nel database");
		} 
	}
	
}
