package learning;

import java.util.*;
public class ReplacingSpecialCharactersAndNumbersInStringWithoutUsingReplace {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Word");
		String name = scan.nextLine();
		char[] ch=name.toCharArray();
		String removedString="";
		for(Character c:ch) {
//			if(Character.isLetter(c)) {
//				removedString=removedString+c;
//			}
			if(c >='a'&& c <= 'z' || c >='A'&& c <= 'Z') {
				removedString=removedString+c;
			}
		}
		System.out.println("The Word With Only Letters : "+ removedString);
	}

}
