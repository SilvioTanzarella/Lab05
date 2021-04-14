package model;

import java.util.ArrayList;
import java.util.List;

import DAO.AnagrammaDAO;

public class Model {

	private AnagrammaDAO anagrammaDAO = new AnagrammaDAO();
	
	public List<String> anagrammi(String parola){
		List<String> risultato = new ArrayList<String>();
		permuta("",parola,0,risultato);
		return risultato;
	}
	
	
	private void permuta(String parziale, String lettere, int livello, List<String> risultato) {
		if(lettere.length()==0)
		{
			if(!risultato.contains(parziale))
				risultato.add(parziale);
		}
		else {
			for(int pos=0; pos<lettere.length();pos++) {
				char tentativo = lettere.charAt(pos);
				String nuovoParziale = parziale+tentativo;
				String nuoveLettere = lettere.substring(0,pos)+lettere.substring(pos+1);
				permuta(nuovoParziale, nuoveLettere, livello, risultato);
			}
		}
	}
	
	public boolean isCorrect(String anagramma) {
		return this.anagrammaDAO.isCorrect(anagramma);
	}
}
