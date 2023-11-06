package exemplosDeListas;

import java.util.ArrayList;
import java.util.Collections;

public class exemploArrayList {

	public static void main(String[] args) {
		// Criar o ArrayList
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// adicionar dados a lista
		arrayList.add("Miguel");
		arrayList.add("Albert");
		arrayList.add("Fernando");
		arrayList.add("Mario");
		
		// Desordenar
		Collections.shuffle(arrayList);
		
		System.out.println(arrayList);
	}

}
