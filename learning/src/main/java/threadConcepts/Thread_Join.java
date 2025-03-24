package threadConcepts;

/*
 * Since we have main method its an main thread if you run that in the first
 * so if i need to get the values from the method in thread like we updated j=50
 * it will return 0 because main thread will run and close it will not check 
 * whether the other threads runed or not to over come this issue join method 
 * here placing important role.
 * class A1 extends Thread{
	int j=0;
	public void run() {
		j=50;
	}
}


public class Thread_Join {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.start();
		System.out.println(a1.j);
	}
	O/P
	0
 */



class A1 extends Thread{
	int j=0;
	public void run() {
		j=50;
	}
}


public class Thread_Join {

	public static void main(String[] args) throws InterruptedException {
		A1 a1 = new A1();
		a1.start();
		a1.join(); // this will help to join  inner threads with main thread
		System.out.println(a1.j);
		//O/P --> 50
	}

}
