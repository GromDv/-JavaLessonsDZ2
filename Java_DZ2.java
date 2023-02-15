package Java_DZ2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Java_DZ2
 */
public class Java_DZ2 {

    public static void main(String[] args) {

        int indata[] = readData("input.txt");
        double pow = power(indata[1], indata[0]);

        System.out.printf("Число %d в степени %d  = %.2f\n", indata[1], indata[0], pow);

        String d_out = String.format("%.2f", pow);
        writeData("output.txt", d_out);
    }

    static double power(int a, int b) {
        double res = 1;
        int p = b;
        if (b < 0)
            p = -b;
        for (int i = 0; i < p; i++)
            res *= a;
        if (b < 0)
            return 1 / res;
        else
            return res;
    }

    static int[] readData(String file) {
        String line = "", arr[];
        int res[] = new int[2];
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(file));
            int i = 0;
            while ((line = bufReader.readLine()) != null) {
                arr = line.split(" ");
                res[i++] = Integer.valueOf(arr[1]);
            }
            bufReader.close();
        } catch (IOException ex) {
            System.out.println("Error reading!");
            System.out.println(ex.getMessage());
        }
        return res;
    }

    static void writeData(String file, String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(data);
        } catch (IOException ex) {
            System.out.println("Error writing!");
            System.out.println(ex.getMessage());
        }
    }
}