package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.Pages;
import com.qa.utility.Excelutility;

public class TC_001 extends TestBase{
	
	@DataProvider(name="getdata")
	public String[][] getData() throws IOException {
		
		String xFile="C:\\Users\\Naveen M\\Downloads\\VIRTUSA\\TASKS\\TASK 2\\ClearTripData.xlsx";
		String xSheet="Sheet1";
		
		int rowCount = Excelutility.getRowCount(xFile, xSheet);
		int cellCount = Excelutility.getCellCount(xFile, xSheet, rowCount);
		System.out.println("rows = "+rowCount);
		System.out.println("cells = "+cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j] = Excelutility.getCellData(xFile, xSheet, i, j);
			}
		}
		return data;
}
	@Test(dataProvider = "getdata")
	public void getTest(String From, String To ) throws IOException, InterruptedException {
	PageFactory.initElements(driver, Pages.class);
	Thread.sleep(2000);
	
	//Pages.closebutton.click();
//    Thread.sleep(5000);
//    Pages.buttoncheck.click();
//    Thread.sleep(2000);
	
//	Pages.firstdropdown.click(); 
//	Thread.sleep(3000); 
//	
//	Pages.roundtrip.click();
//	Thread.sleep(3000); 
//	
//	Pages.seconddropdown.click(); 
//	Thread.sleep(3000);
//	
//	Pages.adult.click(); 
//	Thread.sleep(3000); 
//	
//	Pages.children.click();
//	Thread.sleep(3000); 
//	
//	Pages.Infants.click(); 
//	Thread.sleep(3000);
	
//	Pages.businessclass.click();
//	Thread.sleep(3000);
	
	Pages.wherefrom.click();
	Thread.sleep(3000);
	
	Pages.wherefrom.sendKeys(From+Keys.ENTER);
	Thread.sleep(3000);
	
	Pages.sourcesuggestion.click();
	Thread.sleep(3000);
	
	Pages.whereto.click();
	Thread.sleep(3000);
	
	Pages.whereto.sendKeys(To+Keys.ENTER);
	Thread.sleep(3000);
	
	Pages.destinationsuggestion.click();
	Thread.sleep(5000);
	
	Pages.searchflights.click();
	Thread.sleep(8000);
	
//	Pages.sourcedatelink.click();
//	Thread.sleep(2000);
//	Pages.sourcedate.click();
//	Thread.sleep(2000);
//	driver.navigate().to("https://www.cleartrip.com/");
//	Pages.wherefrom.clear();
//	Thread.sleep(4000);
//	Pages.whereto.clear();
//	Thread.sleep(2000);
	
//	driver.navigate().to("https://www.cleartrip.com/flights");
//	Thread.sleep(2000);
//	Pages.sourcedatelink.click();
//	Thread.sleep(2000);
//	Pages.sourcedate.click();
//	Thread.sleep(2000);
//	Pages.searchflights.click();
//	Thread.sleep(2000);
	
}
}
