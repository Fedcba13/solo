package programmers;

public class ExamTest {
	public static void main(String[] args) {
		int[] temp = solution(new int[] { 4, 3, 2, 1 });
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();

		temp = solution(new int[] { 1, 2, 3, 4 });
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();

		temp = solution(new int[] { 1 });
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		System.out.println();
	}

	public static int[] solution(int[] arr) {
		int num = arr[0], idx = 0;
	      if(arr.length>1){
	          for(int i=0; i<arr.length; i++){
	              if(num > arr[i]){
	                  idx = i;
	                  num = arr[i];
	              }
	          }         
	          arr[idx] = arr[arr.length-1];
	          int[] answer = new int[arr.length-1];
	          return answer;
	      }else{
	          return new int[]{-1};
	      }         
	}
}
