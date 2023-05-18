package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP010 {
	@DataProvider(name="fetchdata")
	public static String[][] getData(){
		String[][] testData=null;
		try {
			FileInputStream fis=new FileInputStream("./testdata/TC010.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			int rowcount=sheet.getLastRowNum();
			int colunmcount=sheet.getRow(0).getLastCellNum();
			testData=new String[rowcount][colunmcount];
			for(int i=1;i<rowcount;i++) {
				XSSFRow row=sheet.getRow(i);
				for(int j=0;j<colunmcount;j++) {
					String celldata=row.getCell(j).getStringCellValue();
					System.out.println("The value of row "+i+" and colunm "+j+" is:"+celldata);
					testData[i-1][j]=celldata;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;
	}

	
	}


