package lu;

import java.io.*;
import java.util.*;

public class b1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String[] arr = new String[n];

        for(int i=0;i<n;i++){
            arr[i]=br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() - o2.length() == 0){ // 길이가 같을 경우
                    return o1.compareTo(o2); // 사전에 등록된 순서로 나열된다
                } // 길이가 다를경우
                return o1.length() - o2.length(); // 길이순서로 나열된다
            }
        });
        for (int i = 0; i <n ; i++) {
            if (i + 1 != n){
                if (arr[i].equals(arr[i + 1])){
                    continue;
                }
            }
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
