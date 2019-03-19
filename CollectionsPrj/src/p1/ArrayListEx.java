package p1;


import java.util.*;

public class ArrayListEx {

	public static void showList()
	{
	ArrayList<Integer> list = new ArrayList<>();
	list.add(0);
	list.add(100);
	list.add(200);
	list.add(0,200);
	list.add(1,600);
	
	for(Integer o:list)
	{
		System.out.println(o);
	}
	System.out.println("Iteration");
	Iterator<Integer> it = list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	System.out.println("size"+list.size());
	System.out.println("removed number  = "  +list.remove(0));
	System.out.println("New List = "+list);
	list.clear();
	System.out.println("Updated list = "+list);
	}
	public static void main(String[] args) {
		//ArrayListEx ex = new ArrayListEx();
		showList();

	}
}