package assignment15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiTimeSetting
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
        driver.findElement(By.xpath("//a[@href='/administration/btlist.do']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
		WebElement listbox=driver.findElement(By.xpath("//select[@name=\"active\"]"));
        Select sel=new Select(listbox);
		sel.selectByVisibleText("archived");
        driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.xpath("(//input[@class='exitconfirmbutton'])[2]")).click();
	}
}
