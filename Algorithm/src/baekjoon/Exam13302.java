package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class Exam13302{
	
	static int answer;
	static HashMap<Integer, Integer> hash;
	
	public static void main(String args[]){
		long start = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		sc.nextLine();
		String[] ab = sc.nextLine().split("\\s");
		int[] day = new int[ab.length];
		
		for(int i=0; i<ab.length;i++) {
			day[i] = Integer.parseInt(ab[i]);
		}
		
		answer = 0;
		hash = new HashMap<>();

		for (int i = 0; i < day.length; i++) {
			hash.put(day[i], day[i]);
		}

		answer = (N / 5 * 37000) + ((N % 5) / 3 * 25000) + (((N % 5) % 3) * 10000);

		sol(N, 1, 0, 0, 0, 0);

		System.out.println(answer);
		
		long end = System.currentTimeMillis();
		System.out.println("실행 시간 : "+ (end-start) / 1000.0 + "초");
	}
	
	public static void sol(int N, int index, int day5, int day3, int day1, int coupon) {
		int temp = (day5 * 37000) + (day3 * 25000) + (day1 * 10000);
		if(temp > answer) {
			return;
		}

		if (N+1 == index) {
			if (answer == 0) {
				answer = temp;
			} else {
				if (answer > temp) {
					answer = temp;
				}
			}
			return;
		}

		if (hash.containsKey(index)) {
			sol(N, index + 1, day5, day3, day1, coupon);
		} else {
			if ((N - index + 1) >= 5) {
				sol(N, index + 5, day5 + 1, day3, day1, coupon + 2);
				sol(N, index + 3, day5, day3 + 1, day1, coupon + 1);
				if (coupon >= 3) {
					sol(N, index + 1, day5, day3, day1, coupon - 3);
				} else {
					sol(N, index + 1, day5, day3, day1 + 1, coupon);
				}

			} else if ((N - index + 1) >= 3) {
				sol(N, index + 3, day5, day3 + 1, day1, coupon + 1);
				if (coupon >= 3) {
					sol(N, index + 1, day5, day3, day1, coupon - 3);
				} else {
					sol(N, index + 1, day5, day3, day1 + 1, coupon);
				}
			} else {
				if (coupon >= 3) {
					sol(N, index + 1, day5, day3, day1, coupon - 3);
				} else {
					sol(N, index + 1, day5, day3, day1 + 1, coupon);
				}
			}
		}
	}
	
}