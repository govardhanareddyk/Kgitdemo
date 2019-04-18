import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();
        
        while(!driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText().contains("Jun"))
        {
        	driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
        }
        
        List<WebElement> dates=driver.findElements(By.className("day"));
        int Count =driver.findElements(By.className("day")).size();
        for(int i=0;i<Count;i++)
        {
        String text=driver.findElements(By.className("day")).get(i).getText();
        if(text.equalsIgnoreCase("26"))
        	{
        	driver.findElements(By.className("day")).get(i).click();
        	break;
        		
        }
        
        }
	}
	
}
        
        
        
        

	


