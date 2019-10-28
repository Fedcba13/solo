package test.inheritance;

import java.util.Stack;

public class ChildBirld extends Birld {
	
	public static void main(String[] args) {
		System.out.println("=================");
		ChildBirld cb = new ChildBirld();
		((Birld) cb ).print();
		cb.print();
		System.out.println("=================");
		
		Birld b = new ChildBirld();
		Birld c = new ChildBirld2();
		
		if(b instanceof ChildBirld){
			((ChildBirld) b).run();
		}
		
		if(c instanceof ChildBirld2){
			((ChildBirld2) c).walk();
 		}
		
		b.print();
		((ChildBirld)b).run();
		((ChildBirld)b).fly();

		System.out.println();
		
		Animal a = new Animal();
		a.print();
		System.out.println();
		
		Animal a2 = new Birld();
		a2.print();
		System.out.println();
		
		Animal a3 = new ChildBirld();
		a3.print();
		
		
	}

	public void print(){
		System.out.println("�� �ڽ��� ����");
	}
	
	public void run(){
		System.out.println("�ڴ�.");
	}
	
	public void fly(){
		super.print();
	}
	
	
}
