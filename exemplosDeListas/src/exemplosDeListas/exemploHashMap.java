package exemplosDeListas;

import java.util.HashMap;
import java.util.Map;

public class exemploHashMap {

	public static void main(String[] args) {
		// Adicionamos dois tipos, o valor e a key
		HashMap<String, Integer> map = new HashMap<>();
		
		// adiciono um elemento no HashMap
		map.put("Um", 1);
		map.put("Dois", 2);
		map.put("Três", 3);
		
		// busca com base na chave
		System.out.println(map.get("Um"));
		
		// verificando se existe um objeto na lista
		System.out.println(map.containsKey("Dois"));
		System.out.println(map.containsValue(3));
		
		// removendo um objeto da lista
		map.remove("Dois");
		// quantidade de itens na lista
		System.out.println(map.size());
		
		// Itera sobre os elementos do hashmap
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			// escreve cada objeto do nosso array
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
