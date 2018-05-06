import java.io.FileInputStream;
import java.io.IOException;

public class INPUT {
    public static void main(String args[]) throws IOException {
        FileInputStream inFile = new FileInputStream(
                "C://Users/Zinnur/IdeaProjects/Parsing_CSV-file/inputfile.txt");
        // /home/m128k145/workspace/Java/Test/testFile1

        byte[] str = new byte[inFile.available()];
        inFile.read(str);
        String text = new String(str);
        String[] numbers = text.split("([^-\\d])|(-\\D)");
        int size = Integer.parseInt(numbers[0]);
        int[][] matr = new int[size][size];
        int i = 0, j = 0, k = 1;
        for (i = 0; i < size; ++i)
            for (j = 0; j < size; ++j, ++k)
                if (!"".equals(numbers[k]))
                    matr[i][j] = Integer.parseInt(numbers[k]);
                else
                    --j;

        for (i = 0; i < size; ++i, System.out.println())
            for (j = 0; j < size; ++j, ++k)
                System.out.print(matr[i][j] + " ");

    }
}
