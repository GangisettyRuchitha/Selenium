package MethodsOfArrayList;

import java.util.ArrayList;

public class CloneMethod {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("ruchi");
		arr.add("ruchiii");
		arr.add("ruchitha");
		System.out.println("before clone method:"+arr);
		ArrayList<String> copy=(ArrayList<String>)arr.clone();
		System.out.println("after clone method:"+copy);

	}

}
