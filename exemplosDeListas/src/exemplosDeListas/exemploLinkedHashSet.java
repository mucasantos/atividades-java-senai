package exemplosDeListas;

import java.util.LinkedHashSet;

public class exemploLinkedHashSet {

	public static void main(String[] args) {
		
		// criando o linkedhashset
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		// adicionar os valores
		set.add("Camaro");
		set.add("Ferrari");
		set.add("Corsinha");
		
		// adicionar elemento que ja existe
		set.add("Corsinha");
		
		for(String carro : set) {
			System.out.println(carro);
		}
		
		set.remove("Camaro");
		
		if(set.contains("Corsinha")) {
			System.out.println("Tem um corsinha!");
		}
		
		System.out.println("Tamanho da lista: " + set.size());
	}

}
