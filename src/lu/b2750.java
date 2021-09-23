package lu;

import java.util.Arrays;
import java.util.Scanner;

public class b2750 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            x[i] = scanner.nextInt();
        }
        Arrays.sort(x);

        for (int i = 0; i < num; i++) {
            System.out.println(x[i]);
        }
    }
}