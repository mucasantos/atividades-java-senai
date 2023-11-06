package exemplosDeListas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class exemploTreeSet {

	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<Integer>();

		hashSet.add(100);
		hashSet.add(13210);
		hashSet.add(10);
		hashSet.add(2123);
		hashSet.add(321);

		// Polimorfismo de hashSet para linkedHashSet
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(hashSet);
		// Polimorfismo de hashSet para treeSet
		Set<Integer> treeSet = new TreeSet<Integer>(hashSet);

		Iterator<Integer> itHashSet = hashSet.iterator();
		Iterator<Integer> itLinkedHashSet = linkedHashSet.iterator();
		Iterator<Integer> itTreeSet = treeSet.iterator();

		while (itHashSet.hasNext() && itLinkedHashSet.hasNext() && itTreeSet.hasNext()) {
			System.out.println(
					"HashSet: " + itHashSet.next() + 
					" LinkedHashSet " + itLinkedHashSet.next() + 
					" TreeSet: " + itTreeSet.next()
			);
		}

	}

}
