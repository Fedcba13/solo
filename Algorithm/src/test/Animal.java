package test;

public class Animal {

	{
		System.out.println("안녕 나는 동물이야");
	}
	
	int eye;
	int reg;
	private int age = 25;

	public Animal() {
		this("강아지 ");
		System.out.println("동물이 생성되었어");
	}
	
	public Animal(String s) {
		System.out.println(s + "동물이 생성되었어");
	}
	
	public Animal(int age) {
		this.age = age;
	}

	protected int getEye() {
		return eye;
	}

	public int getReg() {
		return reg;
	}

	public void setEye(int eye) {
		this.eye = eye;
	}

	public void setReg(int reg) {
		this.reg = reg;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
