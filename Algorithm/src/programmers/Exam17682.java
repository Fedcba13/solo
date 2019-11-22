package programmers;

public class Exam17682 {

	public static void main(String[] args) {
		System.out.println("37 : " + new Exam17682().solution("1S2D*3T"));
		System.out.println("9 : " + new Exam17682().solution("1D2S#10S"));
		System.out.println("3 : " + new Exam17682().solution("1D2S0T"));
		System.out.println("5 : " + new Exam17682().solution("1D#2S*3S"));
		System.out.println("-4 : " + new Exam17682().solution("1T2D3D#"));
		System.out.println("59 : " + new Exam17682().solution("1D2S3T*"));
	}

	public int solution(String dartResult) {
		int answer = 0;

		int[] arr = new int[3];
		int index = 0;

		for (int i = 0; i < dartResult.length(); i++) {
			if (dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
				if (dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
					arr[index++] = 10;
					i++;
				} else {
					arr[index++] = dartResult.charAt(i) - '0';
				}
			}
		}

		index = -1;
		
		for (int i = 0; i < dartResult.length(); i++) {
			if (dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
				index++;
				if (dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
					i++;
				}
			}else{
				if(dartResult.charAt(i) == 'D')
					arr[index] = (int)Math.pow(arr[index], 2);
				else if(dartResult.charAt(i) == 'T')
					arr[index] = (int)Math.pow(arr[index], 3);
				else if(dartResult.charAt(i) == '*')
					if(index == 0)
						arr[index] = 2*arr[index];
					else{
						arr[index] = 2*arr[index];
						arr[index-1] = 2*arr[index-1];
					}
				else if(dartResult.charAt(i) == '#')
					arr[index] = -1*arr[index];
			}
		}
		
		for(int i=0; i<arr.length; i++){
			answer += arr[i];
		}

		return answer;
	}

}
