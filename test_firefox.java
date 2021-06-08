import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test_firefox {

	public test_firefox() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

				//Selenium code
				
				//invoke .exe file to invoke browser
				System.setProperty("webdriver.gecko.driver","c:\\selenium\\geckodriver.exe");
				//step1 - create driver object for the browser being used
				//firefox browser
				//create driver object for firefox browser
				WebDriver driver = new FirefoxDriver();
				driver.get("http://www.google.com");
				//we will strictly implement methods of Web Driver
				//as firefox driver class implements WebDriver interface
			    System.out.println("Title : " + driver.getTitle());

	}

}
