package leetCodeProblems;

public class Reverse_A_String {
	
	public static void reverseString(char[] s) {
     int i=0;
     int j=s.length-1;
     while(j>i){
         char temp =s[j];
         s[j]=s[i];
         s[i]=temp;
         i++;
         j--;
     }
     System.out.println(s);
	}

	public static void main(String[] args) {
		char s[] = {'h','e','l','l','o'};
		reverseString(s);

	}

}
