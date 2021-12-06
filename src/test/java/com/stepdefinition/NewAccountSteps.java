package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.NewAccountPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewAccountSteps extends Base {
	
	NewAccountPage p;
	
	@Given("user on home page")
	public void user_on_home_page() {
		getDriver();
		p=PageFactory.initElements(driver, NewAccountPage.class);
			}
	@When("user click on add user")
	public void user_click_on_add_user() {
	    p.getAddUser();
	}

	@When("user enter firstname as {string}")
	public void user_enter_firstname_as(String string) {
	    p.getfirstName(string);
	}

	@When("user enter lastname as {string}")
	public void user_enter_lastname_as(String string) {
	    p.getlastname(string);
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String string) {
	    p.getUserName(string);
	}

	@When("user re enter password as {string}")
	public void user_re_enter_password_as(String string) throws InterruptedException {
	    p.getPassword(string);
	    Thread.sleep(2000);
	}

	@When("customer check radio button button")
	public void customer_check_radio_button_button() throws InterruptedException {
	    p.getradioButton();
	    Thread.sleep(2000);
	}

	@When("user choose option from role dropdown")
	public void user_choose_option_from_role_dropdown() throws InterruptedException {
	   p.getDropdown();
	   Thread.sleep(3000);
	}

	@When("user enter email as {string}")
	public void user_enter_email_as(String string) throws InterruptedException {
	    p.getEmail(string);
	    Thread.sleep(2000);
	}

	@When("user enter cell phone")
	public void user_enter_cell_phone_as() throws InterruptedException {
	    p.getCell();
	    Thread.sleep(2000);
	}

	@When("user click save button")
	public void user_click_save_button() throws InterruptedException {

    p.getSave();
    Thread.sleep(3000);
	}

	@Then("new user added successfully to the table")
	public void new_user_added_successfully_to_the_table() {
		
	  Assert.assertEquals(p.uname.getText(), "Fshafee");
	   
	   }
	@When("click on remove user")
	public void click_on_remove_user() throws InterruptedException {
	  // p.getSearchAgain();
	   //Thread.sleep(2000);
		p.getDeleteUser();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
	    Thread.sleep(2000);
	}

	@Then("user removed successfully")
	public void user_removed_successfully() throws InterruptedException {
		p.getSearchAgain();
		   Thread.sleep(2000);
		List<WebElement> verifyRemoveUser = driver.findElements(By.xpath("(//th[@ng-repeat='column in columns'])[3]"));

		if (verifyRemoveUser.contains("novak") == false) {

			System.out.println("UserName is deleted : ");

		} else {

			System.out.println("UserName is avilable ");

		}

	   

		

		

		

		

			

		
	   
	}
	
}
