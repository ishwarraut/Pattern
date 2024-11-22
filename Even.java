package Coding;

import java.util.Scanner;

public class Even {
	public static void main(String args[]) {
		int i ,sum = 0;;
		
		System.out.println("Enter Range");
		Scanner sc=  new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2==0)
		{
			for(i=0;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("Sum of no "+sum);
		}
		else
		{
			for( i=1;i<=n;i=i+2)
			{
				sum=sum+i;
			}
			System.out.println("Sum of odd no "+sum);
		}
		
	}

}
