package testNg;

import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	@Test(groups = {"smoke"})
	void test01() {
		System.out.println("Test 01");
	}

}
