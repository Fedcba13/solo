package study.day1108;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

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
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		Stream<Integer> stream = set.stream();
		stream.sorted(Comparator.reverseOrder());
		
	}

}

interface InterfaceTest{
	
	static final int a = 3;
	final static int c = 3;
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

abstract class AbstractTest2 implements InterfaceTest, InterfacetTest2, InterfacetTest3{
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
