package FilesDataOps;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import Utils.*;

public class ExcelWrite {
	public String ExcelName = "ExcelGenerate.xlsx";
	public List<Sheet> sheetlist;

	public void ExcelCreate() {

		// create workbook
		HSSFWorkbook workbook = new HSSFWorkbook();

		HSSFSheet sheet = workbook.createSheet("Sheet1");
		
		
			Row row = sheet.createRow(0);

			// create first cell
			Cell cell = row.createCell(0);
			cell.setCellValue("Name");

			cell = row.createCell(1);
			cell.setCellValue("Age");

			for (int i = 0; i < 5; i++) {
				row = sheet.createRow(i + 1);
				row.createCell(0).setCellValue("aa" + i);
				row.createCell(1).setCellValue(i);
			}
			try {

				FileOutputStream fout = new FileOutputStream(FileContact.excelpath + ExcelName);
				workbook.write(fout);
				fout.close();
				System.out.println("Excel Create Sucessfully...");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
