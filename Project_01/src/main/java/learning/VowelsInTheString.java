package learning;

public class VowelsInTheString {

	public static void main(String[] args) {
		String name ="mathimaran";
		String vowles = "aeiou";
		int count=0;
//		char[] arr=name.toCharArray();
//		char[] arr2=vowles.toCharArray();
//		int count=0;
//		
//		for(int i=0;i<name.length();i++) {
//			for(int j=0;j<vowles.length();j++) {
//				if(arr[i]==arr2[j]) {
//					System.out.println(arr[i]);
//					count++;
//				}
//			}
//		}	
		for(int i=0;i<name.length();i++) {
			for(int j=0;j<vowles.length();j++) {
				if(name.charAt(i)==vowles.charAt(j)) {
					System.out.println(name.charAt(i));
					count++;
				}
			}
	}
		System.out.println(count);
	}

}
