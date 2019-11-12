package study.day1112;

public class Exam12918 {

	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
	}

	public static boolean solution(String s) {
		if (s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s);
				return true;
			}catch(Exception e){
				return false;
			}
		}else {
			return false;
		}
	}

}
