package p1;

import java.util.*;

public class LinkedListEx {

	public static void showLink() 
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("j");
		list.add("C");
		list.add("H");
		System.out.println("Initial Size" +list.size());
		list.addFirst("P");
		list.addLast("Cpp");
		System.out.println("new size" +list.size());
		System.out.println(list);
		Iterator<String> it = list.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.pollFirst();
		System.out.println(list);
		list.pollLast();
		System.out.println(list);
	}
	
	public static void main(String[] args) {
	showLink();

	}

}
