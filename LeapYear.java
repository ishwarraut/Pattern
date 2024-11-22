package Coding;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int y;
		System.out.println("Enter a year");
		Scanner sc =  new Scanner(System.in);
		y=sc.nextInt();
		
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not Leap Year");
		}
	}

}
