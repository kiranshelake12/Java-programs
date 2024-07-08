package example;
import java.util.Scanner;
public class Posiornega {

	
	public static void main(String[] args)   
	{  
	int num;
	
	//object of the Scanner class  
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);  
	System.out.print("Enter a number you want to check: ");  
	
	//taking an integer value from the user  
	num = sc.nextInt(); 
	
	//string array that contains results  
	String[] result1 = {"Positive", "Negative"};
	
	//checks if the number is positive or negative  
	System.out.println(result1 [(num >> 31) & 1]);  
	}  
	} 


