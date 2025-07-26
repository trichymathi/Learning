package learning;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSecondDuplicateStringInAnArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an number elements to store in an array: ");
		int n = Integer.parseInt(scan.nextLine());
		String[] arr= new String[n];
		System.out.println("Enter an "+n+" to store in an array: ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextLine();
		}
//		System.out.println(Arrays.toString(arr));
		
//		for(int i=0)
	}

}
