package study.day1112;

public class Exam12917_3_lambda {

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));

	}

	public static String solution(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		s.chars().mapToObj(i -> (char) i)
				.sorted((i,j) -> Integer.compare(j, i))
				.forEach(sb::append);
	
		return "" + sb;
	}

}
