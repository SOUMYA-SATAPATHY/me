package assignment23;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SingaporeAirlineHandle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.singaporeair.com/");
		driver.findElement(By.xpath("//div[.='ACCEPT']")).click();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//input[@class='form_field form_input--text ref--start validate datepicker-input']")));
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@readonly='readonly'])[4]/../../../..//li[@date-data='2022-06-17']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='returnDate1']")).click();
		//Thread.sleep(3000);
		for(int i = 0;i<=4;i++)
		{
			driver.findElement(By.xpath("//a[@class='right']")).click();
		}
		driver.findElement(By.xpath("(//div[@class='months-text'])[2]/../../..//li[@date-data='2022-11-18']")).click();
		   JavascriptExecutor js1 = (JavascriptExecutor)driver;
		    js1.executeScript("arguments[0].click()",driver.findElement(By.xpath(("//button[@class='btn-primary']"))));
		    driver.close();
	}
	}

