package study.day1115;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.StringJoiner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		
		String filePath = "src/study/day1115/File.txt";
		
		//1.8 이전 파일읽기
		try{
            //파일 객체 생성
            File file = new File(filePath);
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);
            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
                System.out.println(line);
            }        
            bufReader.close();
        }catch (FileNotFoundException e) {
           
        }catch(IOException e){
           
        }
		
		System.out.println("\n\n\n");
		
		//1.8 파일읽기
		try (Stream<String> stream = Files.lines(Paths.get(filePath), Charset.forName("UTF-8"))) {
			
			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\n\n");
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("3");
		list.add("B");
		list.add("C");
		list.add("1");
		list.add("D");
		Pattern p = Pattern.compile("(^[0-9]*$)");
		
		//1.8 이전 List 읽기(숫자만)
		for(int i=0; i<list.size(); i++) {
			if(p.matcher(list.get(i)).find()) {				
				System.out.println(list.get(i));
			}
		}
		
		System.out.println("\n\n\n");
		
		//1.8 이후 List 읽기(숫자만)
		list.stream()
			.filter(i -> p.matcher(i).find())
			.forEach(System.out::println);
		
		list.stream().filter(i -> p.matcher(i).find()).forEach( i -> System.out.println(i.substring(0,1)));
		
		System.out.println("\n\n\n");
		
		System.out.println(String.join(",", list));
		
		//Joiner
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		
		for(int i=0; i<list.size(); i++) {
			sj.add(list.get(i));
		}
		
		System.out.println(sj.toString());
		
		
		//기존 코드
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<list.size(); i++) {
			if(sb == null || sb.toString().equals("")) {
				sb.append("[");
			}else {
				sb.append(", ");
			}
			sb.append(list.get(i));
			if(i == list.size()-1) {
				sb.append("]");
			}
		}
		
		System.out.println(sb);
		

	}

}
