package programmers;

public class Exam12919 {

	public static void main(String[] args) {
		System.out.println(solution(new String[] {"Jane", "Kim"}));
	}
	
	public static String solution(String[] seoul) {
	      String answer = "";
	      for(int i=0;i<seoul.length;i++) {
	    	  if(seoul[i].equals("Kim")) {
	    		  answer = "�輭���� "+i+"�� �ִ�";
	    		  break;
	    	  }
	      }
	      return answer;
	  }

}