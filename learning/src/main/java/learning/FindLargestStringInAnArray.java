package learning;

public class FindLargestStringInAnArray {

	public static void main(String[] args) {
		 String Str[] = {"Maveric Systems Limited C" , "Chris Hardy" , "ram" , "Venkat raman", "Mohammad Yusuf", "Abc","Maveric Systems Limited"};
	       int max=Str[0].length();
	       String name=Str[0];
	       for(int i=1;i<Str.length;i++){
	           if(Str[i].length()>max){
	               max=Str[i].length();
	               name=Str[i];
	           }
	       }
	       System.out.println("The Largest String is : "+name);
		 
	}
}
