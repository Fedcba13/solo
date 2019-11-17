package cos.description_1;

public class Exam04 {
	
	public static void main(String[] args) {
		
		int[] result = new Exam04().solution(
				new int[] {-2, 3, 5, 9}, 
				new int[] {0, 1, 5});
		
		for(int i=0; i<result.length; i++){
			System.out.print(result[i] + "  ");
		}
		
	}
	
	public int[] solution(int[] arrA, int[] arrB) {
		
		int arrA_idx = 0, arrB_idx = 0;
        int arrA_len = arrA.length;
        int arrB_len = arrB.length;
        int answer[] = new int[arrA_len + arrB_len];
        int answer_idx = 0;
        while(arrA_idx != arrA_len && arrB_idx != arrB_len){
            if(arrA[arrA_idx] < arrB[arrB_idx])
                answer[answer_idx++] = arrA[arrA_idx++];
            else
                answer[answer_idx++] = arrB[arrB_idx++];
        }
        while(arrA_idx != arrA_len)
            answer[answer_idx++] = arrA[arrA_idx++];
        while(arrB_idx != arrB_len)
            answer[answer_idx++] = arrB[arrB_idx++];
        return answer;
		
//		int[] result = new int[arr1.length + arr2.length];
//		
//		int resultIdx = 0;
//		int index1 = 0;
//		int index2 = 0;
//		
//		while(index1 != arr1.length || index2 != arr2.length){
//			if(index1 == arr1.length){
//				result[resultIdx++] = arr2[index2++];
//			}else if(index2 == arr2.length){
//				result[resultIdx++] = arr1[index1++];
//			}else{
//				if(arr1[index1] < arr2[index2]){
//					result[resultIdx++] = arr1[index1++];
//				}else{
//					result[resultIdx++] = arr2[index2++];
//				}
//			}
//		}
//		
//		return result;
	}

}
