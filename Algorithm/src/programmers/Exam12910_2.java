package programmers;

import java.util.ArrayList;
import java.util.Arrays;

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
		ArrayList<Integer> arrayList = new ArrayList<>(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % divisor == 0) {
				arrayList.add(arr[i]);
			}
		}
		
		if(arrayList.size() == 0) {
			arrayList.add(-1);
		}
		
		int[] result = new int[arrayList.size()];
		
		for(int i=0; i<result.length; i++) {
			result[i] = arrayList.get(i);
		}
		
		return result;
	}

}
