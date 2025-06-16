package interview_Program;

public class Reverse_Largest_Word_In_The_String {

	public static void main(String[] args) {
		String name = "knowledge is power";
		String[] a = name.split(" ");
		int maxlength = a[0].length();
		String largestWord = a[0];
		int note = 0;
		String reverse = "";
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > maxlength) {
				maxlength = a[i].length();
				note = i;
			}
		}
		for (int j = 0; j < a.length; j++) {
			if (j == note) {
				char[] l = a[j].toCharArray();
				for (int k = l.length - 1; k >= 0; k--) {
					reverse = reverse + l[k];
				}
				reverse = reverse + " ";
			} else {
				reverse = reverse + a[j] + " ";
			}
		}
		System.out.println(reverse);
	}
}
