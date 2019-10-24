package test;

public class Chicken extends Bird{
	
	@Override
	public void fly() throws Exception {
		throw new Exception("닭은 날 수 없어...");
	}

}
