package test.inheritance;

public class Animal {

	int eye;
	int reg;

	public Animal() {

	}

	public int getEye() {
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
	
	public void print(){
		System.out.println("동물이 걷는다");
	}
	
}
