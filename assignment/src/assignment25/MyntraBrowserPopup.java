package assignment25;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyntraBrowserPopup 
{
	public static void main(String[] args) throws InterruptedException 
{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		WebElement beauty= driver.findElement(By.xpath("//a[.='Beauty']"));
		Actions act=new Actions(driver);
		act.moveToElement(beauty).perform();
		WebElement eyeliner=driver.findElement(By.xpath("//a[.='Eyeliner']"));
		act.click(eyeliner).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='AYA']/../..//div[@class='common-checkboxIndicator']")).click();
		driver.findElement(By.xpath("//span[.='Color']/../..//span[@data-colorhex='multi']")).click();
		driver.findElement(By.xpath("(//div[@class='product-productMetaInfo']/../../..//span[@class='product-discountedPrice'])[1]")).click();
		Set<String> windows=driver.getWindowHandles();
		ArrayList<String>al=new ArrayList<>();
	    al.addAll(windows);
	    for(int i=0;i<al.size();i++)
		{
	    	//driver.switchTo().window(al.get(i));
			String actualtitle=driver.getTitle();
			if(actualtitle.contains("Buy AYA"))
			{
				System.out.println(driver.getTitle());
			}
			driver.switchTo().window(al.get(i));
//			String s=driver.getCurrentUrl();
//		 	System.out.println(s);	
		}
		Thread.sleep(5000);
		WebElement price = driver.findElement(By.xpath("//strong[.='Rs. 525']"));
		System.out.println(price.getText());
		WebElement percentage = driver.findElement(By.xpath("(//span[.='(38% OFF)'])[1]"));
		System.out.println(percentage.getText());
        driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
        driver.findElement(By.xpath("//span[.='Bag']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[.='ENTER PIN CODE']")).click();
        driver.findElement(By.cssSelector("input[placeholder='Enter Pincode']")).sendKeys("752001");
        driver.findElement(By.xpath("//div[@class='checkDelivery-base-checkBtn checkDelivery-base-valid']")).click();
        driver.findElement(By.xpath("(//div[.='PLACE ORDER'])[1]")).click();
		Thread.sleep(2000);
        driver.quit();
        
		

}
}

