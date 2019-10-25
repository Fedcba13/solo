package test.inheritance;

public class Birld extends Animal{
	private int wing = 3;
	
	public Birld() {
		
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
	
	public void print(){
		System.out.println("동물이 난다");
	}
	
}
