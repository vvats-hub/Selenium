//custom css

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_case4 {

	public static void main(String[] args) {
		
		//exe location set in preperty
		
		System.setProperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
		
		//browser driver declare
		WebDriver driver = new ChromeDriver();	
		
		//browser driver use
		driver.get("https://login.salesforce.com/");
		System.out.println("Current url : "+ driver.getTitle());
		
		driver.findElement(By.cssSelector("*[type='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("pass");
		driver.findElement(By.cssSelector("*[id='Login']")).click();
		System.out.println("Page error : "+ driver.findElement(By.cssSelector("#error")).getText());
		//driver.close();
	}

}
