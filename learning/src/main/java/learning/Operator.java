package learning;

import java.math.BigDecimal;

public class Operator {

	public static void main(String[] args) {
	
		String number1 = "289077.23";
		String number2 = "52943";
		BigDecimal value = new BigDecimal(number1);
		BigDecimal constantValue = new BigDecimal("100");
		BigDecimal result =value.multiply(constantValue);
		long value2 = result.longValue();
		System.out.println(value2);
		BigDecimal value3 = new BigDecimal(number2);
		BigDecimal result1 =value3.multiply(constantValue);
		long value4 = result1.longValue();
		System.out.println(value4);
		
		
			
	}

}
