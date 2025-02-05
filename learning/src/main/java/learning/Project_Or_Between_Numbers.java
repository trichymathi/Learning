package learning;

import java.util.ArrayList;
import java.util.Scanner;

public class Project_Or_Between_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arrList = new ArrayList<String>();
		
		while(true) {
			String input =sc.nextLine();

            // Check if the input is the exit keyword
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }

            // Add the input to the list
            arrList.add(input);
		}
		System.out.println(arrList);
		
		for(int i =0;i<=arrList.size()-1;i++) {
			System.out.print(arrList.get(i)+" or ");
		}
	}
	

}
