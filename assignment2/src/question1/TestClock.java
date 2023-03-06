package question1;

import java.util.Scanner;

public class TestClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clk = new Clock();
		
		System.out.println("Enter the time : ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hour : ");
		int hour = sc.nextInt();
		System.out.println("min : ");
		int min = sc.nextInt();
		System.out.println("sec : ");
		int sec = sc.nextInt();
		
		System.out.println("Select AM/PM\n1. AM\n2. PM");
		int ampm = sc.nextInt();
		
		if(ampm != 1 && ampm != 2) System.out.println("Invalid input");
		
		clk.setTime(hour, min, sec, ampm == 1? "AM" : ampm == 2? "PM" : "Invalid");
		
		System.out.println("The time is : " + clk.getTime());
	}

}
