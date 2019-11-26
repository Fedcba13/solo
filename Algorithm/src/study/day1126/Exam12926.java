package study.day1126;

public class Exam12926 {
	public static void main(String[] args) {
		System.out.println(new Exam12926().solution("AB", 1));
		System.out.println(new Exam12926().solution("z", 1));
		System.out.println(new Exam12926().solution("a B z", 4));
		System.out.println(new Exam12926().solution("ab", 1));
		System.out.println(new Exam12926().solution("AaZz", 25));
	}

	public static String solution1(String s, int n) {
		String answer = "";
		StringBuilder temp = new StringBuilder(s);
		for (int i = 0; i < temp.length(); i++) {
			if (temp.charAt(i) == ' ') {

			} else if (temp.charAt(i) <= 'Z') {
				char tmp = (char) (temp.charAt(i) + n);
				if (tmp > 'Z') {
					tmp = (char) (tmp - 26);
				}
				temp.setCharAt(i, tmp);
			} else {
				char tmp = (char) (temp.charAt(i) + n);
				if (tmp > 'z') {
					tmp = (char) (tmp - 26);
				}
				temp.setCharAt(i, tmp);
			}
		}
		answer = temp + "";
		return answer;
	}

	public String solution2(String s, int n) {
		StringBuilder answer = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp == ' ') {

			} else if (temp <= 'Z') {
				temp += n;
				if (temp > 'Z') {
					temp -= 26;
				}
			} else {
				temp += n;
				if (temp > 'z') {
					temp -= 26;
				}
			}
			answer.append(temp);
		}
		return answer + "";
	}
	
	public String solution(String s, int n) {
		StringBuilder result = new StringBuilder();
		s.chars().forEach(i -> {
			if(i == ' ') {
				
			}else if(i <= 'Z') {
				i += n;
				if (i > 'Z') {
					i -= 26;
				}
			}else {
				i += n;
				if (i > 'z') {
					i -= 26;
				}
			}
			result.append((char)i);
		});
		return result + "";
	}

}
