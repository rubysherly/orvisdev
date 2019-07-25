package stepdefinition;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base {
	@Before
	public static void beforeMethod() {
		getDriver();
		loadUrl("https://www.orvis.com/");

	}

	@After
	public static void afterMethod() {
		closeBrowser();
		quitBrowser();
	}

}
