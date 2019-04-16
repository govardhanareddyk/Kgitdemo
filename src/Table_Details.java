
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.cricbuzz.com/live-cricket-scorecard/20795/nz-vs-ban-2nd-test-bangladesh-tour-of-new-zealand-2019");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int tablecolumn = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"))
				.size();

		for (int i = 0; i < count - 2; i++) {
			String suminteger = table
					.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
					.getText();
			int value = Integer.parseInt(suminteger);
			sum = sum + value;

		}
		//System.out.println(sum);

	  String Extras= driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	 int totalValue= Integer.parseInt(Extras);
	int  TotalScore=sum+totalValue;
	 System.out.println(TotalScore);
	 
		 String actualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalValue=Integer.parseInt(actualTotal);
		
	if(ActualTotalValue==TotalScore)
	{
		System.out.println("Hip hip Hurrrrrrrrrrrrrrrry");
	}
	else
	{
		System.out.println("Better luck next time");
}
	}

}
