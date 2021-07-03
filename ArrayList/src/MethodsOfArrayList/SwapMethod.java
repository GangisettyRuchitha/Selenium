package MethodsOfArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SwapMethod {

	public static void main(String[] args) 
	{
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("ruchi");
		arr.add(517);
		arr.add(21.5f);
		arr.add('G');
		Collections.swap(arr, 2, 3);
		System.out.println("Results after swapping");
		for(Object obj:arr)
		{
			System.out.println(obj);
		}

	}

}
