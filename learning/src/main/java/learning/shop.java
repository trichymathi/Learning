package learning;

public class shop {
	

	public void take() {
		System.out.println("This method going to take");
	}
	public void give() {
		int a =5;
		int b =5;
		int c =a+b;
		System.out.println("addition:"+ c);
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		shop mathi = new shop();
		shop nithya = new shop();
		 mathi.take();
		 nithya.give();
		
	}

}
