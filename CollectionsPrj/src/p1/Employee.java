package p1;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
	String name, email;
	int exp;
	int dept;

	public Employee(String name, String email, int exp, int dept) {
		super();
		this.name = name;
		this.email = email;
		this.exp = exp;
		this.dept = dept;
	}

	@Override	//this @override is known as annotation
	public int compareTo(Employee emp) {
		// if (this.email == emp.email) {
		return (email.compareTo(emp.email)); // if we wanna compare string no need to write if and else directly write
											// return (name.compareTo(emp.name));
		/*
		 * } else if (this.email > emp.email) { return 1; } else { return -1; }
		 */
	}

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Akhil", "akhil@gmail.com", 10, 310));
		list.add(new Employee("Ram", "ram@gmail.com", 5, 311));
		list.add(new Employee("Sam", "sam@gmail.com", 11, 312));
		list.add(new Employee("Abhi", "abhi@gmail.com", 4, 309));
		Collections.sort(list);
		for (Employee e1 : list) {
			System.out.println(e1.name + " " + e1.dept + " " + e1.email + " " + e1.exp);
		}
	}

}
