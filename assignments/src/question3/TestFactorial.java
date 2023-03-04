package question3;

import java.util.Scanner;

public class TestFactorial {
	public static void main(String[] args) {
		Factorial fac = new Factorial(1);
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to calculate it's factorial: ");
		num = sc.nextInt();
		
		System.out.println("The factorial of the number is : " + fac.getFactorial(num));
		
	}
}
