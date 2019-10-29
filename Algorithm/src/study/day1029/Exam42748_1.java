package study.day1029;

public class Exam42748_1 {
	
	//https://programmers.co.kr/learn/courses/30/lessons/42748
	
	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] result = new Exam42748_1().solution(array, commands);
		for(int i=0; i<result.length; i++) {
			if(i != 0) System.out.print(", ");
			System.out.print(result[i]);
		}
		
	}
	
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {// commands의 개수만큼 for문을 돌립니다.
			int tempLength = commands[i][1] - commands[i][0] + 1;
			int[] temp = new int[tempLength];
			int cnt = 0;
			for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {//commands의 명시된 만큼 잘라서 temp에 넣습니다.
				temp[cnt] = array[j];
				cnt++;
			}
			for (int k = 0; k < temp.length; k++) {//정렬 하는 부분입니다.
				for (int l = k; l < temp.length; l++) {
					if (temp[k] > temp[l]) {
						int tmp = temp[k];
						temp[k] = temp[l];
						temp[l] = tmp;
					}
				}
			}
			answer[i] = temp[commands[i][2] - 1]; // 답에 추가합니다.
		}
		return answer;
    }

}
