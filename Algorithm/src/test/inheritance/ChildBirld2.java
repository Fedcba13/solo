package test.inheritance;

public class ChildBirld2 extends Birld {

	public void print(){
		System.out.println("�� �ڽ��� ����");
	}
	
	public void walk(){
		System.out.println("�ȴ�.");
	}
	
	public void fly(){
		super.print();
	}
	
	
}
