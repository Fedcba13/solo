package study.day1112;

import java.util.Iterator;
import java.util.stream.IntStream;

public class Exam12916_3_lambda {

	public static void main(String[] args) {
		System.out.println(new Exam12916_3_lambda().solution("pPoooyY"));
		System.out.println(new Exam12916_3_lambda().solution("Pyy"));
	}

	boolean solution(String s) {
		long p = s.toLowerCase().chars().filter(i -> i == 'p').count();
		s.toLowerCase().chars().forEach(System.out::print);
		long y = s.toLowerCase().chars().filter(i -> i == 'y').count();

		return p == y ? true : false;
	}

}
