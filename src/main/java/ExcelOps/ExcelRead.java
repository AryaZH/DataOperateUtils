package ExcelOps;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Utils.FileContact;

public class ExcelRead {
	
	//方法一：使用WorkbookFactory 
    public void ReadExcel_M1() {
    	
    	FileInputStream readfile = null;  
    	Workbook wb = null;  
    	  
    	try {  
    		readfile = new FileInputStream(FileContact.excelpath+"ExcelGenerate.xlsx");  
    	    wb = WorkbookFactory.create(readfile);  
    	    
    	    int SheetNum = wb.getNumberOfSheets();
    	    System.out.println("Total Sheets: " + SheetNum); 
    	    
    	    for(int i=0; i < SheetNum; i++){  
          	  
                Sheet sheet = wb.getSheetAt(i);  
                System.out.println("Sheet_"+i+"_Name is: " +sheet.getSheetName());
                   
                Iterator<Row> rowIterator = sheet.iterator();  
                
                int rowCount=0;

                while (rowIterator.hasNext())   
                {  
                    System.out.print("第"+(rowCount++)+"行  ");
                    
                    Row row = rowIterator.next();  
                       
                    Iterator<Cell> cellIterator = row.cellIterator();
                    
                    int columnCount=0;  

                    while (cellIterator.hasNext())   
                    {  
                        System.out.print("第"+(columnCount++)+"列:  ");

                        Cell cell = cellIterator.next();
                        
                        switch(cell.getCellType()){  
                        case Cell.CELL_TYPE_STRING:  
                                System.out.print(cell.getStringCellValue()+"   ");    
                            break;  
                        case Cell.CELL_TYPE_NUMERIC:  
                            System.out.print(cell.getNumericCellValue()+"   ");  
                        }  
                    }                   
                    System.out.println(); 
                } 
            }      
    	    
    	} catch (IOException e) {  
    	    System.out.println(e.toString());  
    	} catch (InvalidFormatException e) {  
    	    System.out.println(e.toString());  
    	} finally {  
    	    try {  
    	    	readfile.close();  
    	    } catch (IOException e) {  
    	        System.out.println(e.toString());  
    	    }  
    	}  		
	}

	
}