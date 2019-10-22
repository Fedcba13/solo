
public class NumberBaseball {

	public static void main(String[] args) {
		solution(new int[][] {{123, 3, 0}});
	}
	
	public static int[] solution(int[][] answer) {
		for(int i=1; i<10; i++) {
			for(int j=1; j<10;j++) {
				if(i==j) {
					break;
				}
				for(int k=1; k<10; k++) {
					if(i == k || j==k) {
						break;
					}
					
				}
			}
		}
		return new int[] {0};
	}

}
