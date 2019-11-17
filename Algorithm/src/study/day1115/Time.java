package study.day1115;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Time {
	
	public static void main(String[] args) throws InterruptedException {
		//날짜
		LocalDate curDate = LocalDate.now();
		System.out.println("현재 날짜 : " + curDate);
		
		//of(year, month, dayOfMonth)
		LocalDate targetDate = LocalDate.of(2015, 10, 13);
		System.out.println("설정한 날짜 : " + targetDate);
		
		//시간
		LocalTime curTime = LocalTime.now();
		System.out.println("현재 시간 : " + curTime);
		
		//of(hour, minute)
		//of(hour, minute, second)
		//of(hour, minute, second, nanoOfSecond) => nanoOfSecond * 10^6 = millisecond
		LocalTime targetTime = LocalTime.of(15, 24, 33, (int)(450 * Math.pow(10, 6))); 
		System.out.println("설정한 시간 : " + targetTime);
		
		//날짜와 시간
		LocalDateTime curDateTime = LocalDateTime.now();
		System.out.println("현재 날짜 시간 : " + curDateTime);
		
		//of(LocalDate, LocalTime)
		//of(year, month, dayOfMonth, hour, minute) ... 등
		LocalDateTime targetDateTime = LocalDateTime.of(targetDate, targetTime);
		System.out.println("설정한 날짜 시간 : " + targetDateTime);
		
		//협정 세계시와 시간존(TimeZone) 
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC")); // 해당 타임존의 시간이 나온다.
		System.out.println("협정 셰계시 : " + utcDateTime);
		
		ZonedDateTime utc9DateTime = ZonedDateTime.now(ZoneId.of("UTC+9")); // 해당 타임존의 시간이 나온다.
		System.out.println("협정 셰계시 : " + utc9DateTime);

		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("협정 셰계시 : " + newyorkDateTime);
		
		ZonedDateTime koreaDateTime = ZonedDateTime.now(); // 현재 지역의 시간이 나온다.
		System.out.println("한국 시간존 : " + koreaDateTime);
		
		System.out.println("시차 : " + koreaDateTime.getOffset());
		
		//특정 시간의 타임 스탬프 얻기 => instant는 협정 세계시(UTF)를 기준으로 한다.
		Instant instant1 = Instant.now();
		Thread.sleep(100);
		Instant instant2 = Instant.now();
		
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1이 빠릅니다.");
		}else if(instant1.isAfter(instant2)) {
			System.out.println("instant1이 늦습니다.");
		}else {
			System.out.println("동일한 시간입니다.");
		}
		
		System.out.println("차이(nano) : " + instant1.until(instant2, ChronoUnit.NANOS)); //ChronoUnit는 enum class(상수 열거형 클래스)
		System.out.println("차이(nano) : " + instant2.until(instant1, ChronoUnit.MILLIS)); //ChronoUnit는 enum class(상수 열거형 클래스)
		
		System.out.println("시간 변경 전 날짜 시간 : " + targetDateTime);
		LocalDateTime modifyTargetDateTime = targetDateTime.plusYears(3)
															.plusMonths(2)
															.plusDays(3)
															.minusHours(25);
		System.out.println("시간 변경 후 날짜 시간 : " + targetDateTime);
		System.out.println("시간 변경 한 날짜 시간 : " + modifyTargetDateTime  );
		
		//상대변경
		modifyTargetDateTime = curDateTime.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번 해의 첫 일 : " + modifyTargetDateTime);
		
		modifyTargetDateTime = curDateTime.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("돌아오는 토요일 : " + modifyTargetDateTime);
		
		System.out.println(curDateTime.withDayOfYear(352));
		
		System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
		
		
		
	}

}
