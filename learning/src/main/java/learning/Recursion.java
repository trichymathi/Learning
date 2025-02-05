package learning;

public class Recursion {
	
	 static int fact(int n){
		 if(n==0) {
			return 1; 
		 }else {
			 return n*fact(n-1);
		 }	
	}
	  static int factorial() {
		 int n =5;
		 int a=1;
		 for(int i =n;i>0;i--) {
			 a = a*i; //a=1*5-->a=5//a=5*4-->a=20//a=20*3-->a=60//a=60*2-->a=120//a=120*1-->a=120
		 }
		 System.out.println(a);
		 return a;
	 }
	public static void main(String[] args) {
		int n = 5;
		System.out.println(fact(n));
		factorial();

	}

}
