package programmers;
import java.util.Scanner;

public class Test11577 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String tmp = "";
        for(int i=0;i<a;i++) {
        	tmp=tmp+"*";
        }

        for(int i=0; i<b;i++) {
        	System.out.println(tmp);
        }
    }

}
