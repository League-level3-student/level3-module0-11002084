package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringArray = new String[] {"Apple", "Banana", "Orange", "Watermelon", "Mango"};
		
		//2. print the third element in the array
		System.out.println(stringArray[2]);

		//3. set the third element to a different value
		stringArray[2] = "Tangerine";

		//4. print the third element again
		System.out.println(stringArray[2]);
		
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i=0; i<stringArray.length; i++) {
			stringArray[i] = "Grape";
		}
		
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		//7. make an array of 50 integers
		int[] integerArray = new int[50];
		for(int i=0; i<integerArray.length; i++) {
			integerArray[i] = i;
		}

		//8. use a for loop to make every value of the integer array a random number
		Random rand = new Random();
		for(int i=0; i<integerArray.length; i++) {
			integerArray[i] = rand.nextInt(100);
		}

		//9. without printing the entire array, print only the smallest number on the array
		int smallestNum = 101;
		
		for(int i=0; i<integerArray.length; i++) {
			if(integerArray[i] < smallestNum) {
				smallestNum = integerArray[i];
			}
		}
		
		System.out.println(smallestNum);

		//10 print the entire array to see if step 8 was correct
		for(int i=0; i<integerArray.length; i++) {
			System.out.print(integerArray[i] + ", ");
		}
		
		System.out.println("");

		//11. print the largest number in the array.
		int largestNum = -1;
		
		for(int i=0; i<integerArray.length; i++) {
			if(integerArray[i] > largestNum) {
				largestNum = integerArray[i];
			}
		}
		
		System.out.println(largestNum);
		
		//12. print only the last element in the array
		System.out.println(integerArray[integerArray.length - 1]);
	}
}
