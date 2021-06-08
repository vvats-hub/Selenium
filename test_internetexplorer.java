import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test_internetexplorer {

	public test_internetexplorer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

				//Selenium code
				
		//invoke .exe file to invoke browser
		System.setProperty("webdriver.ie.driver","c:\\selenium\\IEDriverServer.exe");
		//step1 - create driver object for the browser being used
		//IE browser
		//create driver object for IE browser
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		//we will strictly implement methods of Web Driver
		//as IE driver class implements WebDriver interface
	    System.out.println("Title : " + driver.getTitle());
	}

}
