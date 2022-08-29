package testing_baba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary2;
import testing_baba_page.TestingBaba_Main_Page;

public class TestingBaba_Main_Test extends BaseLibrary2
{
	TestingBaba_Main_Page ob;
	@BeforeTest
	public void getlaunchtestingbaba()
	{
		getlaunch("https://testingbaba.com/old/");
		ob= new TestingBaba_Main_Page();
	}
	
	@Test(priority = 1)
	public void clickonHome() throws InterruptedException
	{
		ob.clickonHome();
	}
	
	@Test(priority = 2)
	public void clickonAbout() throws InterruptedException
	{
		ob.clickonAbout();
	}
	
	@Test(priority = 3)
	public void clickonCourses() throws InterruptedException
	{
		ob.clickonCourses();
	}
	
	@Test(priority = 4)
	public void validateCourses() throws InterruptedException
	{
		ob.validateCourses();
	}
	
	@Test(priority = 5)
	public void clickonPractice() throws InterruptedException
	{
		ob.clickonPractice();
	}
	
	@Test(priority = 6)
	public void clicokonPlacement() throws InterruptedException
	{
		ob.clicokonPlacement();
	}
	
	@Test(priority = 7)
	public void clickonOnlineRegistration() throws InterruptedException
	{
		ob.clickonOnlineRegistration();
	}
	
	@Test(priority = 8)
	public void clickonEvent() throws InterruptedException
	{
		ob.clickonEvent();
	}
	
	@Test(priority = 9)
	public void clickonContact() throws InterruptedException
	{
		ob.clickonContact();
	}
	
	@Test(priority = 10)
	public void ValidateNewBatch() throws InterruptedException
	{
		ob.ValidateNewBatch();
	}
	
	@Test(priority = 11)
	public void InvalidnameinRegisterNow() throws InterruptedException 
	{
		ob.InvalidnameinRegisterNow();
	}
	
	@Test(priority = 12)
	public void ValidateRegisterNow() throws InterruptedException
	{
		ob.ValidateRegisterNow();
	}
	
	@Test(priority = 13)
	public void VerifyHeading() throws InterruptedException
	{
		ob.VerifyHeading();
	}
	
	@Test(priority = 14)
	public void GetDataofCourseLink() throws InterruptedException
	{
		ob.GetDataofCourseLink();
	}
	
	@Test(priority = 15)
	public void TextofEmail() throws InterruptedException
	{
		ob.TextofEmail();
	}
	
	@Test(priority = 16)
	public void Scrolldown() throws InterruptedException
	{
		ob.Scrolldown();
	}
	
	@Test(priority = 17)
	public void VerifyOurPlacementText() throws InterruptedException
	{
		ob.VerifyOurPlacementText();
	}
	
	@Test(priority = 18)
	public void VerifyContentofOurPlacement() throws InterruptedException
	{
		ob.VerifyContentofOurPlacement();
	}
	
	@Test(priority = 19)
	public void VerifyViewAll() throws InterruptedException
	{
		ob.VerifyViewAll();
	}
	
	@Test(priority = 20)
	public void VerifyPlacementDetail1() throws InterruptedException
	{
		ob.VerifyPlacementDetail1();
	}
	
	@Test(priority = 21)
	public void VerifyPlacementDetail2() throws InterruptedException
	{
		ob.VerifyPlacementDetail2();
	}
	
	@Test(priority = 22)
	public void VerifyPlacementDetail3() throws InterruptedException
	{
		ob.VerifyPlacementDetail3();
	}
	
	@Test(priority = 23)
	public void VerifyPlacementDetail4() throws InterruptedException
	{
		ob.VerifyPlacementDetail4();
	}
	
	@Test(priority = 24)
	public void ScrollDowntoOurAchievement() throws InterruptedException
	{
		ob.ScrollDowntoOurAchievement();
	}
	
	@Test(priority = 25)
	public void VerifyOurAchiementText() throws InterruptedException
	{
		ob.VerifyOurAchiementText();
	}
	
	@Test(priority = 26)
	public void VerifyYearsofFoundation() throws InterruptedException
	{
		ob.VerifyYearsofFoundation();
	}
	
	@Test(priority = 27)
	public void VerifyNoOfPlacements() throws InterruptedException
	{
		ob.VerifyNoOfPlacements();
	}
	
	@Test(priority = 28)
	public void VerifyCeritifiedStaff() throws InterruptedException
	{
		ob.VerifyCeritifiedStaff();
	}
	
	@Test(priority = 29)
	public void VerifyStudents() throws InterruptedException
	{
		ob.VerifyStudents();
	}
	
	@Test(priority = 30)
	public void ScrollDowntoBottom() throws InterruptedException
	{
		ob.ScrollDowntoBottom();
	}
	
	@Test(priority = 31)
	public void ValidateGetInTouch() throws InterruptedException
	{
		ob.ValidateGetInTouch();
	}
}
