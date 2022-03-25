
public class MainClass {

	public static void main(String[] args) {
//		String names[] = {"홍길동","일지매","성춘향","홍구께"};
//		int number = 0;
//		for(int i=0; i<names.length; i++) {
//			if(names[i].equals("성춘향")) {
//				System.out.println("찾았다");
//				System.out.println("번호는 " + (i+1) + "번 입니다.");
//			}
//		}
		
		int score[] = {95,90,85,45,100};
		int max=0;
		for(int i=0; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
		}
		System.out.println("최고 점수 : " + max);
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i*j);
			}
		}
	}
}
