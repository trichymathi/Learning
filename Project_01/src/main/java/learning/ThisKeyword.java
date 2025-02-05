package learning;





public class ThisKeyword {
	
	String name;
	
	void getName(String name) {
		this.name = name;
		System.out.println(name);
	}

	public static void main(String[] args) {
		ThisKeyword key = new ThisKeyword();
		key.getName("Mathi");
		System.out.println(key.name);
	}

}
