package kakao;

public class Exam05 {

	public static void main(String[] args) {
		int[][] answer = solution(5, new int[][] {{1,0,0,1},{1,1,1,1},{2,1,0,1},{2,2,1,1},{5,0,0,1},{5,1,0,1},{4,2,1,1},{3,2,1,1}});
		for(int i=0; i<answer.length; i++) {
			for(int j=0;j<answer[i].length;j++) {
				if(j==0) {
					System.out.print("[");
				}
				System.out.print(i);
				if(j == answer[i].length-1) {
					System.out.print("]");
				}else {
					System.out.print(",");
				}
			}
		}
	}
	
	 public static int[][] solution(int n, int[][] build_frame) {
	        int[][] answer = {};
	        return answer;
	    }
	
}
