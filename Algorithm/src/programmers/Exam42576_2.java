package programmers;

import java.util.Arrays;

public class Exam42576_2 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String[] a = { "leo", "kiki", "eden" };
		String[] b = { "eden", "kiki" };
		System.out.println(solution(a, b));
		String[] c = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] d = { "josipa", "filipa", "marina", "nikola" };
		System.out.println(solution(c, d));
		String[] e = { "mislav", "stanko", "mislav", "ana" };
		String[] f = { "stanko", "ana", "mislav" };
		System.out.println(solution(e, f));
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : " + (end - start) / 1000.0);

	}

	public static String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		String answer = "";
		for (int i = 0; i < participant.length; i++) {
			if (i == participant.length - 1) {
				answer = participant[i];
				break;
			}
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}

		}

		return answer;
	}

}
