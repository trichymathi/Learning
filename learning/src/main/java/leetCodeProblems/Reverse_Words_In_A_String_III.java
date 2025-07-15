package leetCodeProblems;

public class Reverse_Words_In_A_String_III {
	
	public static String reverseWords(String s) {
        String reverseWord="";
        String[] split=s.split(" ");
        for(int j=0;j<split.length;j++){
            char[] ch=split[j].toCharArray();
            String reverseEachString="";
            for(int i=ch.length-1;i>=0;i--){
                reverseEachString=reverseEachString+ch[i];
            }
            if(split[j]==split[split.length-1]){
                reverseWord=reverseWord+reverseEachString;
            }else{
            reverseWord=reverseWord+reverseEachString+" ";
            }
        }
        return reverseWord;
    }

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest Word"));
	}

}
