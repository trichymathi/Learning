package learning;



public class ArrayWithObject {

	public static void main(String[] args) {
		
		Object arr[] = {"hari",1,null};
		String array[] = {"Dharshan", "Mathi", "Dharni kumar", "Mathi maraqn"};
		int max = array[0].length();
		String name ="";
		for(int i=0;i<array.length;i++) {
			if(array[i].length()>max) {
				max=array[i].length();
				System.out.println(max);
				name=array[i];
			}
			
		}
		System.out.println(name);
	}

}
