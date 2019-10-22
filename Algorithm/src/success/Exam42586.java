package success;

import java.util.ArrayList;

public class Exam42586 {

	public static void main(String[] args) {
		int[] temp = solution(new int[] { 93, 30, 55 }, new int[] { 1, 30, 100 });
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

	}

	public static int[] solution(int[] progresses, int[] speeds) {
		int[] result = new int[progresses.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i]
					: (100 - progresses[i]) / speeds[i] + 1;
		}
		ArrayList<Integer> temp = new ArrayList<>();
		int tmpcnt = 0;
		int tmp = result[0];
		for(int i=0; i<result.length; i++) {
			if(tmp >= result[i] ) {
				tmpcnt++;
			}else {
				temp.add(tmpcnt);
				tmpcnt = 0;
				tmp = result[i];
				i--;
			}
			if(i == result.length-1) {
				temp.add(tmpcnt);
				break;
			}
		}
		int[] answer = new int[temp.size()];
		for(int i=0; i<answer.length;i++) {
			answer[i] = temp.get(i);
		}
		return answer;
	}

}
