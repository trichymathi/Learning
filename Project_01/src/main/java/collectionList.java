import java.util.*;

public class collectionList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//How to add
		list.add(100);
		list.add(200);
		list.add(100);
		
		System.out.println(list);
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(100);
		ArrayList<Integer> list1 = new ArrayList<Integer>(set);
//		list1.get(1);
		System.out.println(list1.get(1));
		int N =4;
		int a =N%2;
        if(a==0 && N>=2 && N<=5){
            System.out.println("Not Weird");
        }else if(a==0 && N>=6 && N<=20){
            System.out.println("Weird");
        }else if(a==0 && N>20){
            System.out.println("Not Weird");
        }else{
           System.out.println("Weird"); 
        }
		
	}

}
