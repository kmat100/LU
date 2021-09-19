package ebaekfifty_one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class lu_coord2 {
    static class Point{
        int a;
        int b;

        Point(int a, int b){
            this.a = a;
            this.b = b;
        }
        static Comparator<Point> x  = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.a - o2.a;
            }
        };

        static Comparator<Point> y = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.b - o2.b;
            }
        };
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Point[] points = new Point[n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] s = str.split(" ");

            int c = Integer.parseInt(s[0]);
            int d = Integer.parseInt(s[1]);

            points[i] = new Point(c,d);
        }

        Arrays.sort(points, Point.x);
        Arrays.sort(points, Point.y);

        for (int i = 0; i < n; i++) {
            bw.write(Integer.toString(points[i].a) + ' ');
            bw.write(Integer.toString(points[i].b) + '\n');
        }
        bw.flush();
    }
}
