package lu;

import java.io.*;
import java.util.Comparator;
import java.util.Arrays;

public class b11650 {
    static class Point{
        int a;
        int b;

        Point(int a, int b){
            this.a = a;
            this.b = b;
        }

        static final Comparator<Point> y = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.b - o2.b;
            }
        };

        static final Comparator<Point> x = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return o1.a - o2.a;
            }
        };
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Point[] array = new Point[n];
        String[] s;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            s = str.split( " ");

            int c = Integer.parseInt(s[0]);
            int d = Integer.parseInt(s[1]);
            array[i] = new Point(c,d);
        }

        Arrays.sort(array, Point.y);
        Arrays.sort(array, Point.x);

        for (int i = 0; i < n; i++) {
            bw.write(Integer.toString(array[i].a));
            bw.write(" ");
            bw.write(Integer.toString(array[i].b));
            bw.write("\n");
        }
        bw.flush();
    }
}
