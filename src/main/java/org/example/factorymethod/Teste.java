package org.example.factorymethod;

import java.util.List;

public class Teste {

	public static void main(String[] args) {

		//Factory Method para Collection.
		List<String> nomes = List.of("Primeiro nome", "Segundo nome");
		List.of("Terceiro");

		System.out.print(nomes.get(1));
	}
}
