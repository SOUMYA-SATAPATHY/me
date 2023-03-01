package assignment22;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirAsiaCalender 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airasia.co.in/home");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='Round Trip']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@alt='logo'])[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//div[@data-date-value='1657737000000']")));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
	    js1.executeScript("arguments[0].click()",driver.findElement(By.xpath("//div[@data-date-value='1666895400000']")));
		//driver.findElement(By.xpath("//button[@class='btn-flight']")).click();
	    driver.close();



	}

}
