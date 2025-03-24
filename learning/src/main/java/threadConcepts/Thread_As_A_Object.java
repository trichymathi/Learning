package threadConcepts;


class A2 implements Runnable{

	@Override
	public void run() {
      System.out.println("Runnable Class");
		
	}
	
}

public class Thread_As_A_Object  {

	public static void main(String[] args) {
		A2 a2 = new A2();
		// we are not able to create object for Runnable interface so we 
		// just creates an object for that implemented class A2 and insert the 
		// in the thread class ; thread class having constructor overloading 
		Thread thread = new Thread(a2);
		thread.start();
		
	}

}
