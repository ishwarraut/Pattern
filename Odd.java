package Coding;

import java.util.Scanner;

public class Odd {
	public static void main(String agrs[]) {
		
		System.out.println("Enter No of Terms");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i=i+2)
		{
			System.out.println(i+ " ");
		}
		
	}

}
