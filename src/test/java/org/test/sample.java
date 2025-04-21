package org.test;

import org.createnew.pomtry;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class sample extends BaseClass {
	 
	public static void main(String[] args) {
		browserLaunch("chrome");
		url("https://www.facebook.com/");
		
		btnclick(driver.findElement(By.xpath("(//a[@role='button'])[2]")));
         	
	   wait(3);
	   
	   pomtry p = new pomtry();
	   sendkeys(p.getfirstname(),"sri");
	   sendkeys(p.getlastname(), "balu");
	   select(p.day(), "14");
	   select(p.month(), "feb");
	   select(p.year(), "2020");
	   genderradiobutton(p.genderradio());
	   sendkeys(p.moblienumber(), "6383647686");
	 
	   sendkeys(p.password(), "12345");
	   btnclick(p.pombuttonclick());
	   
	   
	   
	   
	   
	}

	

		
	}


