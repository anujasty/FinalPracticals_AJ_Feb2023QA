package practical1;

import java.util.Random;

//Practical 1: Generate 500 random numbers and print the nth smallest number
//in a programming language of your choice. (Ask user for the Nth smallest number)
public class GenRanNumAndprintNthSmallest {
		
	public static void main(String[] args) {
		
		int TOTAL_NUM_TO_BE_GENERATED = 500;
		int MAX_VALUE_LIMIT = 999;
		int []intArr = new int[TOTAL_NUM_TO_BE_GENERATED];
		
		intArr = genRandomNum(intArr, MAX_VALUE_LIMIT);
		System.out.println("Nth smallest number is: "+findSmallestNum(intArr));

	}
	
	//Since array is initialized to 500 in the main, 
	//not passing the count to be generated as arr.length tells the count.
	public static int[] genRandomNum(int arr[], int maxLimit ){
		Random random = new Random();
		for (int i = 0; i<arr.length; i++) {
			arr[i] = random.nextInt(maxLimit);
			System.out.println(arr[i]);
		}
        return arr;
    }

	public static int findSmallestNum(int arr[]) {
		int minValue = arr[0];
		for (int i = 0; i<arr.length; i++) {
			if (minValue > arr[i])
				minValue = arr[i];
		}
		return minValue;
	}
}
