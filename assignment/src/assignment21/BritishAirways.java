package assignment21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BritishAirways 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.britishairways.com/");
		Thread.sleep(10000);
		driver.findElement( By.xpath("//button[.='Agree to all cookies']")).click();
		driver.findElement(By.xpath("//p[.='June']/..")).click();
		for(int i = 0;i<=2;i++)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@data-icon='']")).click();
		}
		driver.findElement(By.xpath("//span[.='23']")).click();
		driver.findElement(By.xpath("//div[@class='date-selection']")).click();
		for(int i = 0;i<=4;i++)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@data-icon='']")).click();
		}
		driver.findElement(By.xpath("//span[.='23']")).click();
		driver.close();

}

}
