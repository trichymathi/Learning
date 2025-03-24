package basicFormOfPattern;

import java.util.Scanner;

public class Square_Fill_Pattern_Number {
	
	/*
	 *  i=1 stars =1, n=5 stars = i = 5
	 *  i=2 stars =2, n=5 stars = i = 4
	 *  i=3 stars =3, n=5 stars = i = 3
	 *  i=4 stars =4, n=5 stars = i = 2
	 *  i=5 stars =5, n=5 stars = i = 1
	 */
	
	public static void rightHalfPyramidPatternNumber(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	/*
	 *  i=1 stars =5, n=5 stars = n-i+1 =5-1+1 =5
	 *  i=2 stars =4, n=5 stars = n-i+1 =4-1+1 =4
	 *  i=3 stars =3, n=5 stars = n-i+1 =3-1+1 =3
	 *  i=4 stars =2, n=5 stars = n-i+1 =2-1+1 =2
	 *  i=5 stars =1, n=5 stars = n-i+1 =1-1+1 =1
	 */
	public static void reverseRightHalfPyramidPatternNumber(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=sc.nextInt();
		rightHalfPyramidPatternNumber(n);
//		reverseRightHalfPyramidPatternNumber(n);

	}

}
