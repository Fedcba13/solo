package programmers;

public class Exam62048 {
	
	public static void main(String[] args) {
		System.out.println(3);
		System.out.println(Integer.toBinaryString(3));
		System.out.println(Integer.parseInt(Integer.toBinaryString(3)));
		System.out.println(String.format("%0"+5+"d", Integer.parseInt(Integer.toBinaryString(22))));
		System.out.println(new Exam62048().solution(8, 12));
		System.out.println(new Exam62048().solution(4, 4));
	}
	
	public long solution(int w,int h) {
		long answer = w*h;
		long division = 1;
		for(int i=2; i<Math.min(w, h); i++){
			if(w%i == 0 && h%i == 0){
				w = w/i;
				h = h/i;
				division *= i;
				i--;
			}
		}
		
		int x = (int) Math.ceil(Math.max(w, h) * 1.0 / Math.min(w, h));
		
		System.out.println(w + ", " + h + ", " + x );
		
		answer -= (x*Math.min(w, h)*division);
		
		return answer;
	}

}
