package learning;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Firstprogram {
	

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions()
				.setHeadless(false)
				.setChannel("webkit"));
//		Browser browser = playwright.firefox().launch(
//				new BrowserType.LaunchOptions()
//				.setHeadless(false)
//				.setChannel("firefox")
//				);
		Page page = browser.newPage();
		page.navigate("https://playwright.dev/java/docs/intro");
		System.out.println(page.url());
		System.out.println(page.title());
		page.close();
		browser.close();
		playwright.close();
	}
}
