package lu;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;


public class b2751 { //
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        String str = br.readLine();      // 1번
//        int n = Integer.parseInt(str);   // 1번
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

//        int[] num = new int[n]; // 1번

        for (int i = 0; i < n; i++) {
//            str = br.readLine();  // 1번
//            num[i] = Integer.parseInt(str); // 1번
            arr.add(Integer.parseInt(br.readLine()));
        }

//        Arrays.sort(str);  // 1번
        Collections.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr.get(i) + "\n");

//            bw.write(String.valueOf(num[i])); // 1번
//            bw.write('\n'); // 1번
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
