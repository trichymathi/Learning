package learning;

public class Myclass {

//	static int a = 20;
//	   static int b = 30;
//	   static int c = 40;
//	   Myclass()
//	   {
//	      a = 200;
//	   }
//	   static void m1() {
//	      b = 300;
//	   }
//	   static {
//	      c = 400;
//	   }
//	   public static void main(String[] args) {
//		 //  Myclass newW= new Myclass();
//		  // m1();
//		   
//	      System.out.println(a);
//	      System.out.println(b);
//	      System.out.println(c);
//	   }
	
	
	private int x = 10;
	   static int m1()
	   {
	      Myclass obj = new Myclass();
	      int y = obj.x;
	      return y;
	   }
	   public static void main(String[] args) {
	      System.out.println(m1());
	   }
	   
	   
}
