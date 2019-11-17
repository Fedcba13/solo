package cos.description_1;

public class Exam02 {

	public static void main(String[] args) {
		System.out.println(new Exam02().solution(3));
		System.out.println(new Exam02().solution(2));
	}

	public int solution(int size) {

		int[][] matrix = new int[size][size];

		boolean direct = true;
		int delta = 1;

		int i = 0;
		int j = 0;

		for (int num = 1; num <= size * size; num++) {
			matrix[i][j] = num;
			if (direct) {
				j += delta;
				if (j == size || j < 0 || matrix[i][j] != 0) {
					j -= delta;
					direct = !direct;
					i += delta;
				}
			} else {
				i += delta;
				if (i == size || i < 0 || matrix[i][j] != 0) {
					i -= delta;
					direct = !direct;
					delta *= -1;
					j += delta;
				}
			}
		}
		for (i = 0; i < size; i++) {
			for (j = 0; j < size; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	int result = 0;

	for(i=0;i<size;i++)
	{
		result += matrix[i][i];
	}

	return result;

}

}
