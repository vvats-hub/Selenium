//regular expression
//rediff.com

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_case5 {

	public static void main(String[] args) {
		
		//exe location set in preperty
		
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
		
		//browser driver declare
		WebDriver driver = new ChromeDriver();	
		
		//browser driver use
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println("Current url : "+ driver.getTitle());
		
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("pass");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		System.out.println("Page error : "+ driver.findElement(By.cssSelector("div[id*='login_error']")).getText());
		//driver.close();
	}

}
