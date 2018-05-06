package parse;/*Добавление к уже существующему CSV-файлу

Вышеприведенный пример создает новый CSV-файл и начинает записывать данные с начала.
Но хотелось бы добавлять данные в существующий файл CSV вместо того,
чтобы создавать новый файл. Вы можете достичь этой функциональности,
передав второй аргумент экземпляру FileWriter.*/

import java.io.FileWriter;
import au.com.bytecode.opencsv.CSVWriter;

public class AppendToCSVExample {
    public static void main(String[] args) throws Exception {
        String csv = "data.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] record = "3,David,Feezor,USA,40".split(",");
        writer.writeNext(record);
        writer.close();
    }
}
