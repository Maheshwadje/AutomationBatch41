package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_Pract1.class)
public class TestCase2
{
	@Test
	public void Test1()
	{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("Shoe");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
}
