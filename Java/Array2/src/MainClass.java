import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		int Array2[][] = new int[3][4];
		Array2[0][0] = 1;
		Array2[0][1] = 2;
		Array2[0][2] = 3;
		Array2[0][3] = 4;
		
		Array2[1][0] = 5;
		Array2[1][1] = 6;
		Array2[1][2] = 7;
		Array2[1][3] = 8;
		
		Array2[2][0] = 9;
		Array2[2][1] = 10;
		Array2[2][2] = 11;
		Array2[2][3] = 12;
		
		System.out.println(Arrays.toString(Array2[0]));
		
		int Array23[][] = {
				{1,2},
				{3,4},
				{5,6},
		};
		
		System.out.println(Array23[2][0]);
	}

}
