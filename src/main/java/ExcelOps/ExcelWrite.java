package ExcelOps;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWrite{
    
    public static void main(String[] args) {
         
    	//create workbook
    	HSSFWorkbook workbook = new HSSFWorkbook();
    	       
    	//create sheet 
    	HSSFSheet sheet = workbook.createSheet("Test");
    	
    	//create row: add head 0 row
    	HSSFRow row = sheet.createRow(0);
    	
    	//create first cell
    	HSSFCell cell = row.createCell(0);
    	cell.setCellValue("Name");
        
        //create second cell
        cell = row.createCell(1);           
        cell.setCellValue("Age");  
        // cell.setCellStyle(style);  
        
        
       for (int i = 0; i < 5; i++) {  
            row = sheet.createRow(i+1);  
            row.createCell(0).setCellValue("aa"+i);  
            row.createCell(1).setCellValue(i);  
        }    
        try {  
            FileOutputStream fout = new FileOutputStream("ExcelFiles/ExcelGenerate.xlsx");  
            workbook.write(fout);  
            fout.close();  
            System.out.println("Excel Create Sucessfully...");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
      
}
