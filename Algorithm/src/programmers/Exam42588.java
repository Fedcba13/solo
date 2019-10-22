package programmers;

public class Exam42588 {

	public static void main(String[] args) {

		int[] temp = solution(new int[] { 6, 9, 5, 7, 4 }); // {0,0,2,2,4}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + ", ");
		}
		System.out.println();
		temp = solution(new int[] { 3, 9, 9, 3, 5, 7, 2 }); // {0,0,0,3,3,3,6}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + ", ");
		}
		System.out.println();
		temp = solution(new int[] { 1, 5, 3, 6, 7, 6, 5 });// {0,0,2,0,0,5,6}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + ", ");
		}

	}

	public static int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		for(int i=0; i<heights.length;i++) {
			int temp = heights[i];
			for(int j=i; j>0; j--) {
				if(temp < heights[j]) {
					answer[i] = j+1;
					break;
				}
			}
		}
		return answer;
	}

}
