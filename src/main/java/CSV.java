import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.InputStream;

public class CSV {
    public static void main(String[] args) throws Exception {
        InputStream in = new FileInputStream("document.xls");
        // Внимание InputStream будет закрыт
        // Если нужно не закрывающий см. JavaDoc по POIFSFileSystem :  http://goo.gl/1Auu7
        HSSFWorkbook wb = new HSSFWorkbook(in);

        ExcelExtractor extractor = new ExcelExtractor(wb);
        extractor.setFormulasNotResults(false); // Считать формулы
        extractor.setIncludeSheetNames(true);

//        wb.setForceFormulaRecalculation(true);
// replace "wb" with your HSSFWorkbook/XSSFWorkbook object

        String text = extractor.getText();
        System.out.println(text);

    }
}


//        import java.io.FileInputStream;
//        import java.io.InputStream;
//        import java.util.Iterator;
//        import org.apache.poi.hssf.extractor.ExcelExtractor;
//        import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//        import org.apache.poi.ss.usermodel.*;
//
//public class CSV {
//
//    public static void main(String[] args) throws Exception {
//        InputStream in = new FileInputStream("example1.xls");
//        HSSFWorkbook wb = new HSSFWorkbook(in);
//
//        Sheet sheet = wb.getSheetAt(0);
//        Iterator<Row> it = sheet.iterator();
//        while (it.hasNext()) {
//            Row row = it.next();
//            Iterator<Cell> cells = row.iterator();
//            while (cells.hasNext()) {
//                Cell cell = cells.next();
//                int cellType = cell.getCellType();
//                switch (cellType) {
//                    case Cell.CELL_TYPE_STRING:
//                        System.out.print(cell.getStringCellValue() + "=");
//                        break;
//                    case Cell.CELL_TYPE_NUMERIC:
//                        System.out.print("[" + cell.getNumericCellValue() + "]");
//                        break;
//
//                    case Cell.CELL_TYPE_FORMULA:
//                        System.out.print("[" + cell.getNumericCellValue() + "]");
//                        break;
//                    default:
//                        System.out.print("|");
//                        break;
//                }
//            }
//            System.out.println();
//        }
//    }
//}