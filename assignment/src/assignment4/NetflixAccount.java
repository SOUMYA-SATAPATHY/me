package assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixAccount 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.linkText("Sign up now")).click();
		driver.findElement(By.cssSelector("input[id='id_email_hero_fuji']")).sendKeys("ssatapathy333@gmail.com");
		driver.findElement(By.cssSelector("a[data-uia='header-login-link\']")).click();
		driver.findElement(By.cssSelector("input[data-uia='login-field']")).sendKeys("ssatapathy333@gmail.com");
		driver.findElement(By.cssSelector("input[data-uia='password-field']")).sendKeys("mu pherile tumara");
		driver.close();
	}

}
