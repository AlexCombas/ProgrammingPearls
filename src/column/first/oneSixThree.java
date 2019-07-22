package column.first;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class oneSixThree {

    public static void main(String[] args) {
        int BITSPERWORD = 32;
        int N = 10000000;
        int SHIFT = 5;
        int MASK = 0x1F;
        int[] a = new int[1 + N / BITSPERWORD];

        // Read the random data into the array
        try {
            a = readNumbers();
        } catch (Exception e1) {
            System.out.println("Unable to read file: " + e1);
        }

        // set the array
        for (int x = 0; x < a.length; x++) {
            a[x >> SHIFT] |= (1 << (x & MASK));
        }

        // test the array is now sorted
        for (int j = 0; j < a.length; j++) {
            if ((a[j >> SHIFT] & (1 << (j & MASK))) != 0) {
                System.out.println(j);
            }
        }
    }

    private static int[] readNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/home/alex/numbers.dat"));
        int BITSPERWORD = 32;
        int N = 10000000;
        int[] numbers = new int[1 + N / BITSPERWORD];
        String line;
        int counter = 0;
        while ((line = reader.readLine()) != null) {
            numbers[counter] = Integer.valueOf(line);
            counter++;
        }
        return numbers;
    }
}

