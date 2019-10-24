package test;

public class Main {

	public static void main(String[] args) {
		Bird birld = new Bird();
		System.out.println(birld.getWing());
		birld.setWing(5);
		System.out.println(birld.getWing());
		
		try {
			Bird bird = new Chicken();
			bird.fly();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void asd() {}
	
	public void asd(int b, String a) {}
	
	public void asd(String a, int b) {}
	
	//리턴타입이 달라도 시그니처가 같기 때문에 중복된 메소드
//	public char asd() {
//		return 'a';
//	}

}
