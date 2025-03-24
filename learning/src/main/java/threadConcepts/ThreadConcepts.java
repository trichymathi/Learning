package threadConcepts;



/*
 * Thread concepts should extend thread class , why it requires if we run main method 
 * it will run one after other example if create object for A and B and call the methods
 * it will run According to call eg:
class A{
	void Display() {
		for(int i=1;i<=10;i++) {
		System.out.println(" The class A");
		}
	}
}

class B{
	void Display() {
		for(int i=1;i<=10;i++) {
		System.out.println(" The class B");
		}
	}
}
main method :
A a  = new A();
		B b  = new B();
		a.Display();
		b.Display();
O/P
 The class A
 The class A
 The class A
 The class B
 The class B
 The class B
 * 
 * If I need to run the both A and B parellely there thread concept came it will help
 * to run both in at same time using thread class 
 * 
 * condition every thread class should present the method name as run so that it 
 * will consider and that only start method will know to run the thread since here
 * we need to use start method
 * 
 * 
 */




class A extends Thread{
	public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println("From A block");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

class B extends Thread{
	public void run() {
	for(int i=1;i<=10;i++) {
		System.out.println("From B block");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
public class ThreadConcepts {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
//		a.setPriority(2); // we can set priority in threads for our run
//		b.setPriority(10);
		a.start();
		b.start();
	}
}

