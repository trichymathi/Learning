package learning;

import java.util.*;

public class TreeSetNew {

	public static void main(String[] args) {
		String arr[] = {"java","python","C"};
		TreeSet<String> treeSet = new TreeSet<String>();
		for(String value :arr) {
			treeSet.add(value);
		}
		Iterator<String> it = treeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}	
	}

}
