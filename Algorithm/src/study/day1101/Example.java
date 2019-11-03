package study.day1101;

public class Example {
	final int s =3 ;
	int age;
	int b = 7;
	private int p_age;
	static int s_age;
	static final int s_f_age = 3;
	
	static class s_Person {
		int age;
		static int s_age;
		static final int s_f_age = 3;
		
		private static void s_getName() {
			Example.s_age = 3; // Example.s_Person
			s_age = 3;  // s_Person
		}
		
		private void getName() {
			age = 3; // s_Person
		}
		
	}
	
	class Person {
		int age;
		static final int s_f_age = 3;
		//static int sa_age = 2;
		private void getName() {
			p_age = 12; // Example.Person
			Example.s_age = 12; // Example
			this.age = 17; // Example.Person
		}
	}
	
	public void print() {
		System.out.println("안녕");
	}
	
	public void test() {
		class l_Person {
			int age = 5;
		}
		l_Person l_p = new l_Person();
		System.out.println(l_p.age);
	}
	
	public static void test2() {
		
	}
	
	interface Coffee{
		public void drink();
	}
	
	
	public static void main(String[] args) {
		Example.s_Person.s_age = 33;
		Example.s_Person.s_getName();
		
		//Person p = new Person(); // 에러
		//Example.Person p = new Example.Person(); //에러
		
		Example e = new Example();
		Person p = e.new Person();
		
		Example a_e = new Example() {
			int bbb = 7;
			public void print() {
				System.out.println("안녕 나는 익명이야");
				super.print();
			}
		};
		//System.out.println(a_e.bbb); => 사용불가 (상속개념)
		a_e.print();
		
		Coffee c = new Coffee() {
			
			@Override
			public void drink() {
				System.out.println("[인터페이스] 커피 마신다");
				
			}
		}; 
		
	}

}
