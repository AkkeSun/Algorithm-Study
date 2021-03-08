import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Practice {

	/*
	[음료수 얼려먹기]
	N x M 크기의 얼음틀 
	구멍이 뚫려 있는 부분은 0 
	칸막이가 존재하는 부분은 1 
	생성되는 총 아이스크림의 갯수는?

	입력  
	4, 5
	00110
	00011
	11111
	00000

	출력3
	 */
	
	public static int n=0, m=0;
	public static int [][] graph = new int[1000][1000];
	
	public static boolean dfs(int x, int y) {
		//주어진 범위를 벗어나는 경우에는 즉시 종료
		if(x<=-1 || x>=n || y<=-1 || y>=m) {
			return false;
		}
        // 현재 노드를 아직 방문하지 않았다면
        if (graph[x][y] == 0) {
            // 해당 노드 방문 처리
            graph[x][y] = 1;
            // 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x + 1, y);
            dfs(x, y + 1);
            return true;
        }
        return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine(); //버퍼 비우기 

		//그래프 생성
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				graph[i][j] = sc.nextInt();
			}
		}

		 int result = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                // 현재 위치에서 DFS 수행
	                if (dfs(i, j)) {
	                    result += 1;
	                }
	            }
	        }
	        System.out.println(result); // 정답 출력 


	} // main




} // class
