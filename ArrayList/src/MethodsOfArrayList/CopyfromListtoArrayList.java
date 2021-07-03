package MethodsOfArrayList;

import java.util.ArrayList;
import java.util.List;

public class CopyfromListtoArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Object> arr=new ArrayList<Object>();
		arr.add("ruchi");
		arr.add(517);
		arr.add(21.5f);
		System.out.println("Before Copying:"+arr);
		List<Object> list=new ArrayList<Object>();
		list.add("gangisetty");
		list.add(40);
		arr.addAll(list);
		System.out.println("After copying:"+arr);
		

	}

}
