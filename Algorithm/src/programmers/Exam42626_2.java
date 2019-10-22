package programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Exam42626_2 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 9, 10, 12 }, 7));
		System.out.println(solution(new int[] { 1,2, 5, 16, 48, 200, 400 }, 700));
		System.out.println(solution(new int[] { 10, 12 }, 700));
	}

	public static int solution(int[] scoville, int K) {

		Arrays.sort(scoville);
		Queue<Integer> queue = new LinkedList<>();

		int size = scoville.length;
		int answer = 0;
		int index = 0;

		while (true) {
			if (size - index + queue.size() < 2) {
				break;
			}
			int temp1;
			int temp2;
			if (queue.isEmpty()) {
				temp1 = scoville[index];
				index++;
				temp2 = scoville[index];
				index++;
			} else {
				if (size - index == 1) {
					if (scoville[index] < queue.peek()) {
						temp1 = scoville[index];
						index++;
						temp2 = queue.poll();
					} else {
						temp1 = queue.poll();
						if (queue.isEmpty()) {
							temp2 = scoville[index];
							index++;
						} else {
							if (scoville[index] < queue.peek()) {
								temp2 = scoville[index];
								index++;
							} else {
								temp2 = queue.poll();
							}
						}
					}
				} else if (size - index == 0) {
					temp1 = queue.poll();
					temp2 = queue.poll();

				} else {
					if (scoville[index] < queue.peek()) {
						temp1 = scoville[index];
						index++;
					} else {
						temp1 = queue.poll();
					}
					if (queue.isEmpty()) {
						temp2 = scoville[index];
						index++;
					} else {
						if (scoville[index] < queue.peek()) {
							temp2 = scoville[index];
							index++;
						} else {
							temp2 = queue.poll();
						}

					}
				}
			}
			
			queue.add(temp1 + (temp2 * 2));
			answer++;
			
			if(queue.peek() >= K && (index == size || scoville[index] >= K)) {
				break;
			}
		}
		
		if(queue.peek() >= K && (index == size || scoville[index] >= K)) {
			return answer;
		}else {
			return -1;
		}
	}

}
