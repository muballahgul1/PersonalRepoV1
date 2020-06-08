import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenClass {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");
		FileInputStream file=new FileInputStream("C://webdrivers//Selenium.xlsx");
		XSSFWorkbook wordbook=new XSSFWorkbook(file);
		XSSFSheet sheet=wordbook.getSheet("sheet1");
		int rowcount=sheet.getLastRowNum();
		//int colcount=sheet.getRow(0).getLastCellNum();
		for (int i = 0; i < rowcount; i++) 
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell princeplecall=row.getCell(0);
			int princ=(int)princeplecall.getNumericCellValue();
			XSSFCell roi=row.getCell(1);
			int retofinterest=(int)roi.getNumericCellValue();
			XSSFCell period=row.getCell(2);
			int per=(int)period.getNumericCellValue();
			XSSFCell Freuency=row.getCell(0);
			String Freq=Freuency.getStringCellValue();
		
		}
	}
		


	}



