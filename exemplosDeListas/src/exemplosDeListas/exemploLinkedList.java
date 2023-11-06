package exemplosDeListas;

import java.util.LinkedList;

public class exemploLinkedList {

	public static void main(String[] args) {
		// Cria um LinkedList
		LinkedList<String> lista = new LinkedList<>();
		
		// adiciona
		lista.add("A");
		lista.add("B");
		lista.add("C");
		
		lista.addFirst("X");
		lista.addLast("Z");
		
		for(String item : lista) {
			System.out.println(item);
		}
		
		lista.removeFirst();
		lista.removeLast();
		
	}

}
