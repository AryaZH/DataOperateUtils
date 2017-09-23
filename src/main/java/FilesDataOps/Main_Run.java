package FilesDataOps;

import java.io.IOException;

public class Main_Run {

	public static void main(String[] args) throws IOException {
		
		ExcelWrite ew = new ExcelWrite();
    	ew.ExcelCreate();
		
		ExcelRead er = new ExcelRead();
		//er.ReadExcel();
		
		er.ReadExcel_M1();
   
	}

}
