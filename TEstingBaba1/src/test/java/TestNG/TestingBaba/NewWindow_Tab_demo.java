package TestNG.TestingBaba;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow_Tab_demo {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("first page :" +driver.getTitle());
		
		// open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("second page :"+ driver.getTitle());
		
		// for open new window
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		//get window handles for open window
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println("The output od set is :" +windowhandles);
		List<String> handles=new ArrayList<String>();
		System.out.println("the output of list is :" +handles);
		handles.addAll(windowhandles);
		
		
		//driver.close();// this close the facebook window
		driver.switchTo().window(handles.get(0 ));// switch to google */
		
	}

}
