package swExpertAcademy;

import java.io.FileInputStream;
import java.util.Scanner;

public class Exam1204 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/swExpertAcademy/input.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			int trash = sc.nextInt();
			int[] temp = new int[101];
			for(int j=0; j<1000;j++) {
				temp[sc.nextInt()]++;
			}
			
			int max = 0;
			int maxindex = 0;
			for(int j=0; j<temp.length; j++) {
				if(max <= temp[j]) {
					max = temp[j];
					maxindex = j;
				}
			}
			
			System.out.println("#"+i+" "+maxindex);
			
		}
	}
}
