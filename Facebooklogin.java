package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		//browser login 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yogen41\\Documents\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//login
		
		driver.findElement(By.id("email")).sendKeys("aaa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("aaa@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
