package assignment18;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeWorkName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[.='Types of Work']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
        driver.findElement(By.id("name")).sendKeys("qspider");
        driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
        Alert alt=driver.switchTo().alert();
        alt.accept();
      //driver.findElement(By.linkText("Logout")).click();
	}

}
