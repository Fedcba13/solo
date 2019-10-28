package swExpertAcademy;
//�ﰢ��

//https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWef2WW65RwDFAUh

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;

public class Exam01 {

	public static void main(String args[]) throws Exception {

		/*
		 * �Ʒ��� �޼ҵ� ȣ���� ������ ǥ�� �Է�(Ű����) ��� input.txt ���Ϸκ��� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�. �������� �ۼ��� �ڵ带
		 * �׽�Ʈ �� ��, ���Ǹ� ���ؼ� input.txt�� �Է��� ������ ��, �� �ڵ带 ���α׷��� ó�� �κп� �߰��ϸ� ���� �Է��� ������ ��
		 * ǥ�� �Է� ��� ���Ϸκ��� �Է��� �޾ƿ� �� �ֽ��ϴ�. ���� �׽�Ʈ�� ������ ������ �Ʒ� �ּ��� ����� �� �޼ҵ带 ����ϼŵ� �����ϴ�.
		 * ��, ä���� ���� �ڵ带 �����Ͻ� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ� ó�� �ϼž� �մϴ�.
		 */
		System.setIn(new FileInputStream("src/swExpertAcademy/input.txt"));

		/*
		 * ǥ���Է� System.in ���κ��� ��ĳ�ʸ� ����� �����͸� �о�ɴϴ�.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T = Integer.parseInt(sc.nextLine());
		/*
		 * ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
		 */

		/*
		 * �� ���� for (int test_case = 1; test_case <= T; test_case++) { int count = 0;
		 * ArrayList<int[]> xy = new ArrayList<int[]>(); // xy ��ǥ ArrayList<Integer>
		 * xysize = new ArrayList<Integer>(); String temp = sc.nextLine(); String[]
		 * temp2 = temp.split("\\s");
		 * 
		 * int N = Integer.parseInt(temp2[0]); int A = Integer.parseInt(temp2[1]); int B
		 * = Integer.parseInt(temp2[2]);
		 * 
		 * 
		 * for (int i = 0; i < N; i++) { String tempxy = sc.nextLine(); String tempxy2[]
		 * = tempxy.split("\\s");
		 * 
		 * xy.add(new int[] { Integer.parseInt(tempxy2[0]), Integer.parseInt(tempxy2[1])
		 * });
		 * 
		 * }
		 * 
		 * for (int j = 0; j < N; j++) { for (int k = j + 1; k < N; k++) { for (int l =
		 * k + 1; l < N; l++) { int a = Math.abs(xy.get(j)[0] * xy.get(k)[1] +
		 * xy.get(k)[0] * xy.get(l)[1] + xy.get(l)[0] * xy.get(j)[1] - xy.get(k)[0] *
		 * xy.get(j)[1] - xy.get(l)[0] * xy.get(k)[1] - xy.get(j)[0] * xy.get(k)[1]); if
		 * (a >= A && a <= B) { count++; } } } }
		 * 
		 * System.out.println("#" + test_case + " " + count); }
		 */

		for (int test_case = 1; test_case <= T; test_case++) {
			int count = 0;
			ArrayList<int[]> xy = new ArrayList<int[]>();
			ArrayList<Integer> xysize = new ArrayList<Integer>();
			String temp = sc.nextLine();
			String[] temp2 = temp.split("\\s");

			int N = Integer.parseInt(temp2[0]);
			long A = Long.parseLong(temp2[1]);
			long B = Long.parseLong(temp2[2]);

			for (int i = 0; i < N; i++) {
				String tempxy = sc.nextLine();
				String tempxy2[] = tempxy.split("\\s");

				int index = 0;
				int hap = Integer.parseInt(tempxy2[0]) + Integer.parseInt(tempxy2[1]);

				for (int j = 0; j < xy.size(); j++) {
					if (hap <= xysize.get(j)) {
						index = j;
						break;
					}
					if (j == xy.size() - 1) {
						index = xy.size();
						break;
					}
				}

				xy.add(index, new int[] { Integer.parseInt(tempxy2[0]), Integer.parseInt(tempxy2[1]) });
				xysize.add(index, hap);

			}

			for (int j = 0; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					for (int l = N-1; l > k; l--) {
						long a = Math.abs(xy.get(j)[0] * xy.get(k)[1] + xy.get(k)[0] * xy.get(l)[1]
								+ xy.get(l)[0] * xy.get(j)[1] - xy.get(k)[0] * xy.get(j)[1]
								- xy.get(l)[0] * xy.get(k)[1] - xy.get(j)[0] * xy.get(k)[1]);
						if (a >= A && a <= B) {
							count++;
						}else if ( a > B) {
							break;
						}
					}
				}
			}

			System.out.println("#" + test_case + " " + count);
		}
		
		sc.close();

	}

}
