package testYentra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {

	@Test
	public void funATest()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("faceBook is displayd");
		
	}
	@Test
	public void funBTest()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println("amazon is displayd");
		
	}
	
	
	
}
