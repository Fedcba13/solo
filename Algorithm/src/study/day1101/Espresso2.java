package study.day1101;

import java.util.ArrayList;
import java.util.List;

public class Espresso2 {

	private String coffeeBean = "커피 원두";
	private String roastingTime = "로스팅 시간";
	private String roastingTemperature = "로스팅 온도";
	
	private List<String> material = new ArrayList<>();
	
	public Espresso2() {
		material.add(coffeeBean);
		material.add("물");
	}

	public String getCoffeeBean() {
		return coffeeBean;
	}

	public void setCoffeeBean(String coffeeBean) {
		this.coffeeBean = coffeeBean;
	}

	public String getRoastingTime() {
		return roastingTime;
	}

	public void setRoastingTime(String roastingTime) {
		this.roastingTime = roastingTime;
	}

	public String getRoastingTemperature() {
		return roastingTemperature;
	}

	public void setRoastingTemperature(String roastingTemperature) {
		this.roastingTemperature = roastingTemperature;
	}

	public List<String> getMaterial() {
		return material;
	}

	public void setMaterial(List<String> material) {
		this.material = material;
	}	
	
	public static void main(String[] args) {
		Espresso2 es = new Espresso2();
		System.out.println(es.getMaterial());
		
		Americano ame = new Americano();
		System.out.println(ame.getMaterial());
		
		Latte lat = new Latte();
		System.out.println(lat.getMaterial());
	}
	

}
