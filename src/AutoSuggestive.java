import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
		// Enter the letters BENG
		// Verify if Airport option is displayed in the suggestive box
	
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver_win32\\Chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://qaclickacademy.com/practice.php");
		WebElement stringText =driver.findElement(By.xpath("//*[@id='autocomplete']"));
		stringText.sendKeys("uni");
		Thread.sleep(2000);

		stringText.sendKeys(Keys.DOWN);

		System.out.println(stringText.getText());

		//Javascript DOM can extract hidden elements
		//because selenium cannot identify hidden elements - (Ajax implementation)
		//investigate the properties of object if it have any hidden text

		//JavascriptExecutor
		JavascriptExecutor js= (JavascriptExecutor)driver;

		String script = "return document.getElementById(\"autocomplete\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i =0;
		//BENGALURU INTERNATION AIPORT
		while(!text.equalsIgnoreCase("United States"))
		{
		i++;
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);

		text=(String) js.executeScript(script);
		System.out.println(text);
		if(i>8)
		{
		break;
		}

		}

		if(i>8)
		{
		System.out.println("United States is not found");
		}
		else
		{
		System.out.println("United States is found");
	
		}
		driver.close();
	}
	
}









