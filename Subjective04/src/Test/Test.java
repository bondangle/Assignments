package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 5.	Create codes by navigating to https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose
i.	get data from all columns and all rows of the body of the table and print out
ii.	get data from third column of the body of table and print out
iii.	get data from third row of the body of table and print out

 */
public class Test {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000L));
		//a.	Navigate to https://echoecho.com/htmlforms10.htm
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody[1]/tr"));
		int numberOfRows = rows.size();
		System.out.println(numberOfRows);
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']/tbody[1]/tr[1]/td"));
		int numberOfColumns = columns.size();
		
		
		
		//printing whole table
		System.out.println("Printing out whole table: ");
		for(int i=1;i<=numberOfRows;i++)
		{
			for(int j=1;j<=numberOfColumns;j++)
			{
			
				String cell = "//table[@class='dataTable']/tbody[1]/tr[" + i + "]/td[" + j + "]";
				System.out.print(driver.findElement(By.xpath(cell)).getText() + " | ");
			}
			System.out.println();
		}
		
		
		
		//Printing 3rd column
		System.out.println("Printing out Third column: ");
		for (int k = 1;k<=numberOfRows;k++)
		{
			String column3 = "//table[@class='dataTable']/tbody[1]/tr[" + k + "]/td[3]";
			System.out.println(driver.findElement(By.xpath(column3)).getText());
		}
		
		
		//printing 3rd row
		System.out.println("Printing out Third row: ");
		for(int l=1;l<=numberOfColumns;l++)
		{
			String Row3 = "//table[@class='dataTable']/tbody[1]/tr[3]/td[" + l + "]";
			System.out.print(driver.findElement(By.xpath(Row3)).getText() + "|");
		}

	}

}
