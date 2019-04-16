import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Work\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));
        Actions a=new Actions(driver);
        WebElement S= driver.findElement(By.id("draggable"));
        WebElement T= driver.findElement(By.id("droppable"));
        a.dragAndDrop(S, T).build().perform();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//*[@id='sidebar']/aside[1]/ul/li[4]/a")).click();
       System.out.println(driver.getTitle());

	}

}