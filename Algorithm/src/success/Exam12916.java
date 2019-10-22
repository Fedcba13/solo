package success;

public class Exam12916 {

	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("pYY"));

	}
	
	    static boolean solution(String s) {
	        boolean answer = true;
	        int result = 0;
	        for(int i=0; i<s.length(); i++){
	            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
	            	result = result + 1;
	            }else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
	            	result = result - 1;
	            }
	        }
	        if (result != 0) {
	        	answer = false;
	        }
	        

	        return answer;
	    }
	

}
