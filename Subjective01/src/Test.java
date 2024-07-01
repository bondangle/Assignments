import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test {

	
	
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path + "\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000L));
		//a.	Navigate to https://echoecho.com/htmlforms10.htm
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		//b.	Use implicit and explicit wait to validate for page to load with title of the page
		String title = driver.getTitle();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20000L));
		w.until(ExpectedConditions.titleContains(title));
		
		//c.	Use explicit wait to validate for attribute value or text to be present for all elements being used in the automation script
		WebElement RadioMilk = driver.findElement(By.xpath("//td[@class='table5']/input[@type='radio' and @value='Milk']"));
		WebElement RadioButter = driver.findElement(By.xpath("//td[@class='table5']/input[@type='radio' and @value='Butter']"));
		WebElement RadioCheese = driver.findElement(By.xpath("//td[@class='table5']/input[@type='radio' and @value='Cheese']"));
		WebElement RadioWater = driver.findElement(By.xpath("//td[@class='table5']/input[@type='radio' and @value='Water']"));
		WebElement RadioBeer = driver.findElement(By.xpath("//td[@class='table5']/input[@type='radio' and @value='Beer']"));
		WebElement RadioWine = driver.findElement(By.xpath("//td[@class='table5']/input[@type='radio' and @value='Wine']"));
		w.until(ExpectedConditions.attributeToBe(RadioMilk, "value", "Milk"));
		w.until(ExpectedConditions.attributeToBe(RadioButter, "value", "Butter"));
		w.until(ExpectedConditions.attributeToBe(RadioCheese, "value", "Cheese"));
		w.until(ExpectedConditions.attributeToBe(RadioWater, "value", "Water"));
		w.until(ExpectedConditions.attributeToBe(RadioBeer, "value", "Beer"));
		w.until(ExpectedConditions.attributeToBe(RadioWine, "value", "Wine"));
		
		
		//a.	Create code to check for which radio button is selected by default among Water, Beer, Wine. You can use a loop
		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio' and contains(@name,'group2')]"));
		for (int i=0;i<radio.size();i++)
		{
			if(radio.get(i).isSelected())
			{
				System.out.println(radio.get(i).getAttribute("value") + " is selected.");
			}
		}
	
		//e.	Get the text /innertext /attribute value Water, Beer, Wine printed out in console. You can use a loop
			
		for (int j=0;j<radio.size();j++)
		{
			System.out.println(radio.get(j).getAttribute("value") + " -> Extracted from attribute value.");
			
		}

		
		//f.	Create a code to select radio button Water, Beer, Wine selected one after another in a loop. Take screenshot
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		for (int k=0;k<radio.size();k++)
		{
			radio.get(k).click();
			System.out.println(radio.get(k).getAttribute("value")+ " clicked.");
			StepScreenshot(driver,"radio");
		}
		driver.quit();
	}

	
public static void StepScreenshot(WebDriver driver, String stepName) {
		
		Date d = new Date();
		String t = d.toString().replace(":", "_").replace(" ", "_");
		try {
			//Common IO jar for Screenshot -->https://archive.apache.org/dist/commons/io/binaries/commons-io-2.15.1-bin.zip
			TakesScreenshot scr  = (TakesScreenshot) driver;
			//FILE means it will support png or jpg format
			//f1 is a temporary location
			File f1 = scr.getScreenshotAs(OutputType.FILE);
			//f2 is a permanent location
			File f2 = new File(System.getProperty("user.dir")+"\\StepScreenshot\\"+stepName+"_"+t+".png");
			FileUtils.copyFile(f1, f2);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
