package column.first;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class createRandomList {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 1000000; i++) {
            numbers.add(i + 1);
        }
        Collections.shuffle(numbers);

        try {
            writeNumberFile(numbers);
        } catch (Exception e1) {
            System.out.println("Unable to write file: " + e1);
        }
    }

    private static void writeNumberFile(@NotNull ArrayList<Integer> numbers) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("/home/alex/numbers.dat"));

        for (Integer n : numbers) {
            writer.write(n + System.getProperty("line.separator"));
        }
        writer.close();

    }
}

