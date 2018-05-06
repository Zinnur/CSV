package parse;//Использование пользовательского разделителя для файлов CSV
//
/*Пользовательский разделитель может быть указан в конструкторе CSVReader или CSVWriter.
Давайте посмотрим на пример. Я изменил разделитель по умолчанию c запятой на точку с запятой.*/

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import au.com.bytecode.opencsv.CSVReader;

public class CustomSeperatorExample {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        //Build reader instance
        CSVReader reader = new CSVReader(new FileReader("data.csv"), ';', '"', 1);
        //Read all rows at once
        List<String[]> allRows = reader.readAll();
        //Read CSV line by line and use the string array as you want
        for(String[] row : allRows){
            System.out.println(Arrays.toString(row));
        }
    }
}