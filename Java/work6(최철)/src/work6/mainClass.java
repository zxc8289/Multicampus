package work6;

import java.util.Arrays;
import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* 2차원 배열 학생정보 입력 */
		String student[][] = input();
		
		while (true) {
			System.out.println("----(1~5번 선택해주세요.)----");
			System.out.println("1.국,영,수 합 개개인");
			System.out.println("2.국어점수 총점");
			System.out.println("3.영어 점수의 최고점수는 몇점인가?");
			System.out.println("4.수학점수의 최저점수는 몇점인가?");
			System.out.println("5.학급에서 1등은 누구인가? 이름을 출력하라");
			System.out.print(">> ");
			int num = sc.nextInt();

			/* 1.국,영,수 합 개개인 */
			if (num == 1) {
				sumFun(student);
				break;
			}

			/* 2.국어점수 총점 */
			else if (num == 2) {
				sumFun2(student);
				break;
			}
			
			/* 3.영어 점수의 최고점수는 몇점인가? */
			else if (num == 3) {
				sumFun3(student);
				break;
			}
//			
//			/* 4.수학점수의 최저점수는 몇점인가? */
//			else if (num == 4) {
//				score = 101;
//				for (int i = 0; i < student.length; i++) {
//					for (int j = 4; j < 5; j++) {
//						if (Integer.parseInt(student[i][j]) < score) {
//							score = Integer.parseInt(student[i][j]);
//						}
//					}
//				}
//				System.out.println("수학점수의 최저점수는 : " + score);
//				break;
//			}
//			
//			/* 5.학급에서 1등은 누구인가? 이름을 출력하라 */
//			else if (num == 5) {
//				int sum[] = new int[student.length];
//				for (int i = 0; i < student.length; i++) {						
//					for (int j = 2; j < student[i].length; j++) {		// 배열의 [?][2]번째부터 [?][5] 까지 
//						sum[i] = sum[i] + Integer.parseInt(student[i][j]);
//					}
//				}
//				int max = 0;
//				int index = 0;
//				// 1등 점수, 1등학생 이름값 구하기
//				for (int i = 0; i < sum.length; i++) {
//					if(max < sum[i]) {	
//						max = sum[i];			// max에 최고점수값 저장
//						index = i;				// 제일높은 점수의 i값 index에 저장
//					}
//				}		
//				System.out.println("1등 학생의 점수 :" + max);		// 저장된 최고점수값 출력
//				System.out.println("1등 학생의 평균 :" + max/3);	// 
//				System.out.println("이름: " + student[index][0]);  // 저장된 인덱스의값을 student 행열에 삽입 인덱스의 값이
//				break;												 //2라면 student[2][0]값 두번째 학생의 이름값 출력
//				
//			}
		}
	}

	static String[][] input(){
		Scanner sc = new Scanner(System.in);
		String student[][] = null;
		System.out.print("학생 수 : ");
		int count = sc.nextInt();
		student = new String[count][5];
		String contents[] = { "이름", "생년월일", "국어", "영어", "수학" };
		
		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student[i].length; j++) {
				System.out.print((i + 1) + "번째 학생\n" + contents[j] + " : ");

				student[i][j] = sc.next();
			}
		}
		return student;
	}

	static int sumFun(String student[][]) {
		int scoreSum = 0;
			for (int i = 0; i < student.length; i++) {
				scoreSum = 0;
				for (int j = 2; j < student[i].length; j++) {
					scoreSum += Integer.parseInt(student[i][j]);
				}
				System.out.println((i + 1) + "번째 학생 국영수 합은 : " + scoreSum);
			}
			return scoreSum;
	}
	
	static int sumFun2(String student[][]) {
		int scoreSum = 0;
		for (int i = 0; i < student.length; i++) {
			for (int j = 2; j < 3; j++) {
				scoreSum += Integer.parseInt(student[i][j]);
			}
		}
		System.out.println("국어점수의 합은 : " + scoreSum);
		return scoreSum;
	}
	
	static int sumFun3(String student[][]) {
		int score = 0;
		for (int i = 0; i < student.length; i++) {
			for (int j = 3; j < 4; j++) {
				if (Integer.parseInt(student[i][j]) > score) {
					score = Integer.parseInt(student[i][j]);
				}
			}
		}
		System.out.println("영어점수의 최고점수는 : " + score);
		return score;
	}
}
