package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class Exam1003 {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(0, 0);
		map.put(1, 1);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++){
			int n = sc.nextInt();
			
			for(int j=0; j<=n;j++){
				if(map.get(j) == null){
					map.put(j,map.get(j-1)+map.get(j-2));
				}
			}
			
			System.out.println(map.getOrDefault(n-1, 1) + " " + map.getOrDefault(n, 1));
			
		}
		sc.close();	
	}

}
