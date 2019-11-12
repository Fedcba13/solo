package study.day1112;

public class Exam12917_2 {

	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));

	}

	public static String solution(String s) {
		
		char[] charArr = s.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			int cnt = 0;
			for(int j=0; j<charArr.length-i-1; j++) {
				if(charArr[j] < charArr[j+1]) {
					char temp = charArr[j];
					charArr[j] = charArr[j+1];
					charArr[j+1] = temp;
					cnt++;
				}
			}
			if(cnt == 0) {
				break;
			}
		}

		return new String(charArr);
	}

}
