package learning;

import java.util.HashMap;
import java.util.HashSet;


public class PrintNonDuplicateWords {

	public static void main(String[] args) {
		String name ="mathimaran rajendran mathimaran rajendran mathi maran rajendran";
		
		
//		int value =name.replaceAll("\\s","").length();
//		
//		System.out.println(value);
		String[] split =name.split(" ");
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
//		char[] charArray = name.toCharArray();
		
		for(String l:split) {
			if(map.containsKey(l)) {
				map.put(l, map.get(l)+1);
			}else {
			map.put(l, 1);	
			}
		}
		System.out.println(map);
		
		HashSet<String> set = new HashSet<String>();
		String point="";
		for(String l:split) {
			if(map.get(l)>1) {
				set.add(l);
			}
		}
		System.out.println(set);
//		
//		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
//		
//		for(Character c:charArray) {
//			
//			if(map.containsKey(c)) {
//				map.put(c,map.get(c)+1);
//			}
//			else {
//			    map.put(c, 1);
//			}
//		}
//		
//		
//	for(Character c:charArray) {
//	if(map.get(c)==1) {
//		System.out.println(c);
//		}
//}
}
}