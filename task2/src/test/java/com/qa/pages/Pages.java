package com.qa.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Pages {

	WebDriver Driver;
	
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/*[1]")
	public static WebElement closebutton;
	
//	@FindBy(xpath="//div[contains(text(),'Hotels')]")
//	public static WebElement buttoncheck;
	
	@FindBy(xpath="//span[contains(text(),'One way')]")
	public static WebElement firstdropdown;
	
	@FindBy(xpath="//span[contains(text(),'Round trip')]")
	public static WebElement roundtrip;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]/*[1]")
	public static WebElement seconddropdown;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/*[1]")
	public static WebElement adult;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/*[1]")
	public static WebElement children;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[3]/ul[1]/li[3]/*[1]")
	public static WebElement Infants;
	
	@FindBy(xpath="//div[contains(text(),'Business class')]")
	public static WebElement businessclass;
	
	
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement wherefrom;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/input[1]")
	public static WebElement whereto;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]")
	public static WebElement sourcesuggestion;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]")
	public static WebElement destinationsuggestion;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/div[1]")
	public static WebElement sourcedatelink;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/div[6]/div[1]/div[1]")
	public static WebElement sourcedate;
	
	@FindBy(xpath="//span[contains(text(),'Search flights')]")
	public static WebElement searchflights;
}
