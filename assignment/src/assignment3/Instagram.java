package assignment3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[aria-label='Mobile Number or Email']")).sendKeys("7377164377");
		driver.findElement(By.cssSelector("input[aria-label='Full Name']")).sendKeys("Soumya Satapathy");
		driver.findElement(By.cssSelector("input[aria-label='Username']")).sendKeys("Soumya_Satapathy333");
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("mu pherile tumara");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
	    File ramloc=ts.getScreenshotAs(OutputType.FILE);
	    File destloc=new File("./photo/instagram.png");
	    FileUtils.copyFile(ramloc, destloc);
	    
	    
		driver.close();
	}

}
