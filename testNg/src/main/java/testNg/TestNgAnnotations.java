package testNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	@Test(groups = {"smoke"})
	void test01() {
		System.out.println("Test 01");
	}

	
	@Test(dataProvider = "loginData")
	public void dataProviderName(String userName,String password) {
		System.out.println(userName);
		System.out.println(password);
	}
	
	
	
	
	@DataProvider(parallel = true,indices = {0,2})
	public String[][] loginData(){
		String name[][]= {{"username1","password1"},
				{"username2","password2"},
				{"username3","password3"}
		};
		return name;	
	}
}
