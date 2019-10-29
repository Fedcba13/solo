package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class Exam1003_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Integer[]> map = new HashMap<>();
		map.put(0, new Integer[] {1,0});
		map.put(1, new Integer[] {0,1});
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
			int n = sc.nextInt();
			
			for(int j=0; j<=n;j++){
				if(map.get(j) == null){
					map.put(j, new Integer[] {
							map.get(j-1)[0]+map.get(j-2)[0],
							map.get(j-1)[1]+map.get(j-2)[1],
					});
				}
			}
			System.out.println(map.get(n)[0] + " " + map.get(n)[1]);
			
		}
		sc.close();	
	}

}
