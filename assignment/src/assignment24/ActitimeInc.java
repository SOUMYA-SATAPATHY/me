package assignment24;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInc 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Set<String> windows=driver.getWindowHandles();
		//System.out.println(windows.size());
		ArrayList<String>al=new ArrayList<>();
	    al.addAll(windows);
	   // System.out.println(al.size());
	    for(int i=0;i<al.size();i++)
		{
	    	driver.switchTo().window(al.get(i));
			String actualtitle=driver.getTitle();
			if(actualtitle.contains("Time Tracking"))
			{
				System.out.println(driver.getTitle());
			}
			driver.switchTo().window(al.get(i));
			//driver.close();
		}
	    Thread.sleep(3000);
	    String s=driver.getCurrentUrl();
	 	System.out.println(s);
	    Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[class='button header__button']")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Soumya");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Satapathy");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("soumya@gmail.com");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("ss&co");
	    Thread.sleep(5000);
		//driver.close();
		for(int i=0;i<al.size();i++)
		{
			String actualtitle=driver.getTitle();
			if(actualtitle.contains("login"))
			{
				driver.switchTo().window(al.get(i));
				System.out.println(driver.getTitle());
			}
			   driver.switchTo().window(al.get(0));
			  // driver.close();
		}
		//driver.close();
	    String s1=driver.getCurrentUrl();
	 	System.out.println(s1);
	 	Thread.sleep(2000);
	 	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Logout")).click();
	}

}
