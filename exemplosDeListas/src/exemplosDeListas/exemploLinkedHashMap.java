package exemplosDeListas;

import java.util.LinkedHashMap;
import java.util.Map;

public class exemploLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Um", 1);
		map.put("Dois", 2);
		map.put("Três", 3);
		
		System.out.println(map.get("Um"));
		
		System.out.println(map.containsKey("Dois"));
		System.out.println(map.containsValue(3));
		
		map.remove("Dois");
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
