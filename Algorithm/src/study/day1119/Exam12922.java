package study.day1119;

import java.util.stream.IntStream;

public class Exam12922 {

	public static void main(String[] args) {
		System.out.println(new Exam12922().solution(3));
		System.out.println(new Exam12922().solution(4));
		System.out.println(new Exam12922().solution(10000));
	}

	public String solution1(int n) {
		StringBuilder answer = new StringBuilder("");
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer.append("수");
			} else {
				answer.append("박");
			}
		}
		return answer + "";
	}

	public String solution(int n) {
		StringBuilder sb = new StringBuilder();
		Integer a =  new Integer(3);
		IntStream.range(1, n+1)
				 .forEach(i -> {
					 if(i%2 == 0){
						 sb.append("박");
					 }
					 else
						 sb.append("수");
				 });
		return ""+sb;
	}

}
