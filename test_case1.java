import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_case1 {

	public test_case1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

				//Selenium code
				
				//invoke .exe file to invoke browser
				System.setProperty("webdriver.chrome.driver","c:\\selenium\\chromedriver.exe");
				//step1 - create driver object for the browser being used
				//create driver object for chrome driver browser
				WebDriver driver = new ChromeDriver();
				driver.get("http://www.facebook.com");
				System.out.println("Title : " + driver.getTitle());
				/*driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
				driver.findElement(By.id("pass")).sendKeys("123456");
				driver.findElement(By.xpath("//*[@id='loginbutton']")).click();		*/
				
				driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
				driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234");
				driver.findElement(By.xpath("//button[@name='login']")).click();
				//driver.close();
	}

}
