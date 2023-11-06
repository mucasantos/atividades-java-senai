package exemplosDeListas;

import java.util.Hashtable;
import java.util.Map;

public class exemploHashTable {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> table = new Hashtable<>();
		
		table.put("Um", 1);
		table.put("Dois", 2);
		table.put("Três", 3);
		table.put("Ktorze", 14);
		
		System.out.println(table.get("Ktorze"));
		
		System.out.println(table.containsKey("Ktorze"));
		System.out.println(table.containsValue(15));
		
		table.remove("Ktorze");
		
		for(Map.Entry<String, Integer> entry : table.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
