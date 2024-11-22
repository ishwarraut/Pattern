package Coding;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		
		int a[] = new int[5];
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter elements in arrays");
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println("Arrays Elemnts ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i] +" ");
			sum=a[i]+sum;
		}
		System.out.println("Addition of array elements:-" +sum);
	}

}
