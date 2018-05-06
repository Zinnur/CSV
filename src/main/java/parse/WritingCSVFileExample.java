package parse;/*Создание нового CSV-файла
Создание CSV-файла так же просто, как и чтение. Создайте экземпляр
CSVWriter с соответствующими параметрами конфигурации и начните
записывать данные в файл CSV. Давайте посмотрим это на примере.*/

import java.io.FileWriter;
import au.com.bytecode.opencsv.CSVWriter;

public class WritingCSVFileExample  {
    public static void main(String[] args) throws Exception {
        String csv = "data.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));
        //Create record
        String [] record = "4,David,Miller,Australia,30".split(",");
        //Write the record to file
        writer.writeNext(record);
        //close the writer
        writer.close();
    }
}





