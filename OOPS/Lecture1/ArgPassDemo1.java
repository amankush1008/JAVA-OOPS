package Lecture1;

import java.util.ArrayList;

public class ArgPassDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> myList= new ArrayList<>();
		myList.add(2);
		myList.add(3);
		
		System.out.println("Before Changing "+myList);
		change(myList);
		
		System.out.println("After Changing "+myList);
		
	}
	
	public static void change(ArrayList<Integer>myList) {
//		myList= new ArrayList<>();
		myList.add(4);
		myList.add(5);
	}
}
