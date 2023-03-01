package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookNewAccount
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='First name']")).sendKeys("Soumya");
		driver.findElement(By.cssSelector("input[aria-label='Surname']")).sendKeys("Satapathy");
		driver.findElement(By.cssSelector("input[aria-label='Mobile number or email address']")).sendKeys("7377164377");
		driver.findElement(By.cssSelector("input[data-type='password']")).sendKeys("mu pherile tumara");
		//driver.close();
	}

}
