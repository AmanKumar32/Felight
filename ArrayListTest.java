package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Employee> obj = new ArrayList<Employee>();
		obj.add(new Employee(101,"Aman",20000));
		obj.add(new Employee(102,"Venkat",10000));
		obj.add(new Employee(103,"Manuvana",60000));
		obj.add(new Employee(104,"Prakash",68000));
		obj.add(new Employee(105,"Parvesh",29000));
		System.out.println(obj.size());
		Collections.sort(obj);
		System.out.println("sorted "+obj);
		
		
	}

}
