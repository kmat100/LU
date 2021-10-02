package lu;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class b10814 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        StringBuffer sb = new StringBuffer();

        n = s.nextInt();

        String[][] arr = new String[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = s.next();
            arr[i][1] = s.next();
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0]);
            sb.append(" ");
            sb.append(arr[i][1]);
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
