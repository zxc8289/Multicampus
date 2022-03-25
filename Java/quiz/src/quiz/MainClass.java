package quiz;

public class MainClass {

	public static void main(String[] args) {
		char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		char[] reverseAlphabet = solution(alphabet);
		System.out.println(reverseAlphabet);
	}

	// 함수작성칸
	public static char[] solution(char alphabet[]) {
		char reverseAlphabet[] = new char[26];
		for (int i = 25, j=0; i >= 0 ; i--,j++) {
			reverseAlphabet[j] = alphabet[i];
		}
		return reverseAlphabet;

	}

}
