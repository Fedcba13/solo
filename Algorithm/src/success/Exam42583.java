package success;

import java.util.LinkedList;
import java.util.Queue;

public class Exam42583 {

	public static void main(String[] args) {
		System.out.println(solution(2, 10, new int[] { 7, 4, 5, 6 }));
		System.out.println(solution(2, 15, new int[] { 5, 5, 5, 5 }));
		System.out.println(solution(3, 10, new int[] { 10, 10 }));
		System.out.println(solution(3, 10, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }));

	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {

		int[] temp = new int[bridge_length];
		int index = 0;

		int answer = 0;
		int tmpweight = 0;

		while (index != truck_weights.length || tmpweight != 0) {
			answer++;
			tmpweight = tmpweight - temp[bridge_length - 1];

			for (int i = bridge_length - 2; i >= 0; i--) {
				temp[i + 1] = temp[i];
			}

			temp[0] = 0;

			if (index != truck_weights.length && weight - tmpweight >= truck_weights[index]) {
				temp[0] = truck_weights[index];
				tmpweight = tmpweight + truck_weights[index];
				index = index + 1;
			}

		}

		return answer;
	}

}
