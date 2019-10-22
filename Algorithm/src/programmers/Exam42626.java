package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class Exam42626 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 9, 10, 12 }, 7));
		System.out.println(solution(new int[] { 10, 12 }, 700));
	}

	public static int solution(int[] scoville, int K) {

		Arrays.sort(scoville);

		int answer = 0;

		ArrayList<Integer> init = new ArrayList<>();
		for (int i = 0; i < scoville.length; i++) {
			init.add(scoville[i]);
		}

		while (init.get(0) < K && init.size() >= 2) {
			int add = init.get(0) + (init.get(1) * 2);
			init.remove(0);
			init.remove(0);
			if (init.size() == 0) {
				init.add(add);
			} else {
				for (int i = 0; i < init.size(); i++) {
					if (add < init.get(i)) {
						init.add(i, add);
						break;
					}
					if (i == init.size() - 1) {
						init.add(add);
						break;
					}
				}
			}
		}

		if (init.get(0) >= K) {
			answer = scoville.length - init.size();
		} else {
			answer = -1;
		}

		return answer;
	}

}
