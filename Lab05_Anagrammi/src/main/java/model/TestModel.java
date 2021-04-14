package model;

import java.util.List;

public class TestModel {
	

	public static void main(String[] args) {
		
		Model model = new Model();
		List<String> risultato = model.anagrammi("ssa");
		for(String s: risultato) {
			System.out.println(s+"\n");
		}
		
		
		

	}

}
