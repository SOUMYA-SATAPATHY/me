package assignment12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeByGroupIndex 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();	}

}
