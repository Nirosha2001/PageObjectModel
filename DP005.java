package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP005 {
@DataProvider(name="fetchdata")
public static String[][] getData(){
	String[][] testData=null;
	try {
		FileInputStream fis=new FileInputStream("./testdata/TC005.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		int columncount=sheet.getRow(0).getLastCellNum();
		testData=new String[rowcount][columncount];
		for(int i=1;i<=rowcount;i++) {
		 XSSFRow row=sheet.getRow(i);
		 for(int j=0;j<columncount;j++) {
			 String celldata=row.getCell(j).getStringCellValue();
			 System.out.println("The value of row "+i+" and column "+j+" is:"+celldata);
			 testData[i-1][j]=celldata;
			 
		 }
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return testData;
	
	
}

}
