package testYentra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SecondTest {

	
	@Test
	public void funATest()
	{ 
		WebDriver driver;
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		if(browser.equals("chrome")) {
			driver= new ChromeDriver();
			driver.get(url);
			System.out.println(driver.getTitle());
		
		}else if(browser.equals("edge")){
			driver= new EdgeDriver();
			driver.get(url);
			System.out.println(driver.getTitle());
			
		}else {
			driver= new FirefoxDriver();
			driver.get(url);
			System.out.println(driver.getTitle());
		
		}
		
		
	}
	@Test
	public void funBTest()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println("amazon is displayd");
		
	}
	
	
	
}
