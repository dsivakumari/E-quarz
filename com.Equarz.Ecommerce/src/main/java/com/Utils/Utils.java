package com.Utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.base.Testbase;
import com.mongodb.MapReduceCommand.OutputType;


public class Utils extends Testbase {


	private static final String filepath="C:\\Users\\Dell\\git\\Eccomerce_Project\\com.Equarz.Ecommerce\\src\\main\\java\\com\\testdata\\Address.xlsx"; //object declare chesukovadaniki

	public static String[][] readata(String sheetname) throws Throwable {
		
		//File file = new File("C:\\Users\\Dell\\Desktop\\Credentials.xlsx");
		File file =new File (filepath);
		
		FileInputStream stream = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(stream)
;
		XSSFSheet sheet = workbook.getSheet(sheetname);
		

		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(1).getLastCellNum();
		String[][] data = new String[rows - 1][columns];

		for (int i = 0; i < rows - 1; i++) {
			for (int j = 0; j < columns; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
			}
		}
		return data;
	}

	public static void dropdown(WebElement value, String text) {
		Select sel = new Select(value);
		sel.selectByValue(text);

	}


	

	public homepage1 Windowhandless(String window)
		{
			Set<String> handles = driver.getWindowHandles();
			for (String hand : handles) {
				if (!window.equals(hand)) {
					driver.switchTo().window(hand);
					driver.manage().window().maximize();

}
			}
			return new homepage1();  
			
		}
	public static void robo() throws Throwable
	{
		Robot robo=new Robot();
		robo.delay(3000);

		StringSelection upload=new StringSelection("C:\\Users\\Dell\\Desktop\\download");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upload, null);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		String currentDir = System.getProperty("user.dir");

		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

	}
}

