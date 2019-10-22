package success;


public class Exam12899 {

	public static void main(String[] args) {
		System.out.println(solution(81));
	}

	public static String solution(int n) {
		String answer = "";
		while (n != 0) {//3진수
			answer = (n % 3) + answer;
			n = n / 3;
		}
		
		for (int i = 0; i < answer.length(); i++) {//0인지 판별
			String value = answer.charAt(i) + "";
			if (!value.equals("0")) {
				continue;
			}
			int tmp1 = Integer.parseInt(answer.charAt(i - 1) + "");
			tmp1 = tmp1 - 1;

			answer = answer.substring(0, i - 1) + tmp1 + "3" + answer.substring(i + 1, answer.length());
			i = 0;
		}
		
		if((answer.charAt(0)+"").equals("0")) {
			answer = answer.substring(1, answer.length());
		}
		answer = answer.replace("3", "4");
		
		return answer;
	}

}