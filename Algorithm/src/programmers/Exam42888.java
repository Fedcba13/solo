package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam42888 {

	public static void main(String[] args) {
		String[] a = solution(new String[] { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
				"Enter uid1234 Prodo", "Change uid4567 Ryan" });
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}

	public static String[] solution(String[] record) {
		String[] answer = {};
		ArrayList<String> temp = new ArrayList<String>();
		HashMap<String, String> map = new HashMap<>();
		
		for(int i = record.length-1; i>=0; i--) {
			String[] words = record[i].split("\\s");
			String temp0 = words[0];
			
			if(temp0.equals("Enter") || temp0.equals("Change")) {
				String temp1 = words[1];
				String temp2 = words[2];
				if(!map.containsKey(temp1)) {
					map.put(temp1, temp2);
				}
			}
		}

		for (int i = record.length - 1; i >= 0; i--) {
			String[] words = record[i].split("\\s");
			String temp0 = words[0];
			String temp1 = words[1];
			
			if(temp0.equals("Enter")) {
				temp.add(0, map.get(temp1)+"님이 들어왔습니다.");
			}else if(temp0.equals("Leave")) {
				temp.add(0, map.get(temp1)+"님이 나갔습니다.");
			}
		}
		
		answer = temp.toArray(new String[temp.size()]);

		return answer;
	}

}
