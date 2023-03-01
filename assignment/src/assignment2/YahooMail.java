package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooMail 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		driver.findElement(By.cssSelector("input[aria-label='First name']")).sendKeys("Soumya");
		driver.findElement(By.cssSelector("input[data-ylk='elm:input;elmt:lname;slk:last-name;mKey:lname']")).sendKeys("Satapathy");
		driver.findElement(By.cssSelector("input[data-ylk='elm:input;elmt:email;slk:email;mKey:email']")).sendKeys("ssatapathy333");
		driver.findElement(By.cssSelector("input[data-ylk='elm:input;elmt:password;slk:password;mKey:password']")).sendKeys("soumya@333");
		driver.findElement(By.cssSelector("input[placeholder='YYYY']")).sendKeys("1997");
		driver.close();
	}

}