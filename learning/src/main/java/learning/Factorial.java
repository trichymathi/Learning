package learning;

import java.util.Scanner;

public class Factorial {
 static long factorial(int a) {
	 long fact=1;
	 for(int i=a;i>0;i--) {
		 fact=fact*i;
	 }
	 System.out.println("Factorial Number is : "+fact);
	return fact;
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		factorial(sc.nextInt());
		
	}

}
