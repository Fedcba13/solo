package programmers.success;

import java.util.ArrayList;

public class Exam42891 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 3, 1, 2 }, 200));
		System.out.println(solution(new int[] { 31, 11, 22, 12, 14, 17 }, 12));
		System.out.println(solution(new int[] { 4, 1, 2 }, 7));
		System.out.println(solution(new int[] { 3, 1, 2 }, 8));

	}

	public static int solution(int[] food_times, long k) {
		int mok = (int) (k / food_times.length);

		ArrayList<Integer> temp = new ArrayList<>();
		ArrayList<Integer> tempindex = new ArrayList<>();
		long total = 0;
		long dk = k;

		for (int i = 0; i < food_times.length; i++) {
			int t = food_times[i];
			total = total + t;
			if (t > mok) {
				temp.add(t - mok);
				tempindex.add(i + 1);
				k = k - mok;
			} else {
				k = k - t;
			}
		}

		if (dk >= total) {
			return -1;
		}

		mok = (int) (k / temp.size());

		while (mok != 0) {
			for (int i = 0; i < temp.size(); i++) {
				int t = temp.get(i);
				if (t > mok) {
					temp.set(i, t - mok);
					k = k - mok;
				} else {
					k = k - t;
					temp.remove(i);
					tempindex.remove(i);
					i--;
				}
			}
			mok = (int) (k / temp.size());
		}

		return tempindex.get((int) k);
	}
}