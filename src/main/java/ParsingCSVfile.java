import java.io.FileReader;
import java.io.IOException;
import au.com.bytecode.opencsv.CSVReader;

public class ParsingCSVfile {
    public static void main(String args[]) throws IOException {

        try (CSVReader reader = new CSVReader(new FileReader("data.csv"))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                System.out.println("Line 1: " + nextLine[0] + " Line two: "+ nextLine[0]);
            }
        }
    }
}


