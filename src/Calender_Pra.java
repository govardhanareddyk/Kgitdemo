import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Pra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//*[@id='datepicker1']")).click();
		while (!driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div[2]/div")).getText().contains("June"))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a/span")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("ui-state-default"));

		int count = driver.findElements(By.className("ui-state-default")).size();
		for (int i = 1; i < count; i++) {
			String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
			if (text.equalsIgnoreCase("24")) {
				driver.findElements(By.className("ui-state-default")).get(i).click();
				break;
			}
		}
	}

}
