package com.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo1 {
	public static void main(String[] args) {
		LinkedList<String> placeToVisit = new LinkedList<String>();

		placeToVisit.add("colombo");
		placeToVisit.add("kandy");
		placeToVisit.add("jaffna");
		placeToVisit.add("mannar");
		placeToVisit.add("vavuniya");
		placeToVisit.add("batti");
		placeToVisit.add("kites");

//		view linkedlist items
		PrintList(placeToVisit);
		
//		add item in row
		placeToVisit.add(1,"singapoor");
		PrintList(placeToVisit);
		
//		remove item
		placeToVisit.remove(2);
		PrintList(placeToVisit);
	}

	private static void PrintList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();
		while (i.hasNext()) {
			System.out.println("now visiting  " + i.next());
		}
		System.out.println("----");

	}

}
