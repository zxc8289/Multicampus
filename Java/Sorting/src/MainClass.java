import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/* 정렬프로그램 */
		Scanner scan = new Scanner(System.in);
		
		// 몇개의 숫자를 정렬할지 입력
		int number[], count=0, temp;
		System.out.print("입력할 숫자의 개수 : ");
		count = scan.nextInt();
		number = new int[count];
		
		// 배열의 숫자 입력
		for(int i=0; i < count; i++) {
			System.out.print((i+1) + ".숫자를 입력하세요 : ");
			number[i] = scan.nextInt();
		}
		
		
		while(true) {
			// 내림차순, 오름차순 선택
			System.out.print("1.내림차순 / 2.오름차순 : ");
			int select = scan.nextInt();
			// 내림차순
			if(select == 1) {
				for(int i = 0; i < number.length; i++) {
					for(int j = i + 1; j < number.length; j++) {
						if(number[i] < number[j]) {
							temp = number[i];
							number[i] = number[j];
							number[j] = temp;
						}
					}
				}
				// 결과출력
				System.out.println("내림차순 : "+Arrays.toString(number));
				break;
			}
		
			// 오름차순
			else if(select == 2) {
				for(int i = 0; i < number.length; i++) {
					for(int j = i + 1; j < number.length; j++) {
						if(number[i] > number[j]) {
							temp = number[i];
							number[i] = number[j];
							number[j] = temp;
						}
					}
				}
				// 결과출력
				System.out.println("오름차순 : "+Arrays.toString(number));
				break;
			}
		}
	}
}
