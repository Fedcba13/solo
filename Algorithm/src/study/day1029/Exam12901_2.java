package study.day1029;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Exam12901_2 {
	
	//https://programmers.co.kr/learn/courses/30/lessons/12901
	
	public static void main(String[] args) {
		System.out.println(new Exam12901_2().solution(5, 24));
	}
	
	
	  public String solution(int a, int b) {
		  
		  LocalDate date = LocalDate.of(2016, a, b);
		  System.out.println(date);
		  DateTimeFormatter dateTimeFormatter = 
				  DateTimeFormatter.ofPattern("E", Locale.ENGLISH);

	      return date.format(dateTimeFormatter).toUpperCase();
	  }

}
