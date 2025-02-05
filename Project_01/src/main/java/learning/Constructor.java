package learning;



public class Constructor {
	
	//Constructor 
	public Constructor(){ 
		System.out.println("Not Over Load Constructor");
	}

//	//Constructor Over Loading
	public Constructor(String name) {   
		System.out.println(name);
	}


	public static void main(String[] args) {
		Constructor construct1 = new Constructor();
		Constructor construct = new Constructor("Over Load Constructor");

	}

}
