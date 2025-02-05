package learning;

public class First_Program_learn {
 static String name ="Sakthi";
	
	public static void nameOfHari(String lastName) {
		lastName=name+lastName;
		System.out.println(lastName);	
	}
	public  void nameOfAnanth() {
//		name = "Ananth";
		System.out.println(name);
	}

	public static void main(String[] args) {
		First_Program_learn program = new First_Program_learn();
		
		
		//program.nameOfAnanth();
		nameOfHari("Vanitha");
		program.nameOfAnanth();
		
		
	}
	
}
