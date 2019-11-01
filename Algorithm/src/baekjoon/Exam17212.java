package baekjoon;

import java.util.Scanner;

public class Exam17212 {
	
	static int coinCnt = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //지불해야할 금액
		
		coinCnt = N; //전부 1원으로 계산했을때 코인의 개수(초기 값)
		
		//7원 지불
		for(int i = N/7 ; i>=0 ; i--) {
			if(i > coinCnt) {
				break;
			}
			pay5(N-7*i, i);
		}
		
		System.out.println(coinCnt);
		
	}
	
	public static void pay5(int N, int curCnt) {
		for(int i = N/5 ; i>=0 ; i--) {
			if(curCnt + i > coinCnt) {
				break;
			}
			pay2(N-5*i, curCnt + i);
		}
	}
	
	public static void pay2(int N, int curCnt) {
		curCnt = curCnt + N/2 + N%2;
		if(coinCnt > curCnt) {
			coinCnt = curCnt;
		}
	}

}
