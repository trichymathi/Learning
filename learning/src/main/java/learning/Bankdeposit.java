package learning;

import java.util.HashMap;
import java.util.Scanner;

public class Bankdeposit {

static int minimumamount=500;
	
	public static void main(String[] args) {
//		Scanner bank = new Scanner(System.in);
//		System.out.print("Enter the amount: ");
//		int amount=bank.nextInt();
//		if(minimumamount<amount) {
//			System.out.println("Your account is accepted");
//		}else if(minimumamount>amount) {
//			System.out.println("Your account is failed");
//		}
//		else if(minimumamount==amount) {
//			System.out.println("Your account is equal");
//		}
//		
		String name ="Automation Tool Like Java";
//		String reverseWord ="";
//		String reverseString ="";
		String[] split = name.split(" ");
		HashMap<Integer, Character> map = new HashMap<>();
		for(String a:split) {
	       for(int i=1;i<name.length();i++) {
	    	   map.put(i, name.charAt(i));
	    	   
	       }
		}
	       System.out.println(map);
		
//	}

}
}
