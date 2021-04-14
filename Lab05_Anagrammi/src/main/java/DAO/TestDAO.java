package DAO;

public class TestDAO {

	public static void main(String[] args) {
		
		AnagrammaDAO a = new AnagrammaDAO();
		boolean trovato = a.isCorrect("lejla");
		System.out.println(trovato);

	}

}
