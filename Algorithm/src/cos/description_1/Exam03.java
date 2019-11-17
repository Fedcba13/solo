package cos.description_1;

public class Exam03 {
	
	public static void main(String[] args) {
		System.out.println(new Exam03().solution("A7"));
	}
	
	public int solution(String pos){
		
		int[][] chess = new int[8][8];
		
		int cnt = 0;
		int i = pos.charAt(0)-'A';
		int j = pos.charAt(1) - '1';
		
		int tempI = 1;
		int tempJ = 2;
		
		for(int num=0; num<8; num++){
			if(num == 4){
				tempI = 2;
				tempJ = 1;
			}
			
			if(num % 2 == 0){
				tempI *= -1;
			}else{
				tempJ *= -1;
			}
			
			try{
				chess[i+tempI][j+tempJ] = 1;					
				cnt++;
			}catch(IndexOutOfBoundsException e){
				
			}
		}
		
		return cnt;
	}

}
