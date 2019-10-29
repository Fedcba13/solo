package baekjoon;

	import java.util.Scanner;
	
	public class Exam1978 {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int T = sc.nextInt();
			int cnt = 0;
			
			for(int i=0; i<T; i++){
				int num = sc.nextInt();
				int flag = 1;
				
				for(int j=2; j<=num/2; j++){
					if(num % j == 0){
						flag=0;
						break;
					}
				}
				if(flag == 1 && num != 1){
					cnt++;
				}
				
			}
			
			System.out.print(cnt);
			
			sc.close();
		}
	
	}
