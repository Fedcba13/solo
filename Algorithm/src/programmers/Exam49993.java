package programmers;

public class Exam49993 {

	public static void main(String[] args) {
		System.out.println(solution("CBD", new String[] { "ZZCZZ", "ZZBZZ", "BACDE", "CBADF", "AECB", "BDA" }));
		System.out.println(solution("CA", new String[] { "BACDE", "CBADF", "AECB", "BDA" }));
	}

	public static int solution(String skill, String[] skill_trees) {

		int index[] = new int[skill_trees.length];
		for (int i = 0; i < index.length; i++) {
			index[i] = -1;
		}

		for (int i = 0; i < skill_trees.length; i++) {
			for (int j = skill.length() - 1; j >= 0; j--) {
				int tmp = skill_trees[i].indexOf(skill.charAt(j));
				if(tmp == -1) {
					if(index[i] == -1) {
						
					}else {
						index[i] = -2;
						break;
					}
				}else {
					if(index[i] == -1) {
						index[i] = tmp;
					}else if(index[i] < tmp) {
						index[i] = -2;
						break;
					}else {
						index[i] = tmp;
					}
				}
			}
		}

		int answer = 0;
		for(int i=0;i<index.length;i++) {
			if(index[i] != -2) {
				answer++;
			}
		}

		return answer;
	}

}
