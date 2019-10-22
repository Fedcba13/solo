package programmers;

public class Answer42895 {
	public static void main(String[] args) {
		Solution42895 a = new Solution42895();
		
		long start = System.currentTimeMillis();
		// 5 12 4 , 2 11 3
		int b = a.solution(5, 2365);
		System.out.println(a);
		long end = System.currentTimeMillis();
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
	}
	
	static class Solution42895 {
	    int answer = -1;

	    public int solution(int N, int number) {
	        dfs(N, 0, 0, number, "");
	        return answer;
	    }

	    public void dfs(int n, int pos, int num, int number, String s) {
	        if (pos > 8)
	            return;
	        if (num == number) {
	            if (pos < answer || answer == -1) {
	                System.out.println(s);
	                answer = pos;
	            }
	            return;
	        }
	        int nn=0;
	        for (int i = 0; i < 8; i++) {
	            nn=nn*10+n;
	            dfs(n, pos + 1+i, num + nn, number, s + "+");
	            dfs(n, pos + 1+i, num - nn, number, s + "-");
	            dfs(n, pos + 1+i, num * nn, number, s + "*");
	            dfs(n, pos + 1+i, num / nn, number, s + "/");
	        }
	        // dfs(n,pos+1,num*10+n,number,s+"5");
	    }
	}
}
