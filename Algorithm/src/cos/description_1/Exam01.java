package cos.description_1;

public class Exam01 {
	
	public static void main(String[] args) {
		System.out.println(new Exam01().solution(9949999));
	}
	
	public int solution(int num){
		char[] arr = (num+1+"").toCharArray();
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] == '0'){
				arr[i] = '1';
			}
			System.out.println(arr[i]);
		}
		
		return Integer.parseInt(new String(arr));
	}

}
