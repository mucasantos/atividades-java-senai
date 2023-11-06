package exemplosDeListas;

import java.util.ArrayList;
import java.util.Collections;

public class exemploDeBusca {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Albert Eistein"); // 0
		nomes.add("Arthur Cuidado"); // 1
		nomes.add("Isaac Newton");
		nomes.add("Jiovanni");
		
		int resultado = Collections.binarySearch(nomes, "Jiovanni");
		
		System.out.println(resultado);
	}

}
