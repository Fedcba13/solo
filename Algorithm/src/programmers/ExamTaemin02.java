package programmers;

public class ExamTaemin02 {
	
	static int answer; 

	public static void main(String[] args) {

		int[][] a = new int[][] { { 7, 11, 2, 7 }, { 1, 5 }, { 1, 2 }, { 4, 5 }, { 6, 1 }, { 3, 4 }, { 5, 3 }, { 3, 6 },
				{ 7, 6 }, { 6, 2 }, { 7, 2 }, { 3, 1 }, { 5, 7 } };
				
		sol(a);

		int[][] b = { { 10, 13, 3, 9 }, { 4, 5, 2 }, { 9, 2 }, { 8, 3 }, { 1, 10 }, { 8, 4 }, { 8, 6 }, { 4, 6 },
				{ 6, 3 }, { 7, 5 }, { 5, 9 }, { 9, 10 }, { 8, 5 }, { 8, 9 }, { 1, 4 } };
		
		sol(b);

	}
	
	public static void sol(int[][] value) {
		answer = value[0][1];
	}
	
	public static void asd() {
		
	}

}
