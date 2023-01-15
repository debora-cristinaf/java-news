package org.example.factorymethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Teste {

	public static void main(String[] args) {

		//Factory Method para Collection.
		List<String> nomes = List.of("Primeiro nome", "Segundo nome");
		List.of("Terceiro");
		Map.of("nome", "joao");
	}
}
