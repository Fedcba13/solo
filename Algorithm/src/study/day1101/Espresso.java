package study.day1101;

import java.util.ArrayList;
import java.util.List;

public class Espresso {

	private String coffeeBean = "커피 원두";
	
	private List<String> material = new ArrayList<>();
	
	public Espresso() {
		material.add(coffeeBean);
		material.add("물");
	}
	
	class Americano{
		public Americano() {
			material.add("물");
		}
		public List<String> getMaterial() {
			return material;
		}
	}
	
	class Latte{
		public Latte() {
			material.add("우유");
		}
		public List<String> getMaterial() {
			return material;
		}
	}
	
	public List<String> getMaterial() {
		return material;
	}
	
	public static void main(String[] args) {
		Espresso es = new Espresso();
		System.out.println(es.getMaterial());
		
		Americano ame = es.new Americano();
		System.out.println(ame.getMaterial());
		
		Latte lat = es.new Latte();
		System.out.println(lat.getMaterial());
		
		es.new Americano();
		System.out.println(es.getMaterial());
	}

}
