package assignment11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FcaebookByGroupIndex 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		driver.findElement(By.xpath("(//input[@class='_8esa'])[3]")).click();
	}

}
