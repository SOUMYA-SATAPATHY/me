package assignment26;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String parentwindow= driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[.='Explore top companies hiring now']/..//a[.='Fortune 500']")).click();
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows.size());
		ArrayList<String>al=new ArrayList<>();
	    al.addAll(windows);
	    System.out.println(al.size());
	    for(int i=0;i<al.size();i++)
		{
	    	driver.switchTo().window(al.get(i));
			String actualtitle=driver.getTitle();
			if(actualtitle.contains("Fortune 500"))
			{
				System.out.println(driver.getTitle());
			}
		}
		Thread.sleep(2000);
	    driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		//driver.close();
	    String s=driver.getCurrentUrl();
	 	System.out.println(s);
		Thread.sleep(5000); 
		driver.findElement(By.xpath("//h2[.='Explore top companies hiring now']/..//a[.='MNCs']")).click();
		Set<String> windows1=driver.getWindowHandles();
		System.out.println(windows1.size());
		ArrayList<String>al1=new ArrayList<>();
		al1.addAll(windows1);
		System.out.println(al1.size());
		    for(int i=0;i<al1.size();i++)
			{
		    	driver.switchTo().window(al1.get(i));
				String actualtitle2=driver.getTitle();
				if(actualtitle2.contains("MNCs"))
				{
					System.out.println(driver.getTitle());
				}
			}
			Thread.sleep(2000);
		    driver.switchTo().window(parentwindow);
			System.out.println(driver.getTitle());				
			//driver.close();
		    String s1=driver.getCurrentUrl();
		 	System.out.println(s1);
			Thread.sleep(5000);
		 	driver.findElement(By.xpath("//h2[.='Explore top companies hiring now']/..//a[.='Unicorns']")).click();
		 	Set<String> windows2=driver.getWindowHandles();
			System.out.println(windows2.size());
			ArrayList<String>al2=new ArrayList<>();
			al2.addAll(windows2);
			System.out.println(al2.size());
			    for(int i=0;i<al2.size();i++)
				{
			    	driver.switchTo().window(al2.get(i));
					String actualtitle2=driver.getTitle();
					if(actualtitle2.contains("Unicorns"))
					{
						System.out.println(driver.getTitle());
					}
				}
				Thread.sleep(2000);
			    driver.switchTo().window(parentwindow);
				System.out.println(driver.getTitle());				
				//driver.close();
			    String s2=driver.getCurrentUrl();
			 	System.out.println(s2);
				Thread.sleep(5000);
			 	driver.findElement(By.xpath("//h2[.='Explore top companies hiring now']/..//a[.='Startups']")).click();
			 	Set<String> windows3=driver.getWindowHandles();
				System.out.println(windows3.size());
				ArrayList<String>al3=new ArrayList<>();
				al3.addAll(windows3);
				System.out.println(al3.size());
				    for(int i=0;i<al3.size();i++)
					{
				    	driver.switchTo().window(al3.get(i));
						String actualtitle3=driver.getTitle();
						if(actualtitle3.contains("Startups"))
						{
							System.out.println(driver.getTitle());
						}
					}
					Thread.sleep(2000);
				    driver.switchTo().window(parentwindow);
					System.out.println(driver.getTitle());				
					//driver.close();
				    String s3=driver.getCurrentUrl();
				 	System.out.println(s3);
					Thread.sleep(2000);
                    driver.quit();
	}

}
