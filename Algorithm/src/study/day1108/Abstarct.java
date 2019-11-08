package study.day1108;

public class Abstarct {
	
	public static void main(String[] args) {
		//AbstractTest2 test2 = new Abstarct2();
		AbstractTest3 test3 = new AbstractTest3();
		AbstractTest2 test2 = test3;
		test2.a();
		
		AbstractTest2 a = null;
		Object obj = a;
		
		System.out.println(InterfaceTest.a);
		System.out.println(InterfacetTest3.a);
		
		System.out.println(AbstractTest4.a);
		
	}

}

interface InterfaceTest{
	
	static final int a = 3;
	int b = 3;
	
	void a();
}

interface InterfacetTest2{
	
}

interface InterfacetTest3 extends InterfaceTest, InterfacetTest2{
	
}

abstract class AbstractTest{
	
	abstract void a();
	
	public void b() {
		
	}
	
	Object obj = new Object();
	
}

class AbstractTestTest extends AbstractTest{
	protected void a() {
		
	}
	
	
}

abstract class AbstractTest2 implements InterfaceTest{
	public void a() {
		
	}
}

class AbstractTest3 extends AbstractTest2{

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
	
}

class AbstractTest4 extends AbstractTest3 implements InterfacetTest3{
	
}
