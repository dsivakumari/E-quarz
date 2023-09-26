package com.Pageobjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.Testbase;

public class Search_Functionality extends Testbase {
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement searchbar;

	@FindBy(xpath="//ul[@class='list-group list-group-flush']/li")
	List<WebElement> ele;

	@FindBy(xpath="(//a[@href='javascript:'])[3]")
	WebElement dropdown;

	public Search_Functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void validatesearch() throws InterruptedException 
	{

		searchbar.sendKeys(props.getProperty("product"));
		searchbar.sendKeys(Keys.ENTER);

}
	public void dropdownsearch() throws InterruptedException 
	{

		searchbar.sendKeys(props.getProperty("product"));
		Thread.sleep(3000);
		for(WebElement ele1 : ele)
		{
			System.out.println(ele1.getText());
		}


		//ul=new Utils();
		//Utils.dropdown(drop, "1");
		Thread.sleep(1000);
		dropdown.click();


		//searchbar.sendKeys(Keys.ENTER);

}

}