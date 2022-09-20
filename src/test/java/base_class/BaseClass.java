package base_class;

import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	
	@BeforeMethod
	public void BrowserOpen() {
		
		System.out.println("browser open");
	}

	
	
	@BeforeMethod
	public void Close_Browser() {
		
		System.out.println("broswer close");
	}
}
