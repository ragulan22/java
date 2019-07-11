package com.practice.Array;

public class Main {
	public static void main(String[] args) {

		int[] MyIntArray = new int[10];
		
//		MyIntArray[5]=50;
//		System.out.println(MyIntArray[5]);

		
//		for (int i = 0; i < MyIntArray.length; i++) {
//			MyIntArray[i] = i * 10;
//		}
//		for (int i = 0; i < MyIntArray.length; i++) {
//			System.out.println("Element" + i + ",value is" + MyIntArray[i]);
//		}
		
		
		for (int i = 0; i < MyIntArray.length; i++) {
		MyIntArray[i] = i * 10;
	}
		printArray(MyIntArray);
	}
		public static void printArray(int[] array) {
			for(int i=0; i<array.length; i++) {
				System.out.println("Element" + i + ",value is" + array[i]);
			
		}

	}

}
