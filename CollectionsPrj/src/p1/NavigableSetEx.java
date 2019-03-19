package p1;

//import java.util.Iterator;
import java.util.NavigableSet;
//import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetEx {

	public static void show() {
		NavigableSet<String> nset = new TreeSet<>();
		nset.add("1");
		nset.add("2");
		nset.add("3");
		nset.add("4");
		nset.add("5");
		NavigableSet<String> it = nset.descendingSet(); // we cant use hasNext() and Next() methods
		System.out.println("Descending Set = " + it.toString());

		/*
		 * Iterator<String> it1 = nset.descendingIterator(); while(it1.hasNext()) {
		 * System.out.println(it1.next()); }
		 */
		/*SortedSet<String> s1 = nset.headSet("4", true); // default value of inclusive is false //if we want to include
														// even kittu then give it as true
		System.out.println(s1);

		SortedSet<String> s2 = nset.tailSet("3", false);// default value of inclusive is true //here if we don't want to
														// include kittu give it as false
		System.out.println(s2);

		SortedSet<String> s3 = nset.subSet("2", "2");  //subSet is from which to which to print
		System.out.println(s3);
		
		//SortedSet<String> s4 = nset.ceiling(String "2");*/
		String value = nset.ceiling("3.1");
		System.out.println("Ceiling value is "+value);
		String va1 = nset.floor("3.1");
		System.out.println("Floor value is "+va1);
	}

	public static void main(String[] args) {
		show();
	}

}
