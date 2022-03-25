
public class MainClass {
	public static void main(String[] args) {
		int i=2,j=1;
		while(i < 10) {
			while(j < 10) {
				System.out.print(i + "x" + j + "=" + (i*j) + " ");
				j++;
			}
			System.out.println();
			j=1;
			i++;
		}
		
	}
}
