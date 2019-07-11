package com.practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		LinkedList<String> placeToVisit = new LinkedList<String>();
		addInOrder(placeToVisit, "sydney");
		addInOrder(placeToVisit, "jaffna");
		addInOrder(placeToVisit, "ampara");
		addInOrder(placeToVisit, "matara");
		addInOrder(placeToVisit, "america");
		addInOrder(placeToVisit, "mannar");
		addInOrder(placeToVisit, "colompo");

//		view linkedlist items
		PrintList(placeToVisit);

		addInOrder(placeToVisit, "singapoor");
		addInOrder(placeToVisit, "colompo");
		PrintList(placeToVisit);

		visit(placeToVisit);

	}

	private static void PrintList(LinkedList<String> linkedList) {
		Iterator<String> i = linkedList.iterator();
		while (i.hasNext()) {
			System.out.println("now visiting  " + i.next());
		}
		System.out.println("----");

	}

	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();

		while (stringListIterator.hasNext()) {
			int comparision = stringListIterator.next().compareTo(newCity);
			if (comparision == 0) {
//				equal, do not add
				System.out.println(newCity + "is allready included as a destinatin");
				return false;
			} else if (comparision > 0) {
//				new city should appear before this one

				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			} else if (comparision < 0) {
//				move on next city

			}
		}
		stringListIterator.add(newCity);
		return true;
	}

	public static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);

		boolean quit = false;
		boolean goingForward = false;

		ListIterator<String> listIterator = cities.listIterator();

		if (cities.getFirst() == "") {
			System.out.println("no cities found");
			return;
		} else {
			System.out.println("now visiting" + listIterator.next());
			printMenu();
		}

		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("holyday (vacation) over");
				quit = true;
				break;

			case 1:
				if (!goingForward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("now visiting " + listIterator.next());
				} else {
					System.out.println("Reached the end of the list");
					goingForward = false;
				}
				break;
			case 2:
				if (goingForward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Now visiting " + listIterator.previous());
				} else {
					System.out.println("we are at the start of the list");
					goingForward = true;
				}
				break;

			case 3:
				printMenu();
				break;
			}
		}

	}

	private static void printMenu() {
		System.out.println("available actions:\npress");
		System.out.println("0 - to quit\n" + "1 - to next city\n" + "2 - to previos city\n" + "3 - print menu option");
	}

}
