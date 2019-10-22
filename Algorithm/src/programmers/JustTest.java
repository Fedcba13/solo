package programmers;

import java.util.ArrayList;

public class JustTest {

	static ArrayList<Integer> tmp = new ArrayList<>();

	public static void main(String[] args) {

		add("", "0009");
		sort();

		for (int i = 0; i < tmp.size(); i++) {
			System.out.println(tmp.get(i));

		}
	}

	public static void add(String temp, String numbers) {
		if (numbers.length() == 0) {
			return;
		}

		for (int i = 0; i < numbers.length(); i++) {
			if (numbers.charAt(i) == '0' && temp.equals("")) {
				add("", numbers.substring(0, i) + numbers.substring(i + 1, numbers.length()));
			} else {
				add(temp + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1, numbers.length()));
				tmp.add(Integer.parseInt(temp + numbers.charAt(i)));
			}
		}

	}

	public static void sort() {
		for (int i = 0; i < tmp.size(); i++) {

			for (int j = 0; j < tmp.size(); j++) {
				if (tmp.get(i) == tmp.get(j) && i != j) {
					tmp.remove(j);
					j--;
				}
			}
		}
	}

}
