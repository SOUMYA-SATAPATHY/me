package assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramByXpath
{
	public static void main(String[] args) throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']")).sendKeys("7377164377");
		driver.findElement(By.xpath("//input[@aria-label='Full Name']")).sendKeys("Soumya Satapathy");
		driver.findElement(By.xpath("//input[@aria-label='Username']")).sendKeys("Soumya_Satapathy333");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mu pherile tumara");
		Thread.sleep(1000);
		driver.close();
	}

}
