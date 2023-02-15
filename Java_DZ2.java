package Java_DZ2;

/**
 * Java_DZ2
 */
public class Java_DZ2 {

    public static void main(String[] args) {

        System.out.printf("Число %d в степени %d  = %.2f\n", 2, 3, power(2, 3));

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
}