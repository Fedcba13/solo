package study.day1119;

import java.util.stream.IntStream;

public class Exam12919 {

	public static void main(String[] args) {
		System.out.println(new Exam12919().solution(new String[] { "Jane", "Kim" }));
	}

	public String solution1(String[] seoul) {
		String answer = "";
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}
		return answer;
	}
	
	public String solution(String[] seoul) {
		
		StringBuilder sb = new StringBuilder();
		
		IntStream.range(0, seoul.length)
				.forEach(i -> {
					if(seoul[i].equals("Kim"))
						sb.append("김서방은 " + i + "에 있다");
				});
		
		return sb + "";
	}

}
