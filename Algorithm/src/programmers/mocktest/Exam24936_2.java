package programmers.mocktest;

import java.util.ArrayList;

public class Exam24936_2 {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 7, 8, 10 }, new int[] { 10, 7, 8 }));
		System.out.println(solution(new int[] { 4, 3, 2, 1 }, new int[] { 5, 4, 1, 2 }));
		System.out.println(solution(new int[] { 2, 4, 4, 2, 4 }, new int[] { 2, 4, 2, 4, 4 }));
	}

	public static boolean solution(int[] arrA, int[] arrB) {
		boolean answer = false;
		
		if(arrA.length != arrB.length){
            return false;
        }

		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < arrA.length; i++) {
			temp.add(arrA[i]);
		}
		int index = 0;
		
		while (index != arrA.length) {
			int flag = 1;
			for (int i = 0; i < arrB.length; i++) {
				if (temp.get(i) != arrB[i]) {
					flag = 0;
					break;
				}
			}
			if (flag == 0) {
				index++;
				temp.add(0, temp.get(temp.size()-1));
				temp.remove(temp.size()-1);
			}else {
				break;
			}
		}
		
		if(index != arrA.length) {
			answer = true;
		}

		return answer;
	}

}
