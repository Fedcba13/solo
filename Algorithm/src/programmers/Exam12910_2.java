package programmers;

import java.util.TreeSet;

public class Exam12910_2 {

	public static void main(String[] args) {
		int[] temp = solution(new int[] { 5, 9, 7, 10 }, 5);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
		temp = solution(new int[] { 2, 36, 1, 3 }, 1);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
		temp = solution(new int[] { 3, 2, 6 }, 5);
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
	}

	public static int[] solution(int[] arr, int divisor) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) {
				treeSet.add(arr[i]);
			}
		}
		
		if(treeSet.size() == 0) {
			treeSet.add(-1);
		}
		
		int[] result = new int[treeSet.size()];
		int cnt = 0;
		for(int temp : treeSet) {
			result[cnt++] = temp;
		}
		
		return result;
	}

}
