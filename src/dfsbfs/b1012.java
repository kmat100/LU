package dfsbfs;

import java.util.*;

public class b1012 {
    static int node[][]; // 배추밭 배열
    static int check[][]; // 배추방문 배열
    static int cnt = 0; // 배추의 묶음을 카운트 할 변수


    static ArrayList<Integer> array = new ArrayList<>(); // 각 테스트케이스마다의 결과를 저장할 어레이 리스트

    static void dfs(int x, int y) { // DFS탐색을 수행 할 메소드

        check[x][y] = 1; // 방문여부 표시


        // 기준점의 동서남북을 확인한다 자세한 코드설명은 단지번호 붙이기를 참고
        if (y < node[x].length - 1 && node[x][y + 1] == 1 && check[x][y + 1] == 0) {
            dfs(x, y + 1);
        }

        if (x < node.length - 1 && node[x + 1][y] == 1 && check[x + 1][y] == 0) {
            dfs(x + 1, y);
        }

        if (y > 0 && node[x][y - 1] == 1 && check[x][y - 1] == 0) {
            dfs(x, y - 1);
        }

        if (x > 0 && node[x - 1][y] == 1 && check[x - 1][y] == 0) {
            dfs(x - 1, y);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스


        for (int i = 0; i < t; i++) {
            int m = sc.nextInt(); // 배추밭 가로길이
            int n = sc.nextInt(); // 배추밭 세로길이
            int k = sc.nextInt(); // 배추 개수

            node = new int[n][m];
            check = new int[n][m];
            cnt = 0;

            for (int j = 0; j < k; j++) { // 배추 위치 입력
                int a = sc.nextInt();
                int b = sc.nextInt();
                node[b][a] = 1;
            }

            for (int j = 0; j < node.length; j++) {
                for (int g = 0; g < node[j].length; g++) {
                    if (node[j][g] == 1 && check[j][g] == 0) { // 배추가 심어져있고 방문하지 않았던 배추를 인자로 전달

                        cnt++; // 배추의 묶음마다 cnt증가
                        dfs(j, g);
                    }
                }
            }
            array.add(cnt); // 테스트케이스마다 배추의 묶음 수를 저장
        }
        for (int i = 0; i < array.size(); i++) { // 출력
            System.out.println(array.get(i));
        }
    }
}

