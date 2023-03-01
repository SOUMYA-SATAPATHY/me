package assignment16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmericaAirline
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americanairlines.in/");
		//Thread.sleep(3000);
		WebElement listbox=driver.findElement(By.xpath("//select[@id='flightSearchForm.adultPassengerCount']"));
		WebElement listbox1=driver.findElement(By.xpath("//select[@id='flightSearchForm.childPassengerCount']"));
		Select sel=new Select(listbox);
		sel.selectByIndex(2);
		Select sel1=new Select(listbox1);
		sel1.selectByIndex(2);
	}

}
