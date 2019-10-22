package programmers;

public class Exam42889 {

	public static void main(String[] args) {
		int[] answer = solution(5, new int[] { 2, 1, 2, 6, 2, 4, 3, 3 }); // [3,4,2,1,5]
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ", ");
		}
		System.out.println();
		answer = solution(4, new int[] { 4, 4, 4, 4, 4 }); // [4,1,2,3]
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ", ");
		}
		System.out.println();
		answer = solution(5, new int[] { 5, 5, 4, 4, 2, 2,1,1,2,2 }); // [4,1,2,3]
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + ", ");
		}

	}

	public static int[] solution(int N, int[] stages) {

		int[] temp = new int[N + 1];
		float[] fail = new float[N];
		int[] index = new int[N];
		for (int i = 0; i < index.length; i++) {
			index[i] = i + 1;
		}

		for (int i = 0; i < stages.length; i++) {
			temp[stages[i] - 1]++;
		}
		
		int people = temp[temp.length -1 ];
		for (int i = fail.length - 1; i >= 0; i--) {
			people = people + temp[i];
			fail[i] = (float) temp[i] / people;
		}
		
		for(int i=0; i<fail.length; i++) {
			for(int j=0; j<fail.length-1-i;j++) {
				if(fail[j] < fail[j+1]) {
					float t = fail[j];
					fail[j] = fail[j+1];
					fail[j+1] = t;

					int a = index[j];
					index[j] = index[j+1];
					index[j+1] = a;
				}
			}
		}
/*
		for (int i = fail.length - 1; i >= 0; i--) {
			for (int j = fail.length - 1; j >= 0; j--) {
				if (i == j) {
					continue;
				}
				if (fail[i] < fail[j]) {
					float t = fail[i];
					fail[i] = fail[j];
					fail[j] = t;

					int a = index[i];
					index[i] = index[j];
					index[j] = a;
				}
			}
		}
*/
		int[] answer = index;
		return answer;
	}

}
