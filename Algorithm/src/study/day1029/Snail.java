package study.day1029;

import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[][] matrix = new int[size][size];

		int cnt = 1;
		int i = 0;
		int j = 0;
		matrix[i][j] = cnt++;

		while (cnt <= size * size) {

			while (true) {// j++
				j++;
				if (j > size - 1 || j < 0 || matrix[i][j] != 0) {
					j--;
					break;
				} else {
					matrix[i][j] = cnt++;
				}
			}

			while (true) {// i++
				i++;
				if (i > size - 1 || i < 0 || matrix[i][j] != 0) {
					i--;
					break;
				} else {
					matrix[i][j] = cnt++;
				}
			}

			while (true) {// j--
				j--;
				if (j > size - 1 || j < 0 || matrix[i][j] != 0) {
					j++;
					break;
				} else {
					matrix[i][j] = cnt++;
				}
			}

			while (true) {
				i--;
				if (i > size - 1 || i < 0 || matrix[i][j] != 0) {
					i++;
					break;
				} else {
					matrix[i][j] = cnt++;
				}
			}

		}

		for (int k = 0; k < size; k++) {
			for (int l = 0; l < size; l++) {
				System.out.printf("%3d", matrix[k][l]);
			}
			System.out.println();
		}

		sc.close();
	}

}
