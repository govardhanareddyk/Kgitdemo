import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columnDetails = footerdriver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		System.out.println(columnDetails.findElements(By.tagName("a")).size());

		for (int i =1;i<columnDetails.findElements(By.tagName("a")).size();i++)
		{
			String clickoncolumnTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDetails.findElements(By.tagName("a")).get(i).sendKeys(clickoncolumnTab);
			Thread.sleep(5000L);
		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it= abc.iterator();
       while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			System.out.println(driver.getTitle());
			System.out.println(driver.getTitle());
			
		}

	
	}
}
