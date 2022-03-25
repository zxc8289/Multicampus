import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int student=0,sum=0,avg=0,max=0, highscore=0;
		System.out.print("학생 수(1~5) : ");
		student = scan.nextInt();
		int sumStudent[] = new int[student];
		
		while(true) {
			if(student <= 5 && student > 0) {
				/* 점수, 합계, 평균 */
				for(int i=0; i < student; i++) {
					System.out.print("학생" + (i + 1)+ "의 점수 : ");
					sumStudent[i] = scan.nextInt();
					sum += sumStudent[i];
					avg = sum/student;
					
					/* 90점이상 */
					if(sumStudent[i] >= 90) {
						highscore++;
					}
				}
				
			}
			else {
				System.out.println("재시도해주세요.");
			}
			break;
			
		}
		/* 최고점수 */
		for(int i=0; i < sumStudent.length; i++){
			if(sumStudent[i] > max) {
				max = sumStudent[i];
			}
		}
			
		System.out.println("총 합은 : " +sum+ "입니다.");
		System.out.println("평균 값은 : " +avg+ "점 입니다.");
		System.out.println("최고 점수는 : " +max+ "점 입니다.");
		System.out.println("90점 이상 학생 수는 : " + highscore + "명 입니다.");

		
	}
}
