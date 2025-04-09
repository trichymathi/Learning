package map_Concepts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Concepts {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 1);
		map.put(2, 1);
		map.put(3, 1);
		map.put(4, 1);
		
		System.out.println(map.get(1));
		
		//if you not specify the data type it will not create Wraper class
		Set<Integer> keySet = map.keySet();
		
		System.out.println(keySet);
		
		
		Collection<Integer> values = map.values();
		
		System.out.println(values);
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		
		System.out.println(entrySet);
		
		int size=entrySet.size();
		System.out.println(size);
		
		
		
		
	}

}
