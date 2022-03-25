
public class MainClass {
	public static void main(String[] args) {
//		for(int i=0; i < 10; i++) {
//			System.out.println("for loop " + i);
//			if(i == 5) {
//				break;
//			}
//		}
//		
//		int array[] = {1,4,-7,3,8};
//		for (int i= 0; i < array.length; i++) {
//			System.out.println("array[" + i + "] = " + array[i]);
//			if(array[i] < 0) {
//				break;
//			}
//		}
		boolean b = false;
		for (int i = 0; i <10; i++) {
			System.out.println("i = " + i);
			for(int j = 0; j < 8; j++) {
				System.out.println("\tj = " + j);
				
				if( i == 5 && j == 3) {
					b = true;
				}
				if( b==true) {
					break;
				}
			}
			if(b == true);
			break;
		}
	}
}
