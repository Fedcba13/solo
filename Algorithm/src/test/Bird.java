package test;

public class Bird extends Animal{
	private int wing = 3;
	
	{
		System.out.println("안녕 나는 새야");
		//wing = eye; // 부모의 eye를 현재 wing에 넣음 => 가능
		//wing = age; // 부모의 나이를 현재 wing에 넣음 => 불가능
		setAge(25); //이러한 경우에는 super 생성자를 이용하거나 setter메소드를 이용 / getter 메소드를 이용
		wing = getAge();
	}
	
	public Bird() {
		//this("강아지 "); => 생성자 상속 안됨
		super("강아지 ");
		System.out.println("새가 생성되었어.");
	}
	
	public int getWing() {
		return wing;
	}
	
	public void setWing(int a) {
		this.wing = a;
	}
	
	public int getReg() {
		return reg*2;
	}
	
	public int getEye() {
		return eye;
	}
	
	public void fly() throws Exception{
		System.out.println("새가 난다.");
	}
	
}

