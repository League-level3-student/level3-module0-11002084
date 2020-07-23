package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String args[]) {
		MoreArrayFun arrayFun = new MoreArrayFun();
		String[] fruits = new String[] {"Apple", "Orange", "Banana", "Grapes", "Watermelon", "Dragonfruit"};
		
		//arrayFun.printStrings(fruits);
		//arrayFun.printStringsReverse(fruits);
		//arrayFun.printEveryOtherString(fruits);
		arrayFun.printStringsRandom(fruits);
	}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void printStrings(String[] stringArr) {
		for(String string : stringArr) {
			System.out.println(string);
		}
	}
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void printStringsReverse(String[] stringArr) {
		for(int i=stringArr.length-1; i>=0; i--) {
			System.out.println(stringArr[i]);
		}
	}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void printEveryOtherString(String[] stringArr) {
		for(int i=0; i<stringArr.length; i++) {
			if(i%2 == 0) {
				System.out.println(stringArr[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	void printStringsRandom(String[] stringArr) {
		Random rand = new Random();
		int[] printedIndexes = new int[stringArr.length];
		int selectedIndex;
		boolean foundDuplicate;
		
		for(int k=0; k<printedIndexes.length; k++) {
			printedIndexes[k] = -1;
		}
		
		for(int i=0; i<stringArr.length; i++) {
			while(true) {
				foundDuplicate = false;
				selectedIndex = rand.nextInt(stringArr.length);
				
				for(int j=0; j<printedIndexes.length; j++) {
					if(printedIndexes[j] == selectedIndex) {
						foundDuplicate = true;
						break;
					}
				}
				
				if(!foundDuplicate) {
					printedIndexes[i] = selectedIndex;
					System.out.println(stringArr[selectedIndex]);
					break;
				}
			}
		}
	}
}
