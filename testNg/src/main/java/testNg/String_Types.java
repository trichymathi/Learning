package testNg;

public class String_Types {

	public static void main(String[] args) {
		String name01 ="Sakthi";
//		name01.concat("Vel");
//		System.out.println(name01.concat("Vel"));
//		
//		int a =5;
//		int b=10;
//		a=a+b;
//		System.out.println(a);
		
		String name02 = "Sakthi";
		String name03 ="Sakthi";
		
		
//		name01=name02+name03;
		
		//mutable in this part
//		StringBuffer buffer = new StringBuffer(name01);
//		buffer.append(name02);
//		System.out.println(buffer);
		
		StringBuilder bulilder = new StringBuilder(name01);
		StringBuilder append=bulilder.append(name02);
		System.out.println(append);
		
		
	

	}

}
