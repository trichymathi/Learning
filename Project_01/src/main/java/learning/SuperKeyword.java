package learning;

//super keyword will be in default when it extends with parent class when it will use if the parent class also having constructor with parametes we can pass with help of superkeyword
class Parent {
	
	Parent(String name){
		
		System.out.println("Parent Class");
		System.out.println(name);
	}
}

public class SuperKeyword extends Parent {
	
	SuperKeyword(){
		super("Using Super Class with constructor 1");
//		super();
		System.out.println("Not Over Load Constructor");
		
	}
	
	SuperKeyword(String name){
		super("Using Super Class with constructor 2");
		System.out.println(name);
	}

	public static void main(String[] args) {
		SuperKeyword construct1 = new SuperKeyword();
		SuperKeyword construct = new SuperKeyword("Over Load Constructor");

	}

}
