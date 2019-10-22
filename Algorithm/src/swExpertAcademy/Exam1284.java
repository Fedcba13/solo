package swExpertAcademy;

import java.io.FileInputStream;
import java.util.Scanner;

class Exam1284 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= T; i++) {
			String[] tmp = sc.nextLine().split("\\s");
			int P = Integer.parseInt(tmp[0]);
			int Q = Integer.parseInt(tmp[1]);
			int R = Integer.parseInt(tmp[2]);
			int S = Integer.parseInt(tmp[3]);
			int W = Integer.parseInt(tmp[4]);

			P = P * W;
			S = W > R ? (W - R) * S + Q : Q;
		
			int answer = P > S ? S : P;
			
			System.out.println("#"+i+" "+answer);

		}
	}
}
