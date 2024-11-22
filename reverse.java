package Coding;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no");
		int n= sc.nextInt();
		int r;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			System.out.print(r);
			
			
		}
		
	}

}
