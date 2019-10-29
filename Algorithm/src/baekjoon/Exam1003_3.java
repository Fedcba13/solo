package baekjoon;

import java.util.Scanner;

public class Exam1003_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[41];
		
		arr[0] = 0;
		arr[1] = 1;
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
			int n = sc.nextInt();
			
			for(int j=2; j<=n;j++){
				if(arr[j] == 0){
					arr[j] = arr[j-1] + arr[j-2];
				}
			}
			System.out.println((n-1 < 0 ? 1 : arr[n-1]) + " " + arr[n]);
			
		}
		sc.close();	
	}

}
