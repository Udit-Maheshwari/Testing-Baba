package testing_baba_page;

import org.testng.AssertJUnit;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.AssertJUnit;

import BaseLibrary.BaseLibrary;
import ExcelUtility.ExcelUtlity;

public class Testing_baba_Practice_page extends BaseLibrary 
{
	String path="C:\\Users\\Asus\\eclipse-workspace\\TestingBaba\\Excel\\TestData_TextBox.xlsx";
	String webtabledatapath="C:\\Users\\Asus\\eclipse-workspace\\TestingBaba\\Excel\\WebTabletestdata.xlsx";
	public Testing_baba_Practice_page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@data-target='#elements']")
	private WebElement Elements;
	
	@FindBy(xpath= "//a[text()='text box']")
	private WebElement textbox;
	
	@FindBy(xpath="//input[@id='fullname1']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='fullemail1']")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@id='fulladdresh1']")
	private WebElement Currentaddress;
	
	@FindBy(xpath="//textarea[@id='paddresh1']")
	private WebElement Permanentaddress;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[text()='check box']")
	private WebElement checkbox;
	
	@FindBy(xpath="//input[@id='myCheck']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@id='mylaptop']")
	private WebElement laptop;
	
	@FindBy(xpath="//input[@id='mydesktop']")
	private WebElement desktop;
	
	@FindBy(xpath="//a[text()='web tables']")
	private WebElement webtable;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement WebTableName;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement WebTableEmail;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement WebDataDelete;
	
	@FindBy(xpath="//button[text()='Edit']")
	private WebElement WebTableEdit;
	
	@FindBy(xpath="//a[text()='buttons']")
	private WebElement buttons;
	
	@FindBy(xpath="//button[@ondblclick='doubletext()']")
	private WebElement doubleclicks;
	
	@FindBy(xpath="//button[@oncontextmenu='righttext()']")
	private WebElement rightclick;
	
	@FindBy(xpath="//button[@onclick='clicktext()']")
	private WebElement clickme;
	
	@FindBy(xpath="//a[text()='upload and download']")
	private WebElement uploadandDownload;
	
	@FindBy(xpath="//input[@id='File1']")
	private WebElement Choosefile;
	
	@FindBy(xpath="//a[text()='Download']")
	private WebElement download;
	
	@FindBy(xpath="//a[text()='broken  - images']")
	private WebElement brokenimage;
	
	@FindBy(xpath="//button[@data-target='#alerts']")
	private WebElement alerts;
	
	@FindBy(xpath="//div/a[text()='browser windows']")
	private WebElement Browserwindow;
	
	@FindBy(xpath="//a[@href='https://www.google.co.in/']")
	private WebElement newtab;
	
	@FindBy(xpath="//a[text()='New Window']")
	private WebElement newWindow;
	
	@FindBy(xpath="//a[text()='New Window Message']")
	private WebElement newWindowMessage;
	
	@FindBy(xpath="//a[text()='modal dialogs']")
	private WebElement modelDialog;
	
	@FindBy(xpath="//button[@data-target='#exampleModal1']")
	private WebElement SmallModel;
	
	@FindBy(xpath="//button[@data-target='#exampleModal2']")
	private WebElement LargeModel;
	
	@FindBy(xpath="//button[@data-target='#widget']")
	private WebElement widget;
	
	@FindBy(xpath="//a[text()='auto complete']")
	private WebElement AutoComplete;
	
	@FindBy(xpath="//a[text()='date picker']")
	private WebElement datepicker;
	
	@FindBy(xpath="//a[text()='slider']")
	private WebElement slider;
	
	@FindBy(xpath="//a[text()='progress bar']")
	private WebElement progressBar;
	
	@FindBy(xpath="//a[text()='tabs']")
	private WebElement tabs;
	
	@FindBy(xpath="//a[text()='tool tips']")
	private WebElement tooltips;
	
	@FindBy(xpath="//a[text()='menu']")
	private WebElement menu;
	
	@FindBy(xpath="//a[text()='select menu']")
	private WebElement SelectMenu;
	
	@FindBy(xpath="//button[@data-target='#interations']")
	private WebElement Interactions;
	
	@FindBy(xpath="//a[text()='resizable']")
	private WebElement Resizable;
	
	public void clickOnElement()
	{
		Elements.click();
	}
	
	public void clickOnTextbox()
	{
		textbox.click();
	}
	
	
	public void alldetails()
	{
		String actual = "";
		String expected="";
		name.sendKeys(ExcelUtlity.getdata(path, 0, 1, 1));
		email.sendKeys(ExcelUtlity.getdata(path, 0, 2, 1));
		Currentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 3, 1));
		Permanentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 4, 1));
		submit.click(); 
	    List<WebElement> text=	driver.findElements(By.xpath("(//div[@class='col-md-6 mt-5'])/label"));
		for(int i=1;i<text.size();i++)
		{
		  expected=(text.get(i).getText());
			i++;
			  
		}
		//System.out.println(expected);
		
		for(int j=1;j<5;j++)
		{
			actual=ExcelUtlity.getdata(path, 0, j, 1);
			
		}
		//System.out.println(actual);
		
		AssertJUnit.assertEquals(actual, expected);
	}
	
	public void data()
	{
		name.clear();
		email.clear();
		Currentaddress.clear();
		Permanentaddress.clear();
		name.sendKeys(ExcelUtlity.getdata(path, 0, 1,2));
		email.sendKeys(ExcelUtlity.getdata(path, 0, 2, 2));
		Currentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 3, 2));
		Permanentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 4, 2));
		submit.click(); 
		/*List<WebElement> expected=	driver.findElements(By.xpath("(//div[@class='col-md-6 mt-5'])/label"));
	
		for(int i=1;i<expected.size();i++)
		{
		System.out.println(expected.get(i).getText());	
		i++;
		}*/
		
	}
	
	//verify without enter Current address
	public void data1()
	{
		name.clear();
		email.clear();
		Currentaddress.clear();
		Permanentaddress.clear();
		name.sendKeys(ExcelUtlity.getdata(path, 0, 1,30));
		email.sendKeys(ExcelUtlity.getdata(path, 0, 2, 30));
		Currentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 3, 30));
		Permanentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 4, 30));
		submit.click();
		String expected=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		AssertJUnit.assertEquals("Current address can't be blank or less then 10 character", expected);
		System.out.println(expected);
		
	}
	
	// to verify without fill email
	public void data2()
	{
		name.clear();
		email.clear();
		Currentaddress.clear();
		Permanentaddress.clear();
		name.sendKeys(ExcelUtlity.getdata(path, 0, 1,11));
		email.sendKeys(ExcelUtlity.getdata(path, 0, 2, 11));
		Currentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 3, 11));
		Permanentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 4, 11));
		submit.click();
		String expected=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		AssertJUnit.assertEquals("Please enter a valid e-mail address like name@xyz.com :-1:-1", expected);
		System.out.println(expected);
	}
	
	// to verify without name
	public void data3()
	{
		name.clear();
		email.clear();
		Currentaddress.clear();
		Permanentaddress.clear();
		name.sendKeys(ExcelUtlity.getdata(path, 0, 1,9));
		email.sendKeys(ExcelUtlity.getdata(path, 0, 2, 9));
		Currentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 3, 9));
		Permanentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 4, 9));
		submit.click();
		String expected=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		AssertJUnit.assertEquals("Name can't be blank ", expected);
		System.out.println(expected);
		
	}
	
	// to verify invalid-email
	public void invalidemail()
	{
		name.clear();
		email.clear();
		Currentaddress.clear();
		Permanentaddress.clear();
		name.sendKeys(ExcelUtlity.getdata(path, 0, 1,17));
		email.sendKeys(ExcelUtlity.getdata(path, 0, 2, 17));
		Currentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 3, 17));
		Permanentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 4, 17));
		submit.click();
		String expected=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		AssertJUnit.assertEquals("Please enter a valid e-mail address like name@xyz.com :4:-1", expected);
		System.out.println(expected);
		
	}
	
	//to verify enter invalid username
	public void invalidusername()
	{
		name.clear();
		email.clear();
		Currentaddress.clear();
		Permanentaddress.clear();
		name.sendKeys(ExcelUtlity.getdata(path, 0, 1, 3));
		email.sendKeys(ExcelUtlity.getdata(path, 0, 2, 3));
		Currentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 3, 3));
		Permanentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 4, 3));
		submit.click();
		String expected=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		AssertJUnit.assertEquals("Please enter valid name", expected);
		System.out.println(expected);
	}
	
	public void name()
	{
		name.clear();
		email.clear();
		Currentaddress.clear();
		Permanentaddress.clear();
		name.sendKeys(ExcelUtlity.getdata(path, 0, 1, 7));
		email.sendKeys(ExcelUtlity.getdata(path, 0, 2, 7));
		Currentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 3, 7));
		Permanentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 4, 7));
		submit.click();
		String expected=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		AssertJUnit.assertEquals("Please enter a valid name", expected);
		System.out.println(expected);
	}
	
	// to enter udit@gmmail.com
	public void gmail()
	{
		name.clear();
		email.clear();
		Currentaddress.clear();
		Permanentaddress.clear();
		name.sendKeys(ExcelUtlity.getdata(path, 0, 1, 12));
		email.sendKeys(ExcelUtlity.getdata(path, 0, 2, 12));
		Currentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 3, 12));
		Permanentaddress.sendKeys(ExcelUtlity.getdata(path, 0, 4, 12));
		submit.click();
		String expected=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		AssertJUnit.assertEquals("Please enter a valid e-mail address like name@xyz.com :4:-1", expected);
		System.out.println(expected);
		
	}
	
	public void clickoncheckbox()
	{
		checkbox.click();
		driver.switchTo().frame(0);
	}
	
	public void clickonmobie()
	{
		mobile.click();
		WebElement mobiletext=driver.findElement(By.xpath("//h6[text()='You are selected Mobile']"));
		System.out.println(mobiletext.getText());
	}
	
	public void clickonlaptop()
	{
		laptop.click();
		WebElement laptoptext=driver.findElement(By.xpath("//h6[text()='You are Selected Laptop']"));
		System.out.println(laptoptext.getText());
	}
	
	public void clickondesktop()
	{
		desktop.click();
		WebElement desktoptext=driver.findElement(By.xpath("//h6[text()='You are Selected Desktop']"));
		System.out.println(desktoptext.getText());
	}
	
	//to test WebTable
	
	public void clickonwebtable()
	{
		driver.switchTo().defaultContent();
		webtable.click();
		driver.switchTo().frame(1);
	}
	
	public void webtabledetails()
	{
		//String out="";
		WebTableName.sendKeys(ExcelUtlity.getdata(webtabledatapath, 0, 1, 1));
		WebTableEmail.sendKeys(ExcelUtlity.getdata(webtabledatapath, 0, 2, 1));
		save.click();
		
		/*List<WebElement> exp=driver.findElements(By.xpath("//tr[@data-name='Udit']"));
		for(int i=1;i<exp.size();i++)
		{
			 String value=(exp.get(i).getText());   
			i++;
			out=out+value;
		}
		System.out.println(out);*/
		
	}
	
	//to enter invalid name
	public void webinvalidname()
	{
		WebTableName.sendKeys(ExcelUtlity.getdata(webtabledatapath, 0, 1, 2));
		WebTableEmail.sendKeys(ExcelUtlity.getdata(webtabledatapath, 0, 2, 2));
		save.click();
		String expected=driver.findElement(By.xpath("//input[@name='name']")).getAttribute("title");
		AssertJUnit.assertEquals("Must contain Alphabet only(Min 3 Letters)", expected);
		System.out.println(expected);
		
	}
	
	//to enter invalid email
	public void webinvalidemail()
	{
		WebTableName.clear();
		WebTableEmail.clear();
		WebTableName.sendKeys(ExcelUtlity.getdata(webtabledatapath, 0, 1, 3));
		WebTableEmail.sendKeys(ExcelUtlity.getdata(webtabledatapath, 0, 2, 3));
		save.click();
		String expected=driver.findElement(By.xpath("//input[@name='email']")).getAttribute("title");
		AssertJUnit.assertEquals("eg name@gmail.com", expected);
		System.out.println(expected);
		
	}
	
	//without enter email
	public void webwithoutemail()
	{
		WebTableName.clear();
		WebTableEmail.clear();
		WebTableName.sendKeys(ExcelUtlity.getdata(webtabledatapath, 0, 1, 7));
		WebTableEmail.sendKeys(ExcelUtlity.getdata(webtabledatapath, 0, 2, 7));
		save.click();
		String expected=driver.findElement(By.xpath("//input[@name='email']")).getAttribute("title");
		AssertJUnit.assertEquals("eg name@gmail.com", expected);
		System.out.println(expected);
		
	}
	
	
	
	//to edit the data in web table
	public void editwebtable()
	{
		WebTableEdit.click();
		driver.findElement(By.xpath("//input[@name='edit_name']")).clear();
		driver.findElement(By.xpath("//input[@name='edit_name']")).sendKeys("Ananya");
		driver.findElement(By.xpath("//button[@class='btn btn-info btn-xs btn-update']")).click();// to click on update button
	}
	
	//to delete the data in web table
	public void deletewebtabledata()
	{
		WebDataDelete.click();
	}
	
	//to test button function
	public void clickonbutton()
	{
		driver.switchTo().defaultContent();
		buttons.click();
	}
	
	public void clickondoubleclick() throws InterruptedException
	{
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.doubleClick(doubleclicks).perform();
		WebElement doubletext=driver.findElement(By.xpath("(//p[.='you have done a double click'])"));
		System.out.println(doubletext.getText());
	}
	
	public void clickonrightclick()
	{
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		WebElement righttext=driver.findElement(By.xpath("//p[@id='right-content']"));
		System.out.println(righttext.getText());
	}
	
	public void clickonclickme()
	{
		Actions act = new Actions(driver);
		act.click(clickme).perform();
		WebElement clicktext=driver.findElement(By.xpath("//p[text()='you have done a dynamic click']"));
		System.out.println(clicktext.getText());
		
	}
	
	//to perform upload & download option
	public void clickonuploaddownloadf()
	{
		uploadandDownload.click();
	}
	
	//to upload file
	public void uploadfile()
	{
		Choosefile.sendKeys("C:\\Users\\Asus\\Desktop\\textbox testcase.xlsx");
	}
	
	//to upload wrong file
	public void updatewrongfile()
	{
		Choosefile.sendKeys("E:\\bb ki vines\\Baincho Ka New Relationship by BB _ BB Ki Vines.mp4");
		String expected=driver.switchTo().alert().getText();
		AssertJUnit.assertEquals("this file is not support", expected);
		System.out.println(expected);
	}
	
	//to click on upload file
	public void clickondownload()
	{
		download.click();
		String expected=driver.findElement(By.xpath("//p[2]")).getText();
		AssertJUnit.assertEquals("The requested URL was not found on this server. That’s all we know.", expected);
		System.out.println(expected);
		
	}
	//to check the broken image function
	//to clickon broken image 
	public void clickonbrokenimage()
	{
		driver.get("https://testingbaba.com/old/newdemo.html");
		Elements.click();
		brokenimage.click();
	}
	
	public void findbrokenimage()
	{
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("total image is: "+images.size());
			for(WebElement image:images)
			{
				String imagesrc=image.getAttribute("src");
				try
				{
				URL url=new URL(imagesrc);
				URLConnection urlconnection= url.openConnection();
				HttpURLConnection httpurlconnection=(HttpURLConnection) urlconnection;
				//Thread.sleep(5000);
				httpurlconnection.connect();
				if(httpurlconnection.getResponseCode()==200)
				{
					System.out.println("image is not broken");
				}
				else
				{
					System.out.println("image is broken");
				}
				httpurlconnection.disconnect();
			}
			
		 catch (Exception e) 
		{
			System.out.println("exception is :"+e);
		}
			}
		
	}
	
	//to click on alert,window
	public void clickonalertswindow()
	{
		alerts.click();
	}
	
	public void clickonwindowbrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		Browserwindow.click();
	}
	
	public void clickonNewtab() throws InterruptedException
	{
		Thread.sleep(3000);
		newtab.click();
		Set<String> handles=driver.getWindowHandles();
		List<String> ls=new ArrayList<String>(handles);
		
		String parentWindow=ls.get(0);
		String childWindow=ls.get(1);
		System.out.println(parentWindow);
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);//to switch the child window
		 String expected=driver.getTitle();
		AssertJUnit.assertEquals("Google", expected);
		System.out.println("expected title is:" +expected);
		driver.close();
		driver.switchTo().window(parentWindow);// to switch parent window now
		String parentWindowTitle=driver.getTitle();
		System.out.println("Title of parent window is: "+parentWindowTitle);
	}
	
	public void clickonnewWindow() throws InterruptedException
	{
		Thread.sleep(2000);
		newWindow.click();
		String parenthandle=driver.getWindowHandle();
		Set<String> childhandle=driver.getWindowHandles();
		
		for(String e:childhandle)
		{
			driver.switchTo().window(e);
			if(!parenthandle.equalsIgnoreCase(e))
			{
				System.out.println(" click on new window child window title is :" +driver.getTitle());
				driver.close();
			}
			driver.switchTo().window(parenthandle);
			System.out.println(" click on new window parent window title is :"+driver.getTitle());
		}
		
	}
	
	/*public void clickonWindowMessage() throws InterruptedException
	{
		Thread.sleep(3000);
		//newWindowMessage.click();
		String parenthandle=driver.getWindowHandle();
		Set<String> childhandle=driver.getWindowHandles();
		
		for(String e:childhandle)
		{
			driver.switchTo().window(e);
		 	if(!parenthandle.equalsIgnoreCase(e))
		 	{
				System.out.println("Child window message title is:" +driver.getTitle());
				String text=driver.findElement(By.xpath("//p[contains(text(),'Lorem ipsum, dolor sit amet consectetur adipisicin')]")).getText();
				System.out.println("text of new window message is:"+text);
				driver.close();
			}
			driver.switchTo().window(parenthandle);
			//System.out.println("parent window title is:"+driver.getTitle());
	}*/
	
	public void clickonmodelDialog() throws InterruptedException
	{
		Thread.sleep(2000);
		modelDialog.click();
	}
	
	public void clickonSmallModel() throws InterruptedException
	{
		Thread.sleep(2000);
		SmallModel.click();
		Thread.sleep(2000);
		WebElement modelLabel=driver.findElement(By.xpath("//div[@class='modal-dialog modal-sm']//h5[@id='exampleModalLabel']"));
		System.out.println("ModelLabel is :" +modelLabel.getText());
		Thread.sleep(2000);
		String mainContent=driver.findElement(By.xpath("//div[@id='exampleModal1']//div[@class='modal-body']")).getText();
		System.out.println("Main content is :"+mainContent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-dialog modal-sm']//button[@type='button'][normalize-space()='Close']")).click();
		AssertJUnit.assertEquals("This is a small modal. It has very less content", mainContent);
	}
	
	public void clickonLargeModel() throws InterruptedException
	{
		Thread.sleep(3000);
		LargeModel.click();
		Thread.sleep(2000);
		String largeLabel=driver.findElement(By.xpath("//div[@id='exampleModal2']//h5[@id='exampleModalLabel']")).getText();
		System.out.println("LargeLabel content is :"+largeLabel);
		Thread.sleep(2000);
		String maincontent=driver.findElement(By.xpath("//div[@id='exampleModal2']//div[@class='modal-body']")).getText();
		System.out.println("main content text is :" +maincontent);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='exampleModal2']//button[@class='btn btn-primary']")).click();
	}
	
	public void clickonwidget() throws InterruptedException
	{
		Thread.sleep(2000);
		widget.click();
	}
	
	public void clickonAutoComplete() throws InterruptedException
	{
		Thread.sleep(2000);
		AutoComplete.click();
		WebElement element=driver.findElement(By.xpath("//iframe[@src='Autocomplete.html']"));
		// System.out.println("iframe webelement name is :"+element);
		Thread.sleep(3000);
		driver.switchTo().frame(element);
		Thread.sleep(3000);
		WebElement text=driver.findElement(By.id("myInput"));
		text.sendKeys("India");
		Thread.sleep(3000);
		text.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		text.sendKeys(Keys.ENTER);
		driver.switchTo().defaultContent();
	}
	
	/*public void clickonDatePicker() throws InterruptedException
	{
		Thread.sleep(2000);
		datepicker.click();
		//String 
		
		driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12 form-inline']/input[@type='date']")).click();
		
		
	}*/
	
	public void clickonSlider() throws InterruptedException
	{
		Thread.sleep(2000);
		slider.click();
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.xpath("//input[@id='range-slider']"));
		System.out.println("initial value is :" +source.getLocation());
		
		WebElement finalvalue=driver.findElement(By.xpath("//span[@id='range-value']"));
		System.out.println("Final value is :" +finalvalue.getLocation());
		//to perform action 
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		action.dragAndDropBy(source, 975, 0).build().perform();
		Thread.sleep(2000);
		action.click();
	}
	
	public void clickonProgressBar() throws InterruptedException
	{
		Thread.sleep(2000);
		progressBar.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='resetButton']")).click();
		Thread.sleep(2000);
		String value=driver.findElement(By.xpath("//div[@id='myBar']")).getText();
		System.out.println("the width of progress bar is :"+value);
		Thread.sleep(2000);
		if(value.equals("100%"))
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='resetButton']")).click();
		}
	}
	
	public void clickonTabs() throws InterruptedException
	{
		Thread.sleep(2000);
		tabs.click();
		Thread.sleep(2000);
		String tab1=driver.findElement(By.xpath("//p[contains(text(),'Message testing is the process of testing out diff')]")).getText();
		System.out.println("tab1 data is :"+tab1);
		Thread.sleep(2000);
		driver.findElement(By.id("profile-tab")).click();
		List<WebElement> tab2=driver.findElements(By.xpath("//div[@id='profile']//p"));
		for(WebElement li:tab2)
		{
			Thread.sleep(3000);
			System.out.println("The text of tab2 is:" +li.getText());
		}	 
	}
	
	public void clickontooltip() throws InterruptedException
	{
		Thread.sleep(2000);
		tooltips.click();
		Thread.sleep(2000);
		String tooltiptitle=driver.findElement(By.xpath("//button[@data-toggle='tooltip']")).getAttribute("title");
		System.out.println("tool tip data is :" +tooltiptitle);
	}
	
	public void clickonMenu() throws InterruptedException
	{
		Thread.sleep(2000);
		menu.click();
		Thread.sleep(2000);
		WebElement websitetext=driver.findElement(By.xpath("//a[text()='Website Design']"));
		//to perform mouse over so used Action class
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='tab_23']//li[contains(text(),'Services ')]")));
		Thread.sleep(2000);
		action.equals(websitetext);
		action.build().perform();
	}
	
	public void clickonSelectMenu() throws InterruptedException
	{
		Thread.sleep(2000);
		SelectMenu.click();
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
		//to use select method
		Thread.sleep(2000);
		Select dropdown=new Select(element);
		Thread.sleep(2000);
		dropdown.selectByVisibleText("Group 1, Option 2");
		
		//to select old style select menu
		Thread.sleep(2000);
		WebElement OldStyle=driver.findElement(By.xpath("(//div[@class='form-group']//div//select)[1]"));
		Thread.sleep(2000);
		Select dropdown1=new Select(OldStyle);
		Thread.sleep(2000);
		dropdown1.selectByVisibleText("Java");
		
		//to select multiple value
		Thread.sleep(2000);
		WebElement multipleselect=driver.findElement(By.xpath("//div[@class='form-group']//div//select[@multiple='multiple']"));
		Thread.sleep(2000);
		Select dropdown2=new Select(multipleselect);
		Thread.sleep(2000);
		dropdown2.selectByVisibleText("CSS"); 
		Thread.sleep(2000);
		dropdown2.selectByIndex(3);
		
		//to check the output from UI then verify
		Thread.sleep(2000);
		List<WebElement> selectmultiple=dropdown2.getAllSelectedOptions();
		for(WebElement multiple:selectmultiple)
		{
			System.out.println("The all selected data is :" +multiple.getText());
		}
	}
	
	public void clickonInteraction() throws InterruptedException
	{
		Thread.sleep(2000);
		Interactions.click();
	}
	
	public void clickonResizable() throws InterruptedException
	{
		Thread.sleep(2000);
		Resizable.click();
		Thread.sleep(2000);
		WebElement resize=driver.findElement(By.id("tab_27"));
		System.out.println("Size of box is :" +resize.getLocation());
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		Thread.sleep(4000);
		action.dragAndDropBy(resize, 700, 170).perform();
	}
	
}
