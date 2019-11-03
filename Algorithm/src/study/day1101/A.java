package study.day1101;

public class A {
	
	final static int sd = 3;
	static int aw = 5;

	public static void main(String[] args) {
		Example e = new Example(){
			public void print(){
				System.out.println(sd);
				System.out.println(aw);
			}
		};
	}
	
}
