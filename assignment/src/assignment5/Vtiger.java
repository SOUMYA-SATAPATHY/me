package assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Soumya_Satapathy333");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("mu pherile tumara");
		//driver.close();
	}

}
