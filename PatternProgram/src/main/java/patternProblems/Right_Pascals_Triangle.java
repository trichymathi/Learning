package patternProblems;

import java.util.Scanner;

public class Right_Pascals_Triangle {
	
	/*Pattern
*
**
***
****
*****
****
***
**
*
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=sc.nextInt();
		/*
		 *  i=1 stars =1, n=5 stars = i = 5
		 *  i=2 stars =2, n=5 stars = i = 4
		 *  i=3 stars =3, n=5 stars = i = 3
		 *  i=4 stars =4, n=5 stars = i = 2
		 *  i=5 stars =5, n=5 stars = i = 1
		 */
		//Upper Part
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		/*
		 *  i=1 stars =4, n=5 stars = n-i = 5-1 =4
		 *  i=2 stars =3, n=5 stars = n-i = 4-1 =3
		 *  i=3 stars =2, n=5 stars = n-i = 3-1 =2
		 *  i=4 stars =1, n=5 stars = n-i = 2-1 =1
		 */
		//Lower Part
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
