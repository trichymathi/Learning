package patternProblems;

import java.util.Scanner;

public class Pattern_From_Zoho {

/*
 *    1  2  3  4
 *   8  7  6  5
 *  9  10  11  12
 *16  15  14  13	
 */
	static void pattern(int n) {
		
		/*
		 * i=1 space =3 n-i = 4-1 =3
		 * i=2 space =2 n-i = 4-2 =2
		 * i=3 space =1 n-i = 4-3 =1
		 * i=4 space =0 n-i = 4-4 =0
		 */
		/*
		 * i=1 w=4  n=4
		 * i=2 w=4
		 * i=3 w=4
		 * i=4 w=4 
		 */
		int k=1;
		int multiply=0;
		for(int i=1;i<=n;i++) {	
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n;j++) {
				if(i%2==0) {
					int form=k+3-multiply;
					System.out.print(form +"  ");
					multiply=multiply+2;
				}else {
				System.out.print(k +"  ");
				}
				k++;
			}
			System.out.println();
			System.out.println();
			multiply=0;
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int patternNumber = sc.nextInt();
		pattern(patternNumber);
	}

}
