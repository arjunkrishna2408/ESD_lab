package question4;

import java.util.Scanner;

public class TestSumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int length = sc.nextInt();
		SumAverage sa = new SumAverage(length);
		int[] array = new int[length];
		System.out.println("Enter the elements: ");
		for(int i=0; i<length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("The Sum of odd numbers: " + sa.getSumAvgOfOdd(array)[0]);
		System.out.println("The Sum of even numbers: " + sa.getSumAvgOfEven(array)[0]);
		System.out.println("The Avg of odd numbers: " + sa.getSumAvgOfOdd(array)[1]);
		System.out.println("The Avg of even numbers: " + sa.getSumAvgOfEven(array)[1]);
	}

}
