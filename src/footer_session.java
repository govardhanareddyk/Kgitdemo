import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class footer_session {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerelement=driver.findElement(By.id("gf-BIG"));
        System.out.println(footerelement.findElements(By.tagName("a")).size());
        
        WebElement childdriver= driver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
        System.out.println(childdriver.findElements(By.tagName("a")).size());
       for(int i=1;i<childdriver.findElements(By.tagName("a")).size();i++)
        {
        		String ClickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
        		childdriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLinkTab);
        }     // it will open all the windows
        		
        	Set<String> abc=driver.getWindowHandles();
        	Iterator<String> it=abc.iterator();
        	while(it.hasNext())
        	{
        		driver.switchTo().window(it.next())  ;
        	System.out.println(driver.getTitle());	
        	}
        		
        		
 

	}

}
