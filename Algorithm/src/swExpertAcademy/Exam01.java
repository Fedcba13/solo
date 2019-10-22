package swExpertAcademy;
//삼각형

//https://www.swexpertacademy.com/main/code/problem/problemDetail.do?contestProbId=AWef2WW65RwDFAUh

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;

public class Exam01 {

	public static void main(String args[]) throws Exception {

		/*
		 * 아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다. 여러분이 작성한 코드를
		 * 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후, 이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때
		 * 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다. 따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		 * 단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
		System.setIn(new FileInputStream("src/swExpertAcademy/input.txt"));

		/*
		 * 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */
		Scanner sc = new Scanner(System.in);
		int T;
		T = Integer.parseInt(sc.nextLine());
		/*
		 * 여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		 */

		/*
		 * 미 정렬 for (int test_case = 1; test_case <= T; test_case++) { int count = 0;
		 * ArrayList<int[]> xy = new ArrayList<int[]>(); // xy 좌표 ArrayList<Integer>
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

	}

}
