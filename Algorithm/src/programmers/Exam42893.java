package programmers;

public class Exam42893 {
	
	public static void main(String[] args) {
	String[] page = {"<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://careers.kakao.com/interview/list\"/>\n</head>  \n<body>\n<a href=\"https://programmers.co.kr/learn/courses/4673\"></a>#!MuziMuzi!)jayg07con&&\n\n</body>\n</html>", "<html lang=\"ko\" xml:lang=\"ko\" xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n  <meta charset=\"utf-8\">\n  <meta property=\"og:url\" content=\"https://www.kakaocorp.com\"/>\n</head>  \n<body>\ncon%\tmuzI92apeach&2<a href=\"https://hashcode.co.kr/tos\"></a>\n\n\t^\n</body>\n</html>"};
	String word = "Muzi";
	int a = solution(word, page);
	}
	
	public static int solution(String word, String[] pages) {
		System.out.println(pages.length);
		String[] page = new String[pages.length];
		for(int i=0; i<pages.length; i++) {
			int startlocation = pages[i].indexOf("<meta");
			int endlocation = pages[i].indexOf("/>", startlocation);
			
			System.out.println(pages[i].substring(startlocation, endlocation));
		}
        int answer = 0;
        return answer;
    }
}
