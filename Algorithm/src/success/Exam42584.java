package success;

public class Exam42584 {

	//https://programmers.co.kr/learn/courses/30/lessons/42584
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = solution(new int[] {498,501,470,489});
		for(int i=0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++) {
        	int temp = prices[i];
        	for(int j=i; j<prices.length; j++) {
        		if(temp > prices[j] || j==prices.length-1) {
        			answer[i] = (j-i);
        			break;
        		}
        	}
        }
        return answer;
    }

}
