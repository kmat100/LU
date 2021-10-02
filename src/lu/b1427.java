package lu;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class b1427 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        String num = sc.nextLine();

        String[] arr = num.split(" ");

        Arrays.sort(arr, Comparator.reverseOrder());

        for (String string : arr) {
            System.out.print(string + " ");
        }
    }
}
