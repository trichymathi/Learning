package interview_Program;

public class Find_The_Largest_Repeated_Word_In_The_String {
	
	public static String letterCount(String str) {
		String[] split = str.split(" ");
		String repeatedWords="";
		for(String s:split) {
			char[] ch=s.toCharArray();
			for(int i=0;i<ch.length;i++) {
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]) {
						repeatedWords =repeatedWords+s+" ";
					}
				}
			}
		}
		String[] repeatedWordSplit =repeatedWords.split(" ");
		String maximumWord=repeatedWordSplit[0];
		int maximumWordLength=repeatedWordSplit[0].length();
		for(int i=0;i<repeatedWordSplit.length;i++) {
			int lengthOfEach=repeatedWordSplit[i].length();
			if(lengthOfEach>maximumWordLength) {
				maximumWordLength=lengthOfEach;
				maximumWord=repeatedWordSplit[i];
			}
		}
		if(maximumWord.isEmpty()) {
			return "-1";
		}else {
		return maximumWord;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(letterCount("Hello World Java to Mathimaran"));
	}

}
