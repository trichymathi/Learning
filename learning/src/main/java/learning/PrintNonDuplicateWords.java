package learning;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class PrintNonDuplicateWords {

	public static void main(String[] args) {
		String name ="mathimaran rajendran";
		
		char[] charArray = name.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(Character c:charArray) {
			
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
			    map.put(c, 1);
			}
		}
		
		
	for(Character c:charArray) {
	if(map.get(c)==1) {
		System.out.println(c);
		}
}
}
}