package CsvToExcel;

import org.apache.log4j.Logger;

public class AppMain {

    private static Logger logger = Logger.getLogger(AppMain.class);

    public static void main(String[] args) {

        String xlsLoc = "C:\\Users\\Zinnur\\IdeaProjects\\Parsing_CSV-file\\",
                csvLoc = "C:\\Users\\Zinnur\\IdeaProjects\\Parsing_CSV-file\\example1.csv", fileLoc = "";
        fileLoc = CsvToExcel.convertCsvToXls(xlsLoc, csvLoc);
        logger.info("File Location Is?= " + fileLoc);
    }
}
