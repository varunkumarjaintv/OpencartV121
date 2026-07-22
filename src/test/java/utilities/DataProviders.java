package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	@DataProvider(name = "loginDDT")
	public String[][] loginDataProvider() throws IOException{
		
		String path = ".\\testData\\Opencart_LoginData.xlsx";
		ExcelUtility xutil = new ExcelUtility(path);
		
		 int totalrows = xutil.getRowCount("Sheet1");
		 int totalcols = xutil.getCellCount("Sheet1", 1);
		 
		 String[][] loginData = new String[totalrows][totalcols];
		 
		 for(int r=1; r<=totalrows; r++) {
			 for(int c=0; c<totalcols; c++) {
				loginData[r-1][c] = xutil.getCellData("Sheet1", r, c);
			 }
		 }
		 return loginData;
	}

}
