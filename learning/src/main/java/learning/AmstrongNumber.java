package learning;

public class AmstrongNumber {

	
	static int amstrongNumber(int a) {
		int amstrong=a;
		int valueFinal = a;
		int count =0;
		double calc=0;
		while(a>0) {
			a=a/10;
			count++;
		}
		while(amstrong!=0) {
			double multi = Math.pow(amstrong%10, count);
			calc=calc+multi;
			amstrong=amstrong/10;
		}
		int amstrongNumber =(int) calc;
		System.out.println("The Number is : "+amstrongNumber);
		
		if(amstrongNumber==valueFinal) {
			System.out.println("Amstrong Number");
		}
		else {
			System.out.println("Not An Amstrong Number");
		}
		return amstrongNumber;
	}
	public static void main(String[] args) {
		amstrongNumber(1634);

	}

}
