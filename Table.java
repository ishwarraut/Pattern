package Coding;

import java.util.Scanner;

public class Table {
	public static void main(String args []){
		int num;
		System.out.println("Enter any Number");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();

		for(int i=1;i<=4;i++)
		{
		System.out.println(num=num*i);
		}
		}

}
