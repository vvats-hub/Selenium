import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class intro_class {
	

	public intro_class() {
		// TODO Auto-generated constructor stub
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Selenium code
		
		//invoke .exe file to invoke browser
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		//step1 - create driver object for the browser being used
		//Chrome browser
		//create driver object for chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//we will strictly implement methods of Web Driver
		//as ChromeDriver class implements WebDriver interface
	    System.out.println("Title : " + driver.getTitle());
	    System.out.println("url: " + driver.getCurrentUrl());
	    if(driver.getCurrentUrl().equalsIgnoreCase("https://www.google.com/?gws_rd=ssl"))
	    {
	    	System.out.println("-----url validated------");
	    }
	    else
	    {
	    	System.out.println("----Invalid url");
	    }

	    //System.out.println(driver.getPageSource());	
	    driver.get("http://yahoo.com");
	    System.out.println("Current url : "+driver.getTitle());
	    driver.navigate().back();
	    System.out.println("Current url : "+driver.getTitle());
	    driver.close(); //closes the driver
	}

}
