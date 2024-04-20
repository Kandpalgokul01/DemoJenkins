package testYentra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainTest {

	@Test
	public void firstTest() {
		
		System.out.println("Hi I am here ");
	}
	
	@Test
	public void secondTest() throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		
		WebElement fram1=driver.findElement(By.xpath("(//iframe[@class=\"w-full h-96\"])[1]"));
		driver.switchTo().frame(fram1);
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("heelo");
		
		driver.switchTo().parentFrame();
		
		WebElement fram2=driver.findElement(By.xpath("(//iframe[@class=\"w-full h-96\"])[2]"));

		driver.switchTo().frame(fram2);
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("heelo");
		
	}
}
