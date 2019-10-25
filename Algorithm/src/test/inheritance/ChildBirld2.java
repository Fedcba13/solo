package test.inheritance;

public class ChildBirld2 extends Birld {

	public void print(){
		System.out.println("새 자식이 난다");
	}
	
	public void walk(){
		System.out.println("걷다.");
	}
	
	public void fly(){
		super.print();
	}
	
	
}
