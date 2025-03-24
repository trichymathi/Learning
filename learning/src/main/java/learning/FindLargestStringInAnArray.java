package learning;

public class FindLargestStringInAnArray {

	public static void main(String[] args) {
		 String Str[] = {"vivek" , "Chris Hardy" , "ram" , "Venkat raman", "Mohammad Yusuf", "Abc","Maveric Systems Limited"};
	       int max=Str[0].length();
	       String name="";
	       for(int i=1;i<Str.length;i++){
	           if(Str[i].length()>max){
	               max=Str[i].length();
	               name=Str[i];
	           }
	       }
	       System.out.println("The Largest String is : "+name);
		 
		 for(int i=0;i<Str.length;i++) {
			for(int j=1;j<Str.length;j++) {
				if(Str[i].length()>Str[j].length()) {
					name=Str[i];
				}
			}
		 }
		 System.out.println("The Largest String is : "+name);
	    }
}
