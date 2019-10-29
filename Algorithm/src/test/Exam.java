package test;

import java.util.Scanner;

//�Է� / ���
/*
2 333
���̳� �赵��
�輼�� �����

�輼�� ���̳�
����� �赵��

3 -777
���̳� �赵�� �輼��
����� ��û�� ������
�ӳ��� ���ҹ� ��ä��

�赵�� �輼�� ������
���̳� ��û�� ��ä��
����� �ӳ��� ���ҹ�

4 7
���̳� �赵�� �輼�� �����
��û�� ������ �ӳ��� ���ҹ�
��ä�� �ְ�� ������ ���ö�
������ �質�� ����� �ڼҿ�

���ö� �ڼҿ� ����� �質��
���ҹ� �ְ�� ������ ������
����� ������ �ӳ��� ��ä��
�輼�� �赵�� ���̳� ��û��

 */

public class Exam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt(); // ũ��
		int rotate = sc.nextInt(); // ȸ����
		
		int flag = 1; // ȸ������
		int start = 0; 
		int end = size-1;
		
		sc.nextLine(); // ���๮�� ������
		
		String[][] matrix = new String[size][size]; // ���
		
		for (int i=0; i<size; i++) {
			String[] temp = sc.nextLine().split("\\s");
			matrix[i] = temp;
		}
		
		System.out.println();
		
		while(start < end) {
			int curSize = end - start + 1;  //���� �迭ũ��
			int cnt = curSize * curSize - (curSize - 2) * (curSize - 2); // �迭�� �� ��
			
			String[] curMatrix = new String[cnt];
			
			int i = start;
			int j = start;
//			int delta = 0;
//			//�׵θ� ���ϱ�... ��ġ��...
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
			
			int curRotate = flag * rotate % cnt ; // ȸ����
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
		
		sc.close();
		
	}

}
