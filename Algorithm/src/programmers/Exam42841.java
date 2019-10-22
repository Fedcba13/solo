package programmers;

public class Exam42841 {

	public static void main(String[] args) {
		Solution asd = new Solution();
		int[][] a = { { 123, 1, 1 }, { 356, 1, 0 }, { 327, 2, 0 }, { 489, 0, 1 } };
		System.out.println(asd.solution(a));

	}

	static class Solution {
		public int solution(int[][] baseball) {
			
			int answer = 0;

			for (int i = 100; i < 1000; i++) {
				String temp1 = i + "";
				int[][] baseballResult = new int[baseball.length][2];
				if (temp1.charAt(0) == temp1.charAt(1) || temp1.charAt(0) == temp1.charAt(2)
						|| temp1.charAt(1) == temp1.charAt(2) || temp1.contains("0")) {
					continue;
				}

				for (int j = 0; j < baseball.length; j++) {
					String temp2 = baseball[j][0] + "";
					for (int k = 0; k < 3; k++) {
						for (int l = 0; l < 3; l++) {
							if (temp1.charAt(k) == temp2.charAt(l)) {
								if (k == l) {
									baseballResult[j][0] = baseballResult[j][0] + 1;
								} else {
									baseballResult[j][1] = baseballResult[j][1] + 1;
								}
							}
						}
					}

				}
				
				for (int j = 0; j < baseball.length; j++) {
					if(baseballResult[j][0] != baseball[j][1] || baseballResult[j][1] != baseball[j][2] ) {
						break;
					}else if(j == baseball.length - 1) {
						answer = answer + 1;
					}
				}

			}

			return answer;
		}
	}

}
