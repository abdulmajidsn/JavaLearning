package Sunday;

public class Multiplication {

	public static void main(String[] args) {
		int boxSize = 10;
		for (int i = 1; i <= boxSize; i++) {
			for (int j = 1; j <=boxSize; j++) {
				int n = i * j;
				System.out.print("" + n);
			}
			System.out.println();
		}
	}

	/*
	 * int num = 10; long factorial = 1; for(int i = 1; i <= num; ++i) { //
	 * factorial = factorial * i; factorial *= i; }
	 * System.out.printf("Factorial of %d = %d", num, factorial); }
	 */

}
