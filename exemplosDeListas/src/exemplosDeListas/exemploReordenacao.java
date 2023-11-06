package exemplosDeListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class exemploReordenacao {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Jiovanni");
		nomes.add("Pedro goncalves");
		nomes.add("Rafael Carvalho");
		
		// ordena
		Collections.sort(nomes);
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		// desordenar
		Collections.shuffle(nomes);
		
	}

}
