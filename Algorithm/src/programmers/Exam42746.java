package programmers;

public class Exam42746 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 6, 10, 2 }));// 6210
		System.out.println(solution(new int[] { 12, 121 })); // 12121
		System.out.println(solution(new int[] { 21, 212 })); // 21221
		System.out.println(solution(new int[] { 3, 33, 21 })); // 0
	}

	public static String solution(int[] numbers) {
		String answer = "";

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				int temp1 = Integer.parseInt((numbers[i] + "").charAt(0) + "");
				int temp2 = Integer.parseInt((numbers[i + 1] + "").charAt(0) + "");
				if (temp1 < temp2) {
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
				}
			}
		}
		int index=0;
		while(index != numbers.length) {
			int a = 0;
			for(int i=index; i<numbers.length; i++) {
				
			}
		}

		return answer;
	}

}
