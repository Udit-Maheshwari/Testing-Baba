package testing_baba_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import BaseLibrary.BaseLibrary2;
import ExcelUtility.ExcelUtlity;

public class TestingBaba_Main_Page extends BaseLibrary2
{
	String contactpath="C:\\Users\\Asus\\eclipse-workspace\\TEstingBaba1\\Excel\\Testing baba contact page.xlsx";
	public TestingBaba_Main_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='nav-item active']//a[@class='nav-link']")
	private WebElement Home;
	
	@FindBy(xpath="//a[normalize-space()='About']")
	private WebElement About;
	
	@FindBy(xpath="//a[@id='navbarDropdownMenuLink']")
	private WebElement Courses;
	
	@FindBy(xpath="//a[contains(text(),'Services')]")
	private WebElement Services;
	
	@FindBy(xpath="(//a[.='Practice'])[1]")
	private WebElement Practice;
	
	@FindBy(xpath="//a[text()='Placement']")
	private WebElement placement;
	
	@FindBy(xpath="//a[text()='Online Registration']")
	private WebElement OnlineRegistration;
	
	@FindBy(xpath="//a[text()='Event']")
	private WebElement Event;
	
	@FindBy(xpath="//a[text()='Contact']")
	private WebElement Contact;
	
	@FindBy(xpath="//h4[text()='New Batch']")
	private WebElement NewBatch;
	
	@FindBy(xpath="//a[@id='enroll']")
	private WebElement RegisterNow;
	
	@FindBy(xpath="//h2[@class='heading-agileinfo']")
	private WebElement Heading;
	
	@FindBy(xpath="//div[@class='coursesLinks mb-12']")
	private WebElement CourseLink;
	
	@FindBy(xpath="//div[@class='rightContent']")
	private WebElement EmailUsOn;
	
	@FindBy(xpath="//a[text()='View ALL']")
	private WebElement ViewAll;
	
	
	public void clickonHome() throws InterruptedException
	{
		Thread.sleep(2000);
		Home.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='×']")).click();
	}
	
	public void clickonAbout() throws InterruptedException
	{
		Thread.sleep(3000);
		About.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	public void clickonCourses() throws InterruptedException
	{
		Thread.sleep(2000);
		Courses.click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Software Automation Testing')]"));
		Thread.sleep(2000);
		Actions action= new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		String Expected=driver.findElement(By.xpath("//li//a[text()='Software Testing']")).getText();
		System.out.println("text of Software automation testing is :" +Expected);
		Thread.sleep(2000);
		Assert.assertEquals("Software Testing", Expected);
	}
	
	public void validateCourses() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions action= new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Programming Languages ')]"))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='C,C++ Data Structure']"))).build().perform();
		Thread.sleep(2000);
		String Expected=driver.findElement(By.xpath("//a[text()='Data Structure']")).getText();
		System.out.println("Expected output is :" +Expected);
		Thread.sleep(2000);
		Assert.assertEquals("Data Structure", Expected);
	}
	
	public void clickonServices() throws InterruptedException
	{
		Thread.sleep(2000);
		Services.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Campus Training']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='×']")).click();*/
	}
	
	public void clickonPractice() throws InterruptedException
	{
		Thread.sleep(2000);
		Practice.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	public void clicokonPlacement() throws InterruptedException
	{
		Thread.sleep(2000);
		placement.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	public void clickonOnlineRegistration() throws InterruptedException
	{
		Thread.sleep(2000);
		OnlineRegistration.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	public void clickonEvent() throws InterruptedException
	{
		Thread.sleep(2000);
		Event.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	public void clickonContact() throws InterruptedException
	{
		Thread.sleep(2000);
		Contact.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	public void ValidateNewBatch() throws InterruptedException
	{
		Thread.sleep(2000);
		String Batchtext= NewBatch.getText();
		System.out.println("The text of new batch is :" +Batchtext);
		//to select Course
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//select[@class='form-control']"));
		Thread.sleep(2000);
		Select select=new Select(element);
		select.selectByIndex(2);
		//to verify date
		Thread.sleep(2000);
		String Expecteddate=driver.findElement(By.id("date")).getText();
		System.out.println("Date is display on UI :"+Expecteddate);
		Thread.sleep(2000);
		SoftAssert asse=new SoftAssert();
		asse.assertEquals("18/Oct/2021", Expecteddate);
		//to verify time 
		Thread.sleep(2000);
		String ExpectedTime=driver.findElement(By.xpath("//label[@id='time']")).getText();
		System.out.println("Time is display on UI is :"+ExpectedTime);
		Thread.sleep(2000);
		asse.assertEquals("5:30 pm To  6:30 pm", ExpectedTime);
		//to click on Register
		Thread.sleep(2000);
		RegisterNow.click();
	}
	
	public void InvalidnameinRegisterNow() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='name'])[2]")).sendKeys(ExcelUtlity.getdata(contactpath, 0, 0, 2));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='email'])[3]")).sendKeys(ExcelUtlity.getdata(contactpath, 0, 1, 2));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='mobile'])[2]")).sendKeys(ExcelUtlity.getdata(contactpath, 0, 2, 2));
		//to perform drop down so use select method
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("(//select[@id='usercourse'])"));
		Thread.sleep(2000);
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Selenium Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//textarea[@placeholder='Your Message Here'])")).sendKeys(ExcelUtlity.getdata(contactpath, 0, 3, 2));//to fill data in your message
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		Thread.sleep(2000);
		String Expected=driver.findElement(By.xpath("(//input[@id='name'])[2]")).getAttribute("title");
		System.out.println("Expected data is :"+Expected);
		Thread.sleep(2000);
		Assert.assertEquals("Must contain Alphabet only(Min 3 Letters)", Expected);
	}
	
	public void ValidateRegisterNow() throws InterruptedException
	{
		//to enter detail 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='name'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@id='name'])[2]")).sendKeys(ExcelUtlity.getdata(contactpath, 0, 0, 1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='email'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@id='email'])[3]")).sendKeys(ExcelUtlity.getdata(contactpath, 0, 1, 1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='mobile'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@id='mobile'])[2]")).sendKeys(ExcelUtlity.getdata(contactpath, 0, 2, 1));
		//to perform drop down so use select method
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("(//select[@id='usercourse'])"));
		Thread.sleep(2000);
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Selenium Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//textarea[@placeholder='Your Message Here'])")).clear();
		driver.findElement(By.xpath("(//textarea[@placeholder='Your Message Here'])")).sendKeys(ExcelUtlity.getdata(contactpath, 0, 3, 1));//to fill data in your message
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();//to click on submit button
		Thread.sleep(2000);
		String Expected=driver.switchTo().alert().getText();
		System.out.println("The Expected data is display is :"+Expected);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Assert.assertEquals("Thank You For Submitting Your Query! We Will Get Back To You Soon", Expected);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='×']")).click();	
	}
	
	public void VerifyHeading() throws InterruptedException
	{
		Thread.sleep(2000);
		String heading=Heading.getText();
		System.out.println("Testing Baba Heading is :"+heading);
		Thread.sleep(2000);
		Assert.assertEquals("WELCOME TO TESTING BABA", heading);
	}
	
	public void GetDataofCourseLink() throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> courses=driver.findElements(By.xpath("//div[@class='coursesLinks mb-12']"));
		Thread.sleep(2000);
		for(WebElement text: courses)
		{
			Thread.sleep(2000);
			System.out.println("Courses link are available on UI is :"+text.getText());
		}
	}
	
	public void TextofEmail() throws InterruptedException
	{
		Thread.sleep(2000);
		String Expected=EmailUsOn.getText();
		System.out.println("The text of Email is :"+Expected);
		Thread.sleep(2000);
		String Actual="Email us on\r\n"
				+ "info@testingbaba.com";
		Assert.assertEquals(Actual, Expected);
	}
	
	public void Scrolldown() throws InterruptedException
	{
		JavascriptExecutor js= (JavascriptExecutor) driver;
		Thread.sleep(2000);
		WebElement scrolldown=driver.findElement(By.xpath("//section[@class='choose py-5']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", scrolldown);
	}
	
	public void VerifyOurPlacementText() throws InterruptedException
	{
	Thread.sleep(2000);
	String Expected=driver.findElement(By.xpath("//h4[text()='Our Placement']")).getText();
	System.out.println("Text of Expected data is :"+Expected);
	Thread.sleep(2000);
	Assert.assertEquals("Our Placement", Expected);
	}
	
	public void VerifyContentofOurPlacement() throws InterruptedException
	{
		Thread.sleep(2000);
		String Expected=driver.findElement(By.xpath("//p[@class='text-white']")).getText();
		System.out.println("Content of Our Placement is :"+Expected);
		Thread.sleep(2000);
		Assert.assertEquals("100% Job Placement Guarantee at 100 Days after Software Testing Training From Testing Baba", Expected);
	}
	
	public void VerifyViewAll() throws InterruptedException
	{
		Thread.sleep(2000);
		ViewAll.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	public void VerifyPlacementDetail1() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement Element=driver.findElement(By.xpath("//div[@class=' choose_bottom_top']"));
		Thread.sleep(2000);
		action.moveToElement(Element).build().perform();
		WebElement image=driver.findElement(By.xpath("(//img[@src='images/boy.png'])[1]"));
		Thread.sleep(2000);
		if(image.isDisplayed())
		{
			System.out.println("Image is display");
		}
		else
		{
			System.out.println("Image is not display");
		}
		Thread.sleep(2000);
		
		//to verify name
		String Expectedname=driver.findElement(By.xpath("//h5[text()='Bhav Kumar Sharma']")).getText();
		System.out.println("The name of Student is :"+Expectedname);
		Assert.assertEquals("BHAV KUMAR SHARMA", Expectedname);
		Thread.sleep(2000);
		String PackageExpected=driver.findElement(By.xpath("//p[contains(text(),'Package:16.308 LPA')]")).getText();
		System.out.println("Package of Student is :"+PackageExpected);
		Thread.sleep(2000);
		String Actual="Package:16.308 LPA Experience:4 Years";
		Assert.assertEquals(Actual, PackageExpected);
	}
	
	public void VerifyPlacementDetail2() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement Element=driver.findElement(By.xpath("//div[@class='col-md-6 w3l_choose_bottom2']//div[@class='choose_bottom_top']"));
		Thread.sleep(2000);
		action.moveToElement(Element).build().perform();
		WebElement image=driver.findElement(By.xpath("//img[@src='images/girl.png']"));
		Thread.sleep(2000);
		if(image.isDisplayed())
		{
			System.out.println("Image is display");
		}
		else
		{
			System.out.println("Image is not display");
		}
		Thread.sleep(2000);
		//to verify name
		String Expectedname=driver.findElement(By.xpath("//h5[text()='Poonam Sharma']")).getText();
		System.out.println("The name of Student is :"+Expectedname);
		Assert.assertEquals("POONAM SHARMA", Expectedname);
		Thread.sleep(2000);
		String PackageExpected=driver.findElement(By.xpath("//p[contains(text(),'Package:12.35 LPA')]")).getText();
		System.out.println("Package of Student is :"+PackageExpected);
		Thread.sleep(2000);
		String Actual="Package:12.35 LPA Experience:5 Years";
		Assert.assertEquals(Actual, PackageExpected);
	}
	
	public void VerifyPlacementDetail3() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement Element=driver.findElement(By.xpath("//div[@class='col-md-6 w3l_choose_bottom3 mt-3 pt-md-4']//div[@class='choose_bottom_top']"));
		Thread.sleep(2000);
		action.moveToElement(Element).build().perform();
		WebElement image=driver.findElement(By.xpath("(//img[@src='images/boy.png'])[2]"));
		Thread.sleep(2000);
		if(image.isDisplayed())
		{
			System.out.println("Image is display");
		}
		else
		{
			System.out.println("Image is not display");
		}
		Thread.sleep(2000);
		//to verify name
		String Expectedname=driver.findElement(By.xpath("//h5[text()='Dev Singh Rathore']")).getText();
		System.out.println("The name of Student is :"+Expectedname);
		Assert.assertEquals("DEV SINGH RATHORE", Expectedname);
		Thread.sleep(2000);
		String PackageExpected=driver.findElement(By.xpath("//p[contains(text(),'Package:9.75 LPA')]")).getText();
		System.out.println("Package of Student is :"+PackageExpected);
		Thread.sleep(2000);
		String Actual="Package:9.75 LPA Experience:3.6 Years";
		Assert.assertEquals(Actual, PackageExpected);
	}
	
	public void VerifyPlacementDetail4() throws InterruptedException
	{
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement Element=driver.findElement(By.xpath("//div[@class='col-md-6 w3l_choose_bottom4']//div[@class='choose_bottom_top']"));
		Thread.sleep(2000);
		action.moveToElement(Element).build().perform();
		WebElement image=driver.findElement(By.xpath("(//img[@src='images/boy.png'])[3]"));
		Thread.sleep(2000);
		if(image.isDisplayed())
		{
			System.out.println("Image is display");
		}
		else
		{
			System.out.println("Image is not display");
		}
		Thread.sleep(2000);
		//to verify name
		String Expectedname=driver.findElement(By.xpath("//h5[text()='Bharat Bisht']")).getText();
		System.out.println("The name of Student is :"+Expectedname);
		Assert.assertEquals("BHARAT BISHT", Expectedname);
		Thread.sleep(2000);
		String PackageExpected=driver.findElement(By.xpath("//p[contains(text(),'Package:9 LPA')]")).getText();
		System.out.println("Package of Student is :"+PackageExpected);
		Thread.sleep(2000);
		String Actual="Package:9 LPA Experience:3 Years";
		Assert.assertEquals(Actual, PackageExpected);
	}
	
	public void ScrollDowntoOurAchievement() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		WebElement TargetElement=driver.findElement(By.xpath("//h3[@class='heading-agileinfo text-center']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", TargetElement);
	}
	
	public void VerifyOurAchiementText() throws InterruptedException
	{
		Thread.sleep(2000);
		String TargetElement=driver.findElement(By.xpath("//h3[@class='heading-agileinfo text-center']")).getText();
		System.out.println("The text of Achievement is :"+TargetElement);
		Thread.sleep(2000);
		Assert.assertEquals("OUR ACHIEVEMENTS", TargetElement);
	}
	
	public void VerifyYearsofFoundation() throws InterruptedException
	{
		Thread.sleep(2000);
	String ExpectedCount=driver.findElement(By.xpath("//p[text()='2016']")).getText();
	System.out.println("Foundation Year is :"+ExpectedCount);
	Thread.sleep(2000);
	Assert.assertEquals("2016", ExpectedCount);
	Thread.sleep(2000);
	String ExpectedText=driver.findElement(By.xpath("//h3[text()='Year of Foundation']")).getText();
	System.out.println("Text of Year Foundation is :"+ExpectedText);
	Thread.sleep(2000);
	Assert.assertEquals("Year of Foundation", ExpectedText);
	}
	
	public void VerifyNoOfPlacements() throws InterruptedException
	{
		Thread.sleep(2000);
		String ExpectedCount=driver.findElement(By.xpath("//p[text()='900']")).getText();
		System.out.println("No of Placements is :"+ExpectedCount);
		Thread.sleep(2000);
		Assert.assertEquals("900", ExpectedCount);
		Thread.sleep(2000);
		String ExpectedText=driver.findElement(By.xpath("//h3[text()='Placements']")).getText();
		System.out.println("Text of Placement is :"+ExpectedText);
		Thread.sleep(2000);
		Assert.assertEquals("Placements", ExpectedText);
	}
	
	public void VerifyCeritifiedStaff() throws InterruptedException
	{
		Thread.sleep(2000);
		String ExpectedCount=driver.findElement(By.xpath("//p[text()='20']")).getText();
		System.out.println("No of Staff is :"+ExpectedCount);
		Thread.sleep(2000);
		Assert.assertEquals("20", ExpectedCount);
		Thread.sleep(2000);
		String ExpectedText=driver.findElement(By.xpath("//h3[text()='Certified Staff']")).getText();
		System.out.println("Text of Staff is :"+ExpectedText);
		Thread.sleep(2000);
		Assert.assertEquals("Certified Staff", ExpectedText);
	}
	
	public void VerifyStudents() throws InterruptedException
	{
		Thread.sleep(2000);
		String ExpectedCount=driver.findElement(By.xpath("//p[text()='1400']")).getText();
		System.out.println("No of Students is :"+ExpectedCount);
		Thread.sleep(2000);
		Assert.assertEquals("1400", ExpectedCount);
		Thread.sleep(2000);
	    String ExpectedText=driver.findElement(By.xpath("//h3[text()='Students']")).getText();
		System.out.println("Text of Student is :"+ExpectedText);
		Thread.sleep(2000);
		Assert.assertEquals("Students", ExpectedText);
	}
	
	public void ScrollDowntoBottom() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement scrollBottom=driver.findElement(By.xpath("//div[@class='inner-sec py-md-5 py-3']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", scrollBottom);
	}
	
	public void ValidateGetInTouch() throws InterruptedException
	{
		Thread.sleep(2000);
		String Expected=driver.findElement(By.xpath("(//div[@class='col-lg-3 col-md-6 social-info text-left'])[1]")).getText();
		System.out.println("The text of Get In Touch is :"+Expected);
		Thread.sleep(2000);
		String Actual="Get In Touch\r\n"
				+ "H-161 SECTOR-63 BSI Business Park,\r\n"
				+ "Noida,India\r\n"
				+ "Mail: info@testingbaba.com";
		Thread.sleep(2000);
		Assert.assertEquals(Actual, Expected);
	}
}
