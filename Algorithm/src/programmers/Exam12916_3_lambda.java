package programmers;

public class Exam12916_3_lambda {

	public static void main(String[] args) {
		System.out.println(new Exam12916_3_lambda().solution("pPoooyY"));
		System.out.println(new Exam12916_3_lambda().solution("Pyy"));
	}

	boolean solution(String s) {
		long p = s.toLowerCase().chars().mapToObj(i -> (char) i).filter(i -> i == 'p').count();
		long y = s.toLowerCase().chars().mapToObj(i -> (char) i).filter(i -> i == 'y').count();

		return p == y ? true : false;
	}

}
