package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooMailByXpath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create");
		driver.findElement(By.xpath("//input[@data-ylk='elm:input;elmt:fname;slk:first-name;mKey:fname']")).sendKeys("Soumya");
		driver.findElement(By.xpath("//input[@data-ylk='elm:input;elmt:lname;slk:last-name;mKey:lname']")).sendKeys("Satapathy");
		driver.findElement(By.xpath("//input[@data-ylk='elm:input;elmt:email;slk:email;mKey:email']")).sendKeys("ssatapathy333");
		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("soumya@333");
		driver.findElement(By.xpath("//input[@data-ylk='elm:input;elmt:birthyear;slk:birthyear;mKey:birthyear']")).sendKeys("1997");
		//driver.close();
	}

}
