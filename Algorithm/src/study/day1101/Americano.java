package study.day1101;

public class Americano extends Espresso2{
	
	public Americano() {
		super();
		// material.add("물");  // 상속으로는 프라이빗 접근 불가
		getMaterial().add("물"); //get, set 이용하여야 한다.
	}

}
