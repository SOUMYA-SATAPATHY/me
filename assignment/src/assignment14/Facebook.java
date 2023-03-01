package assignment14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		WebElement listbox=driver.findElement(By.xpath("//select[@title='Day']"));
		WebElement listbox1=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement listbox2=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sel=new Select(listbox);
		sel.selectByIndex(5);
		Select sel1=new Select(listbox1);
		sel1.selectByIndex(4);
		Select sel2=new Select(listbox2);
		sel2.selectByIndex(25);
	}

}
