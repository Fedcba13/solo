package test;

public class ASD {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		// 1,1=>1 / 1,0 =>1 / 0,0=>0
		// 2진수의 자릿수는 n
		for (int i = 0; i < n; i++) {
			answer[i] = String.format("%" + n + "d", Long.parseLong(Integer.toBinaryString(arr1[i] | arr2[i])));
		}
		for (int i = 0; i < answer.length; i++) {
			while (answer[i].indexOf("0") != -1) {
				answer[i] = answer[i].replace('0', ' ');
			}
			while (answer[i].indexOf("1") != -1) {
				answer[i] = answer[i].replace('1', '#');
			}
			// for (int j = 0; j < n; j++) {
			// if (answer[i].charAt(j) == '1') {
			// answer[i] = answer[i].replace(answer[i].charAt(j), '#');
			// } else if (answer[i].charAt(j) == '0') {
			// answer[i] = answer[i].replace(answer[i].charAt(j), ' ');
			// }
			// }
			System.out.println(answer[i]);
		}
		return answer;

	}

	public static void main(String[] args) {
		new ASD().solution(5, new int[] { 9, 20, 28, 18, 11 }, new int[] { 30, 1, 21, 17, 28 });
		new ASD().solution(6, new int[] { 46, 33, 33, 22, 31, 50 }, new int[] { 27, 56, 19, 14, 14, 10 });
		new ASD().solution(12, new int[] { 46, 33, 33, 22, 31, 50, 46, 33, 33, 22, 31, 50 },
				new int[] { 4095, 56, 19, 14, 14, 10, 27, 56, 19, 14, 14, 10 });
	}

}
