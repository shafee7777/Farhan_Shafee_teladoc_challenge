package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
	
public WebDriver driver;


	public NewAccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='btn btn-link pull-right']")
	WebElement addUser;
	
	public void getAddUser() {
		addUser.click();
	}
	@FindBy(xpath="//input[@name='FirstName']")
	WebElement firstName;
	
	public void getfirstName(String name) {
		firstName.sendKeys(name);
	}
	
	@FindBy(xpath="//input[@name='LastName']")
	WebElement lastname;
	
	public void getlastname(String lastName) {
		lastname.sendKeys(lastName);
	}
	@FindBy(xpath="//input[@name='UserName']")
	WebElement userName;
	
	public void getUserName(String username) {
		userName.sendKeys(username);
	}
	@FindBy(xpath="//input[@name='Password']")
	WebElement passWord;
	
	public void getPassword(String password) {
		passWord.sendKeys(password);
	}
	@FindBy(xpath="(//input[@type='radio'])[1]")
	WebElement radioButton;
	
	public void getradioButton() {
		radioButton.click();
	}
	@FindBy(xpath="//select[@name='RoleId']")
	WebElement dropDown;
	
	public void getDropdown() {
		Select dd=new Select(dropDown);
		dd.selectByVisibleText("Customer");
	}
	
	@FindBy(xpath="//input[@name='Email']")
	WebElement email;
	
	public void getEmail(String Email) {
		email.sendKeys(Email);;
	}
	@FindBy(xpath="//input[@name='Mobilephone']")
	WebElement cell;
	
	public void getCell() {
		cell.sendKeys("6567890528");
	}
	@FindBy(xpath="//button[@class='btn btn-success']")
	WebElement save;
	
	public void getSave() {
		save.click();
	}
	@FindBy(xpath="(//i[@class='icon icon-remove'])[3]")
	WebElement deleteUser;
	
	public void getDeleteUser() {
		deleteUser.click();
		}
	
@FindBy(xpath="//*[contains(text(),'Fshafee')]")
public WebElement uname;



@FindBy(xpath="//*[@placeholder='Search']")
public WebElement searchAgain;

public void getSearchAgain() {
	searchAgain.click();

	searchAgain.sendKeys("novak");
	}

}
