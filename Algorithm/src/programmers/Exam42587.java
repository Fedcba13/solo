package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Exam42587 {

	public static void main(String[] args) {
		// [2, 1, 3, 2] 2 1
		// [1, 1, 9, 1, 1, 1] 0 5
		// System.out.println(solution(new int[] { 2, 1, 3, 2 }, 2));
		// System.out.println(solution(new int[] { 1, 1, 9, 1, 1, 1 }, 0));
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6, 6 }, 5));
		System.out.println(solution(new int[] { 2, 2, 2, 1, 3, 4 }, 3));
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6 }, 2));

	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;
		Queue<Integer> que = new LinkedList<Integer>();
		Queue<Integer> index = new LinkedList<Integer>();
		for (int i = 0; i < priorities.length; i++) {
			que.offer(priorities[i]);
		}

		for (int i = 0; i < priorities.length; i++) {
			index.offer(i);
		}
		int maxindex = 0;
		int max = 0;
		do {
			maxindex = index.peek();
			max = que.peek();
			int temp = 0;
			do {
				que.offer(que.poll());
				index.offer(index.poll());
				if (que.peek() > max) {
					max = que.peek();
					maxindex = index.peek();
					temp = 0;
				} else {
					temp = temp + 1;
				}
			} while (temp != que.size());
			
			index.poll();
			que.poll();
			answer++;

		} while (location != maxindex);
		return answer;
	}
}

/*
 * int maxindex = 0; int max = priorities[0]; for (int i = 0; i <
 * priorities.length; i++) { if (priorities[i] > max) { max = priorities[i];
 * maxindex = i; } }
 * 
 * for (int i = maxindex; i < priorities.length; i++) { answer = answer + 1; if
 * (i == location) { break; } if (i == (priorities.length - 1)) { i = -1;
 * continue; } }
 */

/*
 * int index = -1; do { index++; if (index == priorities.length) { index = 0; }
 * for (int i = 0; i < priorities.length; i++) { if (priorities[i] == 0) {
 * continue; } if (priorities[i] > priorities[index]) { index = i; } }
 * 
 * priorities[index] = 0; answer++;
 * 
 * } while (location != index);
 */
