package example;

import java.util.Scanner;

public class Add {
	public static void main (String[]args)
	{
		int a ,b,c;
		@SuppressWarnings("resource")
		Scanner Sc =new Scanner (System.in);
		System.out.println("enter first number :");
		a=Sc.nextInt();
		
		System.out.println("enter second number :");
		b=Sc.nextInt();
		c=a+b;
		System.out.println("addition of two numbers is " + c);
		
		
		
		
	}
}



