package com.hp.stepDef;

import org.openqa.selenium.By;

import com.hp.pageObject.BasePage;
import com.hp.pageObject.HomePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SimpleFormDemoStepDef extends BasePage {

	HomePage homePage;

	@Before
	public void setUp() {
		BasePage.initBrowser();
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}

	@Given("^User Navigate to SeleniumEasy Test Home Page$")
	public void user_Navigate_to_SeleniumEasy_Test_Home_Page() throws Throwable {
		driver.get("https://www.seleniumeasy.com/test/");
	}

	@When("^User Click on Input Forms hyperlink tab$")
	public void user_Click_on_Input_Forms_hyperlink_tab() throws Throwable {
		homePage = new HomePage();
		homePage.inputFormLink.click();

	}

	@Then("^User Click on  Simple form Demo Hyperlink Test$")
	public void user_Click_on_Simple_form_Demo_Hyperlink_Test() throws Throwable {
		homePage.simpleFormLink.click();
	}

	@Then("^User Enter a message in the Enter message text box$")
	public void user_Enter_a_message_in_the_Enter_message_text_box() throws Throwable {

		//driver.findElement(By.id("user-message")).sendKeys("test message");
		homePage.testBoxFiled.sendKeys("test message");
	}


    @Then("^User Click on Show Message Button$")
	public void user_Click_on_Show_Message_Button() throws Throwable {
	//driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
    	homePage.showMessageButton.click();
    	
    	
	}
    
	@Then("^User Validate the Message is been displayed in the Your Message section$")
	public void user_Validate_the_Message_is_been_displayed_in_the_Your_Message_section() throws Throwable {

		String expectedResult="test message";
		String actualResult=homePage.messageDispayed.getText();
		Assert.assertEquals(expectedResult, actualResult);
		
		
		
		
		
		
		
		
		
		
		
	}

}
