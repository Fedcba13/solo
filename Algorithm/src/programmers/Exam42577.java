package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam42577 {

	public static void main(String[] args) {

		System.out.println(solution(new String[] { "119", "97674223", "1195524421" }));
		System.out.println(solution(new String[] { "123", "456", "789" }));
		System.out.println(solution(new String[] { "12", "123", "1235", "567", "88" }));
	}

	public static boolean solution(String[] phone_book) {
		int min = 21;
		ArrayList<String> arrList = new ArrayList<>();
		HashMap<String, String> hash = new HashMap<>();
		for(int i=0; i<phone_book.length; i++) { // �ּ� ���� ���ϱ�.
			if(phone_book[i].length() < min) {
				min = phone_book[i].length();
			}
		}
		
		for(int i=0; i<phone_book.length; i++) {
			if(phone_book[i].length() == min) {
				arrList.add(phone_book[i]);
			}else {
				hash.put(phone_book[i].substring(0, min), i+"");
			}
		}
		
		for(int i=0; i<arrList.size();i++) {
			if(hash.get(arrList.get(i)) != null) {
				return false;
			}
		}
		
		return true;
	}

}
