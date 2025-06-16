package leetCodeProblems;

public class Find_index_of_the_first_occurance_in_a_string {

	
	public static int strStr(String haystack, String needle) {
        int index=haystack.indexOf(needle);
        return index;
    }
	public static void main(String[] args) {
		System.out.println(strStr("sadbutsad","sad"));
		System.out.println(strStr("leetcode","leeto"));
	}

}
