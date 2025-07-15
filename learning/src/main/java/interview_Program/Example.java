package interview_Program;



 

 
  class Example {
	  
private  void method1() {
	System.out.println("Method Private");
}

public void method02() {
	method1();
}

public static void main(String[] args) {
	Example ex=new Example();
	ex.method02();
}
 }

