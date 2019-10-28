package study.day1029;

import java.util.Arrays;

public class Exam42748_2 {
	
	//https://programmers.co.kr/learn/courses/30/lessons/42748
	
	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int[] result = new Exam42748_2().solution(array, commands);
		for(int i=0; i<result.length; i++) {
			if(i != 0) System.out.print(", ");
			System.out.print(result[i]);
		}
		
	}
	
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++) {
        	int arrLength = commands[i][1] - commands[i][0] + 1;  // 배열의 크기 
        	int tempArr[] = new int[arrLength]; // 배열 생성
        	
        	//값 대입 (배열 자르기)
//        	int index = 0;
//        	for(int j=commands[i][0]; j<=commands[i][1]; j++ ) {
//        		tempArr[index] = array[j-1];
//        		index++;
//        	}
        	tempArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
        	
//        	for(int j=0; j<tempArr.length-1; j++) {
//        		int cnt = 0;
//        		for(int k=0; k<tempArr.length - j - 1; k++) {
//        			if(tempArr[k] > tempArr[k+1]) { //이전 값이 다음 값보다 클 때 위치변경
//        				int temp = tempArr[k];
//        				tempArr[k] = tempArr[k+1];
//        				tempArr[k+1] = temp;
//        				cnt++;
//        			}
//        		}
//        		if(cnt == 0) { //회전이 한번도 일어나지 않으면 정렬 끝
//        			break;
//        		}
//        	}
        	
        	Arrays.sort(tempArr);
        	
        	answer[i] = tempArr[commands[i][2]-1];
        	
        }
		return answer;
    }

}
