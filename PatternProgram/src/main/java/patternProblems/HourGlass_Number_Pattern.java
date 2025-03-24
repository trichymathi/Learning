package patternProblems;

import java.util.Scanner;

public class HourGlass_Number_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=sc.nextInt();
	/*Pattern
5 5 5 5 5 
 4 4 4 4 
  3 3 3 
   2 2 
    1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 	
	 */
		
		/* Upper Part
		 i=1 space =0 n=5  i-1
		 i=2 space =1 n=5 
		 i=3 space =2 n=5 
		 i=4 space =3 n=5 
		 i=5 space =4 n=5 
		 */
		/*
		 i=1 window =5 n=5  n-i+1 = 5-1+1 =5
		 i=2 window =4 n=5  n-i+1 = 5-2+1 =4
		 i=3 window =3 n=5  n-i+1 = 5-3+1 =3 
		 i=4 window =2 n=5  n-i+1 = 5-4+1 =2 
		 i=5 window =1 n=5  n-i+1 = 5-5+1 =1
		 */
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++) {
				if(i==1) {
					System.out.print(n+" ");
				}else {
				System.out.print(n-i+1+" ");
				}
			}
			System.out.println();
		}
		
		/* Lower Part
		 i=1 space =3 n=5 n-i-1 = 5-1-1 =3
		 i=2 space =2 n=5 n-i-1 = 5-2-1 =2
		 i=3 space =1 n=5 n-i-1 = 5-3-1 =1
		 i=4 space =0 n=5 n-i-1 = 5-4-1 =0  
		 */
		/*
		 i=1 window =2 n=5  i+1 = 1+1 =2
		 i=2 window =3 n=5  i+1 = 2+1 =3
		 i=3 window =4 n=5  i+1 = 3+1 =4 
		 i=4 window =5 n=5  i+1 = 4+1 =5
		 */
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				if(i==n-1) {
					System.out.print(n+" ");
				}else {
				System.out.print(i+1+" ");
				}
			}
			System.out.println();
		}
		

	}

}
