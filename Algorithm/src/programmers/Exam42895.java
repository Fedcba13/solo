package programmers;

import java.util.ArrayList;

public class Exam42895 {
//처음 생각했던 알고리즘
	public static void main(String[] args) {
		// 5 12 4 , 2 11 3
		int a = solution(5, 5000);
		System.out.println(a);
	}

	public static int solution(int N, int number) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();

		int temp = 0;
		String strtemp = "";
		int cnt = 0;
		do {
			strtemp = strtemp + "1";
			temp = Integer.parseInt(strtemp);
			cnt++;
			a.add(temp);
			b.add(cnt);
		} while (temp < 32000 && temp < number);

		temp = 0;
		strtemp = "";
		cnt = 0;
		do {
			strtemp = strtemp + N + "";
			temp = Integer.parseInt(strtemp);
			cnt++;
			a.add(temp);
			b.add(cnt);
		} while (temp < 32000 && temp < number);

		temp = 1;
		cnt = 0;
		do {
			temp = temp * N;
			cnt++;
			a.add(temp);
			b.add(cnt);
		} while (temp < 32000 && temp < number);

		for (int i = 0; i < a.size(); i++) {
			for (int j = i; j < a.size(); j++) {
				if (a.get(i) == a.get(j) && i != j) {
					if (b.get(i) > b.get(j)) {
						a.remove(i);
						b.remove(i);
					} else {
						a.remove(j);
						b.remove(j);
					}
				}
			}
		}

		// 정렬
		for (int i = 0; i < a.size(); i++) {
			for (int j = i; j < a.size(); j++) {
				if (i == j) {

				} else {
					if (a.get(i) / b.get(i) < a.get(j) / b.get(j)) {
						int tempa = a.get(i);
						a.set(i, a.get(j));
						a.set(j, tempa);
						int tempb = b.get(i);
						b.set(i, b.get(j));
						b.set(j, tempb);
					}
				}
			}
		}
		int tmp = 0;
		for(int i = 0; i< a.size(); i++) {
			if(number > a.get(i)) {
				tmp = a.get(i-1);
				break;
			}
		}

		return Math.min(sol(number, a, b), sol(tmp, a, b) + sol(tmp - number, a, b)) > 8 ? -1 : Math.min(sol(number, a, b), sol(tmp, a, b) + sol(tmp - number, a, b));
	}

	public static int sol(int number, ArrayList<Integer> a, ArrayList<Integer> b) {
		if(number == 0) {
			return 0;
		}
		int answer = 0;
		int division = 0;

		for (int i = 0; i < a.size(); i++) {
			String tmp = "";
			for (int j = 0; j < b.get(i); j++) {
				tmp = tmp + "1";
			}
			if (tmp.length() > 0 && Integer.parseInt(tmp) == a.get(i)) {
				int share = number / a.get(i);
				if (share > 0) {
					division = 1;
				}
				answer = answer + (b.get(i) * share);
				number = number - (share * a.get(i));
			} else {
				int share = number / a.get(i);
				answer = answer + (b.get(i) * share);
				number = number - (share * a.get(i));
			}
			if(answer > 8) {
				break;
			}
		}

		answer = answer + division;
		if (answer > 8) {
			answer = 9;
		}

		return answer;
	}

}
