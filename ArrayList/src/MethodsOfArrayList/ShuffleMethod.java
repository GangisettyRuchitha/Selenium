package MethodsOfArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleMethod {

	public static void main(String[] args) 
	{
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("ruchi");
		arr.add(517);
		arr.add(21.5f);
		arr.add('G');
		Collections.shuffle(arr);
		System.out.println("Results after swaping:");
		for(Object str:arr)
		{
			System.out.println(str);
		}
		Collections.shuffle(arr);
		System.out.println("Results after swaping:");
		for(Object str:arr)
		{
			System.out.println(str);
		}



	}

}
