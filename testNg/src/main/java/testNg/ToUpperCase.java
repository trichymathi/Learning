package testNg;

public class ToUpperCase {

	public static void main(String[] args) {
		 String name ="compile and run your Java code online";
//		 String value =name.toUpperCase();
//		 System.out.println(value);
	        String[] split=name.split(" ");
	        String upperCaseName="";
	        for(String a:split){
	            String upperWord ="";
	            for(int i=0;i<a.length();i++){
	                if(i==1){
	                    char form =a.charAt(i);
	                    char character=Character.toUpperCase(form);
	                    upperWord=upperWord+character;
	                }else{
	                    upperWord=upperWord+a.charAt(i);
	                }
	            }
	            upperCaseName=upperCaseName+upperWord+" ";
	        }
	        System.out.println(upperCaseName);
	    }

}

