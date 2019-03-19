package p1;

import java.util.*;

public class HashSetEx { // no sorting and no insertion order is followed

	public static void showSet() {
		Set<String> hset = new LinkedHashSet<String>();  //linked has set allows null value and insertion order is also allowed
		hset.add("ABC");
		hset.add(null);
		hset.add("abc");
		// hset.add("abc"); //here only removal of duplicates so this duplicated one
		// cant be printed
		hset.add("123");
		hset.add("A12B");
		hset.add("1234");
		// hset.add(null); it removes even duplicated null, null may be printed
		// first(depends on the compiler)
		System.out.println(hset);
		Iterator<String> it = hset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void showTreeSet() {     //always items are sorted
		Set<String> tset = new TreeSet<String>();
		tset.add("ABC");
		tset.add("AB");
		tset.add("ab");
		// hset.add("abc"); //here only removal of duplicates so this duplicated one
		// cant be printed
		tset.add("123");
		// tset.add(null); //treeset doesnt allow null value since in treeset since sorting occurs
		tset.add("A12B");
		tset.add("123");
		System.out.println(tset);
		Iterator<String> it = tset.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	

	public static void main(String[] args) {
		//showSet();
		showTreeSet();
	}

}
