package programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Exam42576 {
	
	public static void main(String[] args) {
		Exam42576 test = new Exam42576();
		
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		System.out.println(test.solution(participant, completion));
		
		participant = new String[] {"marina", "josipa", "nikola", "vinko", "filipa"};
		completion = new String[] {"josipa", "filipa", "marina", "nikola"};
		
		System.out.println(test.solution(participant, completion));
		
		participant = new String[] {"mislav", "stanko", "mislav", "ana"};
		completion = new String[] {"stanko", "ana", "mislav"};
		
		System.out.println(test.solution(participant, completion));
		
		participant = new String[] {"mislav"};
		completion = new String[] {};
		
		System.out.println(test.solution(participant, completion));
		
		participant = new String[] {"A", "A", "A"};
		completion = new String[] {"A", "A"};
		
		System.out.println(test.solution(participant, completion));
		
			
	}
	
	public String solution(String[] participant, String[] completion) {
		
		Map<String, Object> map = new HashMap<>();
		
		for(int i=0; i<participant.length; i++){
//			if(map.get(participant[i]) == null){
//				map.put(participant[i], 1);
//			}else{
//				map.put(participant[i], (int)map.get(participant[i]) + 1);
//			}
			map.put(participant[i], (int)map.getOrDefault(participant[i], 0) + 1);
		}
		
		Iterator<Entry<String, Object>> a = map.entrySet().iterator();
		while(a.hasNext()){
			System.out.print(a.next() + "   ");
		}
		
		System.out.println();
		
		Iterator<String> b = map.keySet().iterator();
		while(b.hasNext()){
			System.out.print(b.next() + "   ");
		}
		
		
		System.out.println();
		Iterator<Object> c = map.values().iterator();
		while(c.hasNext()){
			System.out.print(c.next() + "   ");
		}
		
		for(int i=0; i<completion.length; i++){
//			if((int)map.get(completion[i]) == 1){
//				map.remove(completion[i], 1);
//			}else{
//				map.put(completion[i], (int)map.get(completion[i]) - 1);
//			}
			map.put(completion[i], (int)map.getOrDefault(completion[i], 0) - 1);
			if((int) map.get(completion[i]) == 0){
				map.remove(completion[i]);
			}
		}
	
		String result = map.keySet().toString();
		result = result.substring(1, result.length()-1);
		
		return result;
	}

}
