package study.day1112;

public class Exam17681 {

	public static void main(String[] args) {
		String[] result = new Exam17681().solution(5, new int[] { 9, 20, 28, 18, 11 }, new int[] { 30, 1, 21, 17, 28 });
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println("\n\n\n");

		result = new Exam17681().solution(6, new int[] { 46, 33, 33, 22, 31, 50 },
				new int[] { 27, 56, 19, 14, 14, 10 });
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println("\n\n\n");

		result = new Exam17681().solution(1, new int[] { 1 }, new int[] { 0 });
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		System.out.println("\n\n\n");
		
		System.out.println(String.format("%05s", "111"));

	}

	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder(Integer.toBinaryString(arr1[i] | arr2[i]));

			while (sb.length() < n) {
				sb.insert(0, "0");
			}

			while (sb.indexOf("0") != -1) {
				sb.replace(sb.indexOf("0"), sb.indexOf("0") + 1, " ");
			}

			while (sb.indexOf("1") != -1) {
				sb.replace(sb.indexOf("1"), sb.indexOf("1") + 1, "#");
			}

			answer[i] = sb.toString();

		}

		return answer;
	}

}
