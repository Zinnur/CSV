import java.io.FileWriter;
import au.com.bytecode.opencsv.CSVWriter;

public class Solution  {
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

/*
public class Solution {

    public static void main(String[] args) {
        int[][] array = new int[2][2];

        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
//        for (int[] element : array) {
//            System.out.println(element);
//        }
    }
}
//    int n = 0; //line
//    int m = 0; //column*/
