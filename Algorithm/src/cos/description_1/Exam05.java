package cos.description_1;

public class Exam05 {
	
	public static void main(String[] args){
		int[] result = new Exam05().solution(5, new int[] {1,5,4,3,2,5,2,5,5,4});
		for(int i=0; i<result.length; i++){
			System.out.print(result[i] + "   ");
		}
		
		System.out.println("\n\n\n");
		
		result = new Exam05().solution(4, new int[] {1,3,2,3,2});
		for(int i=0; i<result.length; i++){
			System.out.print(result[i] + "   ");
		}
	}
	
	public int[] solution(int N, int[] votes){
		
		int[] arr = new int[N];
		
		int max = 0;
		
		for(int i=0; i<votes.length; i++){
			int temp = ++arr[votes[i]-1];
			if(temp > max){
				max = temp;
			}
		}
		
		int cnt = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == max){
				cnt++;
			}
		}
		
		int[] result = new int[cnt];
		int index = 0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] == max){
				result[index++] = (i+1);
			}
		}
		
		return result;
	}

}
