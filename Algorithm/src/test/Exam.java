package test;

import java.util.Scanner;

//입력 / 출력
/*
2 333
강미나 김도연
김세정 김소혜

김세정 강미나
김소혜 김도연

3 -777
강미나 김도연 김세정
김소혜 김청하 유연정
임나영 전소미 정채연

김도연 김세정 유연정
강미나 김청하 정채연
김소혜 임나영 전소미

4 7
강미나 김도연 김세정 김소혜
김청하 유연정 임나영 전소미
정채연 주결경 최유정 강시라
기희현 김나영 김소희 박소연

강시라 박소연 김소희 김나영
전소미 주결경 유연정 기희현
김소혜 최유정 임나영 정채연
김세정 김도연 강미나 김청하

 */

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt(); // 크기
		int rotate = sc.nextInt(); // 회전수
		
		int flag = 1; // 회전방향
		int start = 0; 
		int end = size-1;
		
		sc.nextLine(); // 개행문자 날리기
		
		String[][] matrix = new String[size][size]; // 행렬
		
		for (int i=0; i<size; i++) {
			String[] temp = sc.nextLine().split("\\s");
			matrix[i] = temp;
		}
		
		System.out.println();
		
		while(start < end) {
			int curSize = end - start + 1;  //현재 배열크기
			int cnt = curSize * curSize - (curSize - 2) * (curSize - 2); // 배열의 값 수
			
			String[] curMatrix = new String[cnt];
			
			int i = start;
			int j = start;
//			int delta = 0;
//			//테두리 구하기... 고치기...
//			for(; j<end; j++) {
//				curMatrix[delta++] = matrix[i][j];
//			}
//			
//			for(; i<end; i++) {
//				curMatrix[delta++] = matrix[i][j];
//			}
//			
//			for(; j>start; j--) {
//				curMatrix[delta++] = matrix[i][j];
//			}
//			
//			for(; i>start; i--) {
//				curMatrix[delta++] = matrix[i][j];
//			}
			
			int delta = 1;
			int way = 1;

			for(int z = 0; z<cnt; z++) {
				curMatrix[z] = matrix[i][j];
				if(way == 1) {
					j += delta;
					if(j == end) {
						way *= -1;
					}else if(j == start) {
						
						way *= -1;
					}
				}else {
					i += delta;
					if(i == end) {
						delta *= -1;
						way *= -1;
					}else if(i == start) {
						
						way *= -1;
					}
				}
			}
			
			int curRotate = flag * rotate % cnt ; // 회전수
			if(curRotate < 0) {
				curRotate = cnt + curRotate;
			}
			
			delta = 1;
			way = 1;
			for(int z = 0; z<curRotate; z++) {
				if(way == 1) {
					j += delta;
					if(j == end) {
						way *= -1;
					}else if(j == start) {
						
						way *= -1;
					}
				}else {
					i += delta;
					if(i == end) {
						delta *= -1;
						way *= -1;
					}else if(i == start) {
						
						way *= -1;
					}
				}
			}
			
			for(int z = 0; z<cnt; z++) {
				matrix[i][j] = curMatrix[z];
				if(way == 1) {
					j += delta;
					if(j == end) {
						way *= -1;
					}else if(j == start) {
						
						way *= -1;
					}
				}else {
					i += delta;
					if(i == end) {
						delta *= -1;
						way *= -1;
					}else if(i == start) {
						delta *= -1;
						way *= -1;
					}
				}
			}
			end--;
			start++;
			flag *= -1;
		}
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(j!=0) {
					System.out.print(" ");
				}
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
	}

}
