package swExpertAcademy;

import java.util.Scanner;

public class Exam2072 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=T; i++) {
			
			int answer = 0;
			
			String[] tmp = sc.nextLine().split("\\s");
			for(int j=0; j<tmp.length;j++) {
				int num = Integer.parseInt(tmp[j]);
				if(num % 2 != 0) {
					answer = answer + num;
				}
			}
			System.out.println("#"+i + " " + answer);
		}
	}
}
