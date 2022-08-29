
package TestNG.TestingBaba;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow_demo1 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com/");
		System.out.println("First page title is :" +driver.getTitle());
		
		//then switch to new TAB
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.facebook.com/");
		System.out.println("Second page title is :"+driver.getTitle());
		
		Set<String> handles=driver.getWindowHandles();
		List<String> ls= new ArrayList<String>(handles);
		
		String parentWindowId=ls.get(0);
		String childWindowId=ls.get(1);
		
		System.out.println(parentWindowId);
		System.out.println(childWindowId);
		
		driver.close();//this close the child Tab
		
		driver.switchTo().window(parentWindowId);
		System.out.println("After switch back to parent windown :"+driver.getTitle());
				

	}

}
