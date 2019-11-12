package study.day1112;

public class Exam12916_2 {

	public static void main(String[] args) {
		System.out.println(new Exam12916_2().solution("pPoooyY"));
		System.out.println(new Exam12916_2().solution("Pyy"));
	}

	boolean solution(String s) {
		int cnt = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				cnt++;
			} else if (s.charAt(i) == 'y') {
				cnt--;
			}
		}
		return cnt == 0 ? true : false;
	}

}
