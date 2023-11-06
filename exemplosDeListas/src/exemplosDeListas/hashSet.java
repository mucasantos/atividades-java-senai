package exemplosDeListas;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		// Criar um HashSet
		HashSet<String> set = new HashSet<>();
		
		// adicionar string a lista
		set.add("Banana");
		set.add("Melancia");
		set.add("Caqui");
		
		// adicionar duplicata a list
		set.add("Banana");
		
		// percorrer a lista
		for (String fruit : set) {
			System.out.println(fruit);
		}
		
		if (set.contains("Banana")) {
			System.out.println("Banana está no conjunto");
		}
		
		set.remove("Banana");
		
		if (set.contains("Banana")) {
			System.out.println("Banana está no conjunto");
		}
		
		System.out.println("Tamanho da lista: " + set.size());
	}

}
