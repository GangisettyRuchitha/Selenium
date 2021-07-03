package MethodsOfArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("ruchi");
		arr.add(517);
		arr.add(21.5f);
		arr.add('G');
		Collections.reverse(arr);
		for(Object obj :arr)
		{
			System.out.println(obj);
		}

	}

}
