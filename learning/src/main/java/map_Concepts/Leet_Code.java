package map_Concepts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Leet_Code {
	
	
	public static boolean isAnagram(String s, String t) {
	       char[] s_char=s.toCharArray(); 
	       char[] t_char=t.toCharArray();
	       TreeMap<Character,Integer> map_01= new TreeMap<Character,Integer>();
	       for(Character s1:s_char){
	        if(map_01.containsKey(s1)){
	            map_01.put(s1,map_01.get(s1)+1);
	        }else{
	            map_01.put(s1,1);
	        }
	       }
	 TreeMap<Character,Integer> map_02= new TreeMap<Character,Integer>();
	        for(Character s2:t_char){
	            if(map_02.containsKey(s2)){
	                map_02.put(s2,map_02.get(s2)+1);
	            }else{
	                map_02.put(s2,1);
	            }

	        }
	        System.out.println(map_01);
	        System.out.println(map_02);
	        
	        String name_01="";
	        String name_02="";
	        for(Character ch:map_01.keySet()){
	            
	            name_01=name_01+ch+""+map_01.get(ch);
	        }
	        for(Character ch:map_02.keySet()){
	            name_02=name_02+ch+""+map_02.get(ch);
	        }
	        System.out.println(name_01);
	        System.out.println(name_02);
	        boolean flag;
	        if(name_01.equals(name_02)){
	            flag=true;
	        }else{
	            flag=false;
	        }    
	       
	       return flag;
	    }
	
    public String largestWordCount(String[] messages, String[] senders) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        int numbers;
        for(String l:messages){
            numbers=l.split(" ").length;
            list.add(numbers);
        }
        System.out.println(list);
        TreeMap<String,Integer> map = new TreeMap<String,Integer>();
        for(int i=0;i<senders.length;i++){
        	if(map.containsKey(senders[i])) {
        		map.put(senders[i],map.get(senders[i])+list.get(i));
        	}else {
        		map.put(senders[i],list.get(i));
        	}
        }
        System.out.println(map);
        String maxValue_Word="";
        int maxValue=Integer.MIN_VALUE;
        int maxVlaue_02=Integer.MIN_VALUE;;
        for(Entry<String, Integer> e:map.entrySet()) {
        	if(e.getValue()>maxValue) {
        		maxValue=e.getValue();
        		maxValue_Word=e.getKey();	
        	}
        	else if(e.getValue()==maxValue) {
        		int len=e.getKey().length();
        		if(len>maxVlaue_02) {
            		maxValue=e.getValue();
            		maxValue_Word=e.getKey();	
            	}
        	}
        }
        System.out.println(maxValue_Word);
        return maxValue_Word;
    }
    
    public static int lengthOfLongestSubstring(String s) {
        char[] charter_n=s.toCharArray(); 
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        String longestSubString="";
        int longestLength=0;
        for(int i=0;i<charter_n.length;i++){
          if(!map.containsKey(charter_n[i])){
              map.put(charter_n[i],i);
          }else{
              i=map.get(charter_n[i]);
              map.clear();
          }
          if(map.size()>longestLength){
              longestLength=map.size();
              longestSubString=map.keySet().toString();
          }
        }
        return longestLength;
      }
    
    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer> ();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int num=map.get(s.charAt(s.length()-1));

        for(int i=s.length()-2;i>=0;i--){
            if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))){
                num=num+map.get(s.charAt(i));
            }else{

            	num=num-map.get(s.charAt(i));
            }
        }
        System.out.println(num);
        return num;
    }
    
   public static String longestCommonPrefix(String[] strs) {
        String name="";
        return name;
    }
   
   public static int strStr(String haystack, String needle) {
       char[] char_hayStack=haystack.toCharArray();
       char[] char_needle=needle.toCharArray();
       int count=0;
       int n=0;
       for(int i=0;i<char_hayStack.length;i++){
           for(int j=0;j<char_needle.length;j++){
               if(char_hayStack[i]==char_needle[j]){
                   count++;
               }
                if(count==needle.length()){
                   n=0;
               }else{
                   n=-1;
               }
           }
       }
       return n;
   }


	public static void main(String[] args) {
//		String array[]= {"flower","flow","flight"};
//		longestCommonPrefix(array);
		
		strStr("sadbutsad","sad");
		//lengthOfLongestSubstring("abcabcbb");
//		romanToInt("IV");
//		Leet_Code lc = new Leet_Code();
//		String[] array_01={"tP x M VC h lmD","D X XF w V","sh m Pgl","pN pa","C SL m G Pn v","K z UL B W ee","Yf yo n V U Za f np","j J sk f qr e v t","L Q cJ c J Z jp E","Be a aO","nI c Gb k Y C QS N","Yi Bts","gp No g s VR","py A S sNf","ZS H Bi De dj dsh","ep MA KI Q Ou"};
//		String[] array_02={"OXlq","IFGaW","XQPeWJRszU","Gb","HArIr","Gb","FnZd","FnZd","HArIr","OXlq","IFGaW","XQPeWJRszU","EMoUs","Gb","EMoUs","EMoUs"};
//		lc.largestWordCount(array_01,array_02);
//		System.out.println(isAnagram("xaaddy","xbbccy"));
	}

}
