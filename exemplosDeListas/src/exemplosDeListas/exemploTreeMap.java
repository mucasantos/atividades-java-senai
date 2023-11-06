package exemplosDeListas;

import java.util.TreeMap;

public class exemploTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(1, "Um");
		map.put(2, "Dois");
		map.put(3, "Três");
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
	}

}
