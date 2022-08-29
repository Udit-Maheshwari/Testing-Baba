package testing_baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import testing_baba_page.Testing_baba_Practice_page;

public class Testing_baba_Practice_test extends BaseLibrary
{
	Testing_baba_Practice_page ob;
	@BeforeTest
	public void getlaunchtestingbaba()
	{
		getlaunch("https://testingbaba.com/old");
		ob=new Testing_baba_Practice_page();
	}
	
	@Test(priority=1)
	public void clickOnElement()
	{
		ob.clickOnElement();
	}
	
	@Test(priority=2)
	public void ClickOnTextbox()
	{
		ob.clickOnTextbox();
	}
	
	@Test(priority=3)
	public void alldetails()
	{
		ob.alldetails();
	}
	
	@Test(priority = 4)
	public void data()
	{
		ob.data();
	}
	@Test(priority = 5)
	public void data1()
	{
		ob.data1();
	}
	@Test(priority = 6)
	public void data2()
	{
		ob.data2();
	}
	
	@Test(priority = 7)
	public void data3()
	{
		ob.data3();
	}
	
	@Test(priority = 8)
	public void invalidemail()
	{
		ob.invalidemail();
	}
	
	@Test(priority = 9)
	public void invalidusername()
	{
		ob.invalidusername();
	}
	
	@Test(priority = 10)
	public void name()
	{
		ob.name();
	}
	
	@Test(priority = 11)
	public void gmail()
	{
		ob.gmail();
	}
	
	@Test(priority = 12)
	public void clickoncheckbox()
	{
		ob.clickoncheckbox();
	}
	
	@Test(priority = 13)
	public void clickonmobie()
	{
		ob.clickonmobie();
	}
	
	@Test(priority = 14)
	public void clickonlaptop()
	{
		ob.clickonlaptop();
	}
	
	@Test(priority = 15)
	public void clickondesktop()
	{
		ob.clickondesktop();
	}
	
	@Test(priority = 16)
	public void clickonwebtable()
	{
		ob.clickonwebtable();
	}
	
	@Test(priority = 17)
	public void webtabledetails()
	{
		ob.webtabledetails();
	}
	
	@Test(priority = 18)
	public void webinvalidname()
	{
		ob.webinvalidname();
	}
	
	@Test(priority = 19)
	public void webinvalidemail()
	{
		ob.webinvalidemail();
	}
	
	@Test(priority = 20)
	public void webwithoutemail()
	{
		ob.webwithoutemail();
	}
	
	@Test(priority = 21)
	public void editwebtable()
	{
		ob.editwebtable();
	}
	
	@Test(priority = 22)
	public void deletewebtabledata()
	{
		ob.deletewebtabledata();
	}
	
	@Test(priority = 23)
	public void clickonbutton()
	{
		ob.clickonbutton();
	}
	
	@Test(priority = 24)
	public void clickondoubleclick() throws InterruptedException
	{
		ob.clickondoubleclick();
	}
	
	@Test(priority = 25)
	public void clickonrightclick()
	{
		ob.clickonrightclick();
	}
	
	@Test(priority = 26)
	public void clickonclickme()
	{
		ob.clickonclickme();
	}
	
	@Test(priority = 27)
	public void clickonuploaddownloadf()
	{
		ob.clickonuploaddownloadf();
	}
	
	@Test(priority = 28)
	public void uploadfile()
	{
		ob.uploadfile();
	}
	
	@Test(priority = 29)
	public void updatewrongfile()
	{
		ob.updatewrongfile();
	}
	
	@Test(priority = 30)
	public void clickondownload()
	{
		ob.clickondownload();
	}
	
	@Test(priority = 31)
	public void clickonbrokenimage()
	{
		ob.clickonbrokenimage();
	}
	
	@Test(priority = 32)
	public void findbrokenimage()
	{
		ob.findbrokenimage();
	}
	
	
	@Test(priority = 33)
	public void clickonalertswindow()
	{
		ob.clickonalertswindow();
	}
	
	@Test(priority = 34)
	public void clickonwindowbrowser() throws InterruptedException
	{
		ob.clickonwindowbrowser();
	}
	
	@Test(priority = 35)
	public void clickonNewtab() throws InterruptedException
	{
		ob.clickonNewtab();
	}
	
	@Test(priority = 36)
	public void clickonnewWindow() throws InterruptedException
	{
		ob.clickonnewWindow();
	}
	/*@Test(priority = 37)
	public void clickonWindowMessage() throws InterruptedException
	{
		ob.clickonWindowMessage();
	}*/
	
	@Test(priority = 38)
	public void clickonmodelDialog() throws InterruptedException
	{
		ob.clickonmodelDialog();
	}
	
	@Test(priority = 39)
	public void clickonSmallModel() throws InterruptedException
	{
		ob.clickonSmallModel();
	}
	
	@Test(priority = 40)
	public void clickonLargeModel() throws InterruptedException
	{
		ob.clickonLargeModel();
	}
	
	@Test(priority = 41)
	public void clickonwidget() throws InterruptedException
	{
		ob.clickonwidget();
	}
	
	@Test(priority = 42)
	public void clickonAutoComplete() throws InterruptedException
	{
		ob.clickonAutoComplete();
	}
	
	/*@Test(priority = 43)
	public void clickonDatePicker() throws InterruptedException
	{
		ob.clickonDatePicker();
	}*/
	
	@Test(priority = 44)
	public void clickonSlider() throws InterruptedException
	{
		ob.clickonSlider();
	}
	
	@Test(priority = 45)
	public void clickonProgressBar() throws InterruptedException
	{
		ob.clickonProgressBar();
	}
	
	@Test(priority = 46)
	public void clickonTabs() throws InterruptedException
	{
		ob.clickonTabs();
	}
	
	@Test(priority = 47)
	public void clickontooltip() throws InterruptedException
	{
		ob.clickontooltip();
	}
	
	@Test(priority = 48)
	public void clickonMenu() throws InterruptedException
	{
		ob.clickonMenu();
	}
	
	@Test(priority = 49)
	public void clickonSelectMenu() throws InterruptedException
	{
		ob.clickonSelectMenu();
	}
	
	@Test(priority = 50)
	public void clickonInteraction() throws InterruptedException
	{
		ob.clickonInteraction();
	}
	
	@Test(priority = 51)
	public void clickonResizable() throws InterruptedException
	{
		ob.clickonResizable();
	}
}
