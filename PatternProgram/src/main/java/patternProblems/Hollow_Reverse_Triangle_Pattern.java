package patternProblems;

import java.util.Scanner;

public class Hollow_Reverse_Triangle_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int n = sc.nextInt();
	/*Pattern
	 
*********
 *     *
  *   *
   * *
    *
  
	 */	
		/*spaces
		 i=1 n=5 space =0  s=i-1 = 1-1 =0
		 i=2 n=5 space =1  s=i-1 = 2-1 =1
		 i=3 n=5 space =2  s=i-1 = 3-1 =2
		 i=4 n=5 space =3  s=i-1 = 4-1 =3
		 i=5 n=5 space =4  s=i-1 = 5-1 =4
		 */
		
		/*Window for Star
		 i=1 n=5 winLen =9  2*(n-i+1)-1 = 2*(5-1+1)-1 = 9
		 i=2 n=5 winLen =7  2*(n-i+1)-1 = 2*(5-2+1)-1 = 7 
		 i=3 n=5 winLen =5  2*(n-i+1)-1 = 2*(5-3+1)-1 = 5 
		 i=4 n=5 winLen =3  2*(n-i+1)-1 = 2*(5-4+1)-1 = 3 
		 i=5 n=5 winLen =1  2*(n-i+1)-1 = 2*(5-5+1)-1 = 1
		 */
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*(n-i+1)-1;j++) {
				if(i==1 || j==1 || j==2*(n-i+1)-1) {
					System.out.print("*");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
