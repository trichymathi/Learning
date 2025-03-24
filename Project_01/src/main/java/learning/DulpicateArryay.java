package learning;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class DulpicateArryay {
	
	static void getMethodForCountOccurance(String name) {
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		char[] character=name.toCharArray();
		
		for(char c : character) {
			
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
//		//for Extra
//		String name1="";
//		for(char c:character) {
////			//Unique Values
////		if(map.get(c)==1) {
////			System.out.println(c);
////		}
////		    //Duplicate Values
//			
//		if(map.get(c)>=2) {
//			name1=name1+c;
//		}
//		}
//		System.out.println(name1);
		
		System.out.println(name+" : "+map);
		
		
	}
	
	
	public static int[] twoSum(int[] nums, int target)  {
        
		 int[] arr = new int[2];
	        for(int i=0;i<nums.length;i++){
	            for(int j=i+1;j<nums.length;j++){
	                int sum =nums[i]+nums[j];
	          if(sum==target){
	             arr[0]=i;
	        	 arr[1]=j;
	        	 System.out.print(arr[0]);
	        	 System.out.print(arr[1]);
	        	 break;
	           } 
	            } 
	        }
	        return arr;
	    }
    
	static void getMethodForCountOccuranceOfNumbersInArray() {
		int a[]= {7,3,2,9,0,6,7,3,1,2,9,0,6,4,8,5,1};
		
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		//occurance 
		for(int value:a) {
			if(map.containsKey(value)) {
				map.put(value, map.get(value)+1);
			}else {
				map.put(value, 1);
			}
			
		}
		//for Extra
		for(int value:a) {
//			//Unique Values
//		if(map.get(value)==1) {
//			System.out.println(value);
//		}
//		    //Duplicate Values
//		if(map.get(value)==2) {
//			System.out.println(value);
//		}
		}
		System.out.println(map);
//		          
//		int[] freq = new int[a.length]; // Create New Empty Array 
//		           //{0,0,0,0,0,-1,0,0,0,0,0,0,0,0,0,0}
//		for(int i=0;i<a.length;i++) {
//			int count =1;
//			 for(int j=i+1;j<a.length;j++) {
//				 if(a[i]==a[j]) {
//					 count++;
//					 freq[j]=-1;
//				 }
//			 } 
//			 if(freq[i]!=-1) {
//				 freq[i]=count;
//			 }
//			 System.out.println(freq[i]);		
//			 }
//		for(int i=0;i<freq.length;i++) {
//			if(freq[i]!=-1) {
//				System.out.println(a[i]+" appeared "+freq[i]);
//			}
//		}
		
	}
	
	public static boolean isPalindrome(int x) {
//        int rev =0;
//        int orgNum =x;
//        while(x>0){
//            rev = rev*10 + x%10;
//            x=x/10;
//        }
//        System.out.println(rev);
//        
//       if(orgNum==rev) {
//    	   System.out.println(true);
//    	   return true;
//       }
//       else {
//    	   System.out.println(false);
//    	   return false;
//       }
       
       StringBuffer value = new StringBuffer(String.valueOf(x));

       StringBuffer reverseValue=value.reverse();

       if(value.equals(reverseValue)){
    	   System.out.println(true);
           return true;
          
       }else{
    	   System.out.println(false);
           return false;
          
       }
        
}
	public static int removeDuplicates(int[] nums) {
	    LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();
	    for(int a:nums){
	        hashSet.add(a);
	    }
	    System.out.println(hashSet);
	    int k=hashSet.size();
	    System.out.println(k);
	    return k;
	    }

	public static void main(String[] args) {
		
//		int count =0;
//		getMethodForCountOccurance("test");
//		getMethodForCountOccurance("MathiMaran");
//		getMethodForCountOccuranceOfNumbersInArray();
		int arr[]= {0,0,1,1,1,2,2,3,3,4};
//		twoSum(arr, 6);
		isPalindrome(-16461);
		removeDuplicates(arr);
		
	}
}
		

	


