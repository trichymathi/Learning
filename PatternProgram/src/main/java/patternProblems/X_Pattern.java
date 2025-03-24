package patternProblems;

import java.util.Scanner;

public class X_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int n = sc.nextInt();
		
		   /*Pattern
*       * 
 *     * 
  *   * 
   * * 
    * 
   * * 
  *   * 
 *     * 
*       * 
		    */
		
		
		//Upper Part
				/*spaces
				 i=1 n=5 space =0  s=i-1 = 1-1 =0
				 i=2 n=5 space =1  s=i-1 = 2-1 =1
				 i=3 n=5 space =2  s=i-1 = 3-1 =2
				 i=4 n=5 space =3  s=i-1 = 4-1 =3
				 i=5 n=5 space =4  s=i-1 = 5-1 =4
				 */
				/*
				 i=1 n=5 winLen =5  w= n-i+1 = 5-1+1 = 5
				 i=2 n=5 winLen =4  w= n-i+1 = 5-2+1 = 4
				 i=3 n=5 winLen =3  w= n-i+1 = 5-3+1 = 3
				 i=4 n=5 winLen =2  w= n-i+1 = 5-2+1 = 2
				 i=5 n=5 winLen =1  w= n-i+1 = 5-5+1 = 1 
				 */
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++) {
				if(j==1||j==n-i+1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		//Lower Part
		/*spaces
		 i=1 n=5 space =3  s=n-i-1 = 5-1-1 =3
		 i=2 n=5 space =2  s=n-i-1 = 5-2-1 =2
		 i=3 n=5 space =1  s=n-i-1 = 5-3-1 =1
		 i=4 n=5 space =0  s=n-i-1 = 5-4-1 =0
		 */
		/*
		 i=1 n=5 winLen =2  w= i+1 = 1+1 = 2
		 i=2 n=5 winLen =3  w= i+1 = 2+1 = 3
		 i=3 n=5 winLen =4  w= i+1 = 3+1 = 4
		 i=4 n=5 winLen =5  w= i+1 = 2+1 = 5 
		 */
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				if(j==1 || j==i+1) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
