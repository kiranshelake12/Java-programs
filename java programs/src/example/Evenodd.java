package example;
import java.util.Scanner;

public class Evenodd {
	 public static void main (String  []args )
	    {
	        @SuppressWarnings("resource")
			Scanner sc =new Scanner(System.in);
	        System.out.print("Enter a number :  " );
	        int num = sc.nextInt();

	        if(num % 2 == 0)
	            System.out.println("" + num + "  number is even");
	        else
	            System.out.println("\n" +  + num + "  "  + "number  is odd");
	    }

}

