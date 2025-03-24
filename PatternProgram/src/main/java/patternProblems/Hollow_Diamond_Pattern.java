package patternProblems;

import java.util.Scanner;

public class Hollow_Diamond_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int n = sc.nextInt();
		
		/*Pattern
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *

		 */
		
		//Upper Part
		/*spaces
		 i=1 n=5 space =4  s=n-i = 5-1 =4
		 i=2 n=5 space =3  s=n-i = 5-2 =3
		 i=3 n=5 space =2  s=n-i = 5-3 =2
		 i=4 n=5 space =1  s=n-i = 5-4 =1
		 i=5 n=5 space =0  s=n-i = 5-5 =0
		 */
		/*
		 i=1 n=5 winLen =1  w= 2*i-1 = 2*1-1 = 1
		 i=2 n=5 winLen =3  w= 2*i-1 = 2*2-1 = 3
		 i=3 n=5 winLen =5  w= 2*i-1 = 2*3-1 = 5
		 i=4 n=5 winLen =7  w= 2*i-1 = 2*4-1 = 7
		 i=5 n=5 winLen =9  w= 2*i-1 = 2*5-1 = 9 
		 */
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i)-1;j++) {
				if(j==1||j==(2*i)-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}	
			System.out.println();
		}
		//Lower Part
				/*spaces
				 i=1 n=5 space =1  s=n-i = 5-1 =4
				 i=2 n=5 space =2  s=n-i = 5-2 =3
				 i=3 n=5 space =3  s=n-i = 5-3 =2
				 i=4 n=5 space =4  s=n-i = 5-4 =1
				 */
				/*
				 i=1 n=5 winLen =7  w= 2*(n-i)-1 = 2*(5-1)-1 = 7
				 i=2 n=5 winLen =5  w= 2*(n-i)-1 = 2*(5-2)-1 = 5
				 i=3 n=5 winLen =3  w= 2*(n-i)-1 = 2*(5-3)-1 = 3
				 i=4 n=5 winLen =1  w= 2*(n-i)-1 = 2*(5-4)-1 = 1
				 */
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n-i)-1;j++) {
				if(j==1||j==2*(n-i)-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
