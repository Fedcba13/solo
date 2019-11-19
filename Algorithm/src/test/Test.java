package test;

public class Test {
	
	public static void main(String[] args) {
		new Test().solution(3, "국어", "영어", "수학");
		new Test().solution(2, "국어", "영어", "수학", "과학");
		new Test().solution(4);
		new Test().solution(3, new String[] {"국어", "영어", "수학"});
	}
	
	public void solution(int num, String... args) {
		if(args.length == 0) {
			System.out.println("매개 변수 2개 입력해");
		}else if(args.length == num) {
			for(int i=0; i<num; i++) {
				System.out.println("입력"+ (i+1) + " = " + args[i]);
			}
		}else {
			System.out.println("입력한 숫자와 매개변수 불일치");
		}
	}

}
