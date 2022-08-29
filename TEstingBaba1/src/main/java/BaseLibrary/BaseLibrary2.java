package BaseLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLibrary2 
{
	public static WebDriver driver;
	public void getlaunch(String url)
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//*[text()='×']")).click();
	}

}
