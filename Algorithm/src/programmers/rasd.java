package programmers;

import java.util.*;

public class rasd {
	
	public static void main(String[] args) {
		System.out.println(solution(3, new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
		System.out.println(solution(3, new int[][] {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
		System.out.println(solution(5, new int[][] {{1, 1, 0, 0, 1}, {1, 1, 1, 0, 0}, {0, 1, 1, 0, 0}, {0, 0, 0, 1, 0}, {1, 0, 0, 0, 1}}));
		System.out.println(solution(5, new int[][] {{1,1,0,0,0},{1,1,0,0,0},{0,0,1,1,0},{0,0,1,1,0},{0,0,0,0,1}}));
		System.out.println(solution(5, new int[][] {{1,0,0,0,0},{0,1,0,0,0},{0,0,1,0,0},{0,0,0,1,0},{0,0,0,0,1}}));
	}
	
	static int res;

    public static int solution(int n, int[][] arr) {

        boolean[] visited = new boolean[n];
        res = 1;
        ArrayList<ArrayList<Integer>> alist = new ArrayList<>();

        for (int i = 0; i < arr[0].length; i++) {
            alist.add(new ArrayList<>());
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1 && i != j) {
                    alist.get(i).add(j);
                    visited[i] = visited[j] = true;
                }
            }
        }
        dfs(res, visited, alist);
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, alist);
                res++;
            }
        }

        return res;
    }

    private static void dfs(int n, boolean[] visited, ArrayList<ArrayList<Integer>> alist) {
        if (visited[n]) {
            return;
        }
        visited[n] = true;
        for (int i = 0; i < alist.get(n).size(); i++) {
            dfs(alist.get(n).get(i), visited, alist);
        }
    }

	
	

}
