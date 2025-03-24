package patternProblems;

import java.util.Scanner;

public class NumberSwappingPattern {

	
	/*
1 2 3 4 5 
2 3 4 5 1 
3 4 5 1 2 
4 5 1 2 3 
5 1 2 3 4 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = scan.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n;j++) {
				int k=i+j;
				if(k>n) {
					System.out.print(k-n+" ");
				}else {
				System.out.print(k+" ");
				}
			}
			System.out.println();

		}
		
		/*
		 i=1  numbers =5  (n-i+1) = 5-1+1 =5
		 i=2  numbers =4  (n-i+1) = 5-2+1 =4
		 i=3  numbers =3  (n-i+1) = 5-3+1 =3
		 i=4  numbers =2  (n-i+1) = 5-4+1 =2
		 i=5  numbers =1  (n-i+1) = 5-5+1 =1
		 */
		
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		/*
		 i=1  numbers =2  i+1 = 1+1 =2
		 i=2  numbers =3  i+1 = 2+1 =3
		 i=3  numbers =4  i+1 = 3+1 =4
		 i=4  numbers =5  i+1 = 4+1 =5
		 */
		
		for(int i =1;i<n;i++) {
			for(int j=1;j<=i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}

				
				
				
				
				
				
				
				
				
//				if(i>1) {
//				System.out.print(j+count);
//				}else if(i>1 && j==n) {
//					System.out.println(i);
//				}
//				else {
//					System.out.print(j);
//				}
//			count++;
//			
//		}
				
		