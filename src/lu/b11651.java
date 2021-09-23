package lu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class b11651 {
    static class Point{
        int a;
        int b;

        Point(int a, int b){
            this.a = a;
            this.b = b;
        }
        static Comparator<b11651.Point> x  = new Comparator<b11651.Point>() {
            @Override
            public int compare(b11651.Point o1, b11651.Point o2) {
                return o1.a - o2.a;
            }
        };

        static Comparator<b11651.Point> y = new Comparator<b11651.Point>() {
            @Override
            public int compare(b11651.Point o1, b11651.Point o2) {
                return o1.b - o2.b;
            }
        };
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        b11651.Point[] points = new b11651.Point[n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] s = str.split(" ");

            int c = Integer.parseInt(s[0]);
            int d = Integer.parseInt(s[1]);

            points[i] = new b11651.Point(c,d);
        }

        Arrays.sort(points, b11651.Point.x);
        Arrays.sort(points, b11651.Point.y);

        for (int i = 0; i < n; i++) {
            bw.write(Integer.toString(points[i].a) + ' ');
            bw.write(Integer.toString(points[i].b) + '\n');
        }
        bw.flush();
    }
}
