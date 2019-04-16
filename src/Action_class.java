import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Action_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//*[@id='content']/a[2]")).click();
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='results']")));
				System.out.println(driver.findElement(By.xpath("//*[@id='results']")).getText());
	}

}
