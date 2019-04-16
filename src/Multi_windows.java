import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi_windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.findElement(By.xpath("//*[@id='privacy-link']")).click();
        System.out.println(driver.getTitle());
        Set<String>ids=driver.getWindowHandles();
     Iterator<String> it=ids.iterator();
        String Parentid=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        
        
        
        
	}

}
