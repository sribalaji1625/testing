package org.createnew;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class pomtry extends BaseClass {

	public pomtry() {
	PageFactory.initElements(driver,this);
	
}
	
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement lastname;
	
	public WebElement getfirstname() {
	return firstname;
	
}
	public WebElement getlastname() {
	return lastname;
	
}
	@FindBy(xpath="//input[@type='password']")
	private WebElement password1;
	public WebElement password() {
	return password();
	}
	
	@FindBy(xpath="//input[@type='text'])[5]")
	private WebElement moblienumber;
	public WebElement moblienumber() {
	return moblienumber;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement pombuttonclick;
	public WebElement pombuttonclick() {
		return pombuttonclick();
		
	}
	@FindBy(xpath="//input[@value='2']")
	private WebElement genderradio;
	public WebElement genderradio() {
		return genderradio();
	}
	
	@FindBy(id="day")
		private WebElement day;
	public WebElement day() {
		return day;
	}
	
	@FindBy(id="month")
	private WebElement month;
	public WebElement month() {
		return month;
	}
	
	@FindBy(id="year")
	private WebElement year;
	public  WebElement year() {
return year;
}

	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
}
