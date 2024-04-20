package testYentra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
			System.out.println("faceBook is chrome");
		}else if(browser.equals("edge")){
			driver= new ChromeDriver();
			driver.get(url);
			System.out.println(driver.getTitle());
			System.out.println("faceBook is edge");
		}else {
			driver= new ChromeDriver();
			driver.get(url);
			System.out.println(driver.getTitle());
			System.out.println("faceBook is firefox");
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
