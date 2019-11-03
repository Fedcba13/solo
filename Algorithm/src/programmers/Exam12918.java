package programmers;

public class Exam12918 {

	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}

	public static boolean solution(String s) {
		boolean answer = false;
		if (s.length() == 4 || s.length() == 6) {
			try {
				int temp = Integer.parseInt(s);
				answer = true;
			}catch(Exception e){
				
			}
		}
		return answer;
	}

}
