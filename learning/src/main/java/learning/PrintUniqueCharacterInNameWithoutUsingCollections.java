package learning;

import java.util.Scanner;

public class PrintUniqueCharacterInNameWithoutUsingCollections {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scan.nextLine();
		char[] ch = name.toLowerCase().toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			if (ch[i] == '0') {
				continue;
			}
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '0';
				}
			}
			if (count == 1) {
				System.out.println(ch[i] + " : " + count);
			}
		}
	}

}
