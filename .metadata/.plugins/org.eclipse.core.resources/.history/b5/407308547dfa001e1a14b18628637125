package practiseselenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFC 
{

	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://netportal.hdfcbank.com/login#/openMarketLoginCC");
		driver.manage().window().maximize();
		
		WebElement UserID = driver.findElement(By.id("openMarketUID"));
		UserID.sendKeys("786945");
		
		WebElement Pass = driver.findElement(By.id("keyboard"));
		Pass.sendKeys("Mahi@123");
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		
		File DestFile=new File("C:\\temp\\screenshot.png");
		
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
