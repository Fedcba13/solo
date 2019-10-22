package programmers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exam17676 {

	public static void main(String[] args) throws Exception {
		String[] temp = new String[] { // 7
				"2016-09-15 20:59:57.421 0.351s", "2016-09-15 20:59:58.233 1.181s", "2016-09-15 20:59:58.299 0.8s",
				"2016-09-15 20:59:58.688 1.041s", "2016-09-15 20:59:59.591 1.412s", "2016-09-15 21:00:00.464 1.466s",
				"2016-09-15 21:00:00.741 1.581s", "2016-09-15 21:00:00.748 2.31s", "2016-09-15 21:00:00.966 0.381s",
				"2016-09-15 21:00:02.066 2.62s" };

		System.out.println(solution(temp));

		temp = new String[] { // 1
				"2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s" };

		System.out.println(solution(temp));

		temp = new String[] { // 2
				"2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s" };

		System.out.println(solution(temp));

	}

	public static int solution(String[] lines) throws Exception {

		int[] ans = new int[86400];

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		for (int i = 0; i < lines.length; i++) {
			String[] tmp = lines[i].substring(24, lines[i].length() - 1).split("\\.");
			Date date = format.parse(lines[i].substring(0, 23));
			calendar2.setTime(date);
			calendar.setTime(date);
			calendar.add(Calendar.SECOND, Integer.parseInt(tmp[0]) * -1);
			if (tmp.length == 2) {
				calendar.add(Calendar.MILLISECOND, Integer.parseInt(tmp[1]) * -1);
			}

			int a = (calendar2.get(Calendar.HOUR) * 3600 + calendar2.get(Calendar.MINUTE) * 60
					+ calendar2.get(Calendar.SECOND));

			int b = (calendar.get(Calendar.HOUR) * 3600 + calendar.get(Calendar.MINUTE) * 60
					+ calendar.get(Calendar.SECOND));

			for (int j = b; j <= a; j++) {
				ans[j]++;
			}

		}

		int answer = 0;

		for (int i = 0; i < ans.length; i++) {
			if (answer < ans[i]) {
				answer = ans[i];
			}
		}
		return answer;
	}

}
