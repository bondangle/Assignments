package Subjective;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*2.	Use Selenium WebDriver with Firefox Browser. Please do the following
a.	Navigate to https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en
b.	Use implicit and explicit wait to validate for page to load with title of the page
c.	Use explicit wait to validate for attribute value or text to be present for all elements being used in the automation script
d.	Print out the title of the landing page
e.	In the TP stories section, click on the first link.
f.	Switch to the tabbed window opened by clicking the link and get the title of the tabbed windows
g.	Close only the browser window of the landing page ; not the tabbed window.
 */
public class Subjective02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path + "\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000L));
		//a.	Navigate to https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en
		driver.get("https://news.google.com/home?hl=en-IN&gl=IN&ceid=IN:en");
		
		//b.	Use implicit and explicit wait to validate for page to load with title of the page
		String title = driver.getTitle();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20000L));
		w.until(ExpectedConditions.titleContains(title));
		
		//c.	Use explicit wait to validate for attribute value or text to be present for all elements being used in the automation script
		
		List<WebElement> menu = driver.findElements(By.xpath("//div[@role='menubar']/div"));
		
		for (int i=0;i<menu.size();i++)
		{
			w.until(ExpectedConditions.attributeContains(menu.get(i), "data-n-ini", String.valueOf(i)));
		}
		
		//d.	Print out the title of the landing page
		System.out.println("Page title of original window is " + driver.getTitle());
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/c-wiz[1]/div[1]/div[2]/main[1]/div[2]/c-wiz[1]/section[1]/div[2]/div[1]/div[2]/c-wiz[1]/c-wiz[1]/div[1]/article[1]/div[1]/a[1]")).click();
		
		String parent=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> I1 = s.iterator();
		while(I1.hasNext())
		{
			String child=I1.next();
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
			}			
		}
		System.out.println("Page title of new window is "+driver.getTitle());
		
		//driver.switchTo().defaultContent();
		driver.switchTo().window((String) s.toArray()[0]);
		
		driver.close();
	}

}
