package SubInterfaces;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class BasicOperations {

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(10);
		
		System.out.println(h);
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		System.out.println("first message");
		System.out.println("second message");

	}

}
