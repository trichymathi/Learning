package learning;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test_01 {

	public static void main(String[] args) {
//		HashMap<String,String> map = new HashMap<String,String>();
//		map.put("name", "mathi");
//		map.put("citi", "trichy");
//		map.put("roll", "QA");
//		HashMap<String,String> map_01 = new HashMap<String,String>();
//		map_01.put("name", "Mathi");
//		map_01.put("citi", "trichy");
//		map_01.put("roll", "Dev");
//		
//		for(String l:map.keySet()) {
//			if(!map.get(l).equalsIgnoreCase(map_01.get(l))) {
//				System.out.println(l+" : "+map_01.get(l));
//			}
//		}
		
		List<Integer> list = Arrays.asList(1,2,3,6,4,0,8);
		
		int n= list.size();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(list.get(j)>list.get(j+1)) {
					int temp = list.get(j);
					list.set(j, j+1);
					list.set(j+1, temp);	
				}
			}
		}
		System.out.println(list);
		
		
		
		Integer max = Collections.max(list);
		System.out.println(max);
		
		
		
				String name = "mathimaran rajendran is a good boy";
				String vowel = "aeiou";
				char[] charName=name.toCharArray();
				char[] charVowel=vowel.toCharArray();
				HashMap<Character ,Integer> map = new HashMap<Character,Integer>();
				for(int i=0; i<charName.length; i++){
				    for(int j=0; j<charVowel.length; j++){
				        if(charName[i]==charVowel[j]){
				            System.out.println(charName[i]);
				            if(map.containsKey(charName[i])){
				                map.put(charName[i],map.get(charName[i])+1);
				            }else{
				             map.put(charName[i],1);   
				            }
				        }
				    }
			    }
			    System.out.println(map);
			    for(Character c:map.keySet()){
			        System.out.print(c+""+map.get(c));
			    }
			    }
}
