package learning;

import java.util.HashMap;

public class ReverseAWordInStringUsingHashMap {
	
	static void reverseAWordInString(String word) {
		String[] split =word.split(" ");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		String rev ="";
		for(int i=split.length-1;i>=0;i--) {
			map.put(i,split[i]);
		}
		System.out.println(map);
		for(int j=split.length-1;j>=0;j--) {
			if(j==0) {
				rev = rev+map.get(j);
			}else {
				rev = rev+map.get(j)+" ";	
			}
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		reverseAWordInString("Welcome To Java World");
	}

}
