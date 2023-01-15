package org.example.inferenciavariavel;

import java.util.HashMap;

public class Teste {
	// Local Variable Type Inference 
	public static void main(String[] args) {
		var cpfPorNomes = new HashMap<String, String>();
		cpfPorNomes.put("Joao", "04813189");

		System.out.println(cpfPorNomes);
	}
}
