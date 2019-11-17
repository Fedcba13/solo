package test;

import java.time.LocalTime;

public class Compare {

	public static void main(String[] args) {
		
		String[] a = new String("abc").split("a");
		
		System.out.println(a.length);
		System.out.println(String.join(", ", a));
		
		int hour = 22;
		int minute = 37;
		
		LocalTime lt = LocalTime.of(hour, minute);
		System.out.println(lt);
		
	}

}
