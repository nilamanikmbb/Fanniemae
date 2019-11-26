package excellearn;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	public static void main(String args[]) throws Exception {
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("Employee data");
		Map<String, Object[]> data=new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"ID","NAME","ADRESS"});
		data.put("2", new Object[] {"1","Ravi","Odisha"});
		data.put("3", new Object[] {"2","Hari","Telengana"});
		data.put("4", new Object[] {"3","Jumba","Mumbai"});
		data.put("5", new Object[] {"4","Hima","Punjab"});
		 Set<String> keyset = data.keySet();
	        int rownum = 0;
	        for (String key : keyset)
	        {
	            Row row = sheet.createRow(rownum++);
	            Object[] objArr = data.get(key);
	            int cellnum = 0;
	            for (Object obj : objArr)
	            {
	               Cell cell = row.createCell(cellnum++);
	               if(obj instanceof String) {
	                    cell.setCellValue((String)obj);
	               }
	                else if(obj instanceof Integer) {
	                    cell.setCellValue((Integer)obj);
	                }
	            }
	        }
	        FileOutputStream out = new FileOutputStream(new File("EmployeeData_Excel.xlsx"));
            book.write(out);
            out.close();
            System.out.println("howtodoinjava_demo.xlsx written successfully on disk.");
            
	}

}
