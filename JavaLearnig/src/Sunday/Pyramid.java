package Sunday;

public class Pyramid {
	public static void print(int n) {
		int i, j;

		for (i = 0; i < n; i++) {
			
			for (j = 0; j <= i; j++) {
				System.out.print("i");
			}
			
			System.out.println("o");

		}
	}

	public static void main(String[] args) {
		int n = 5;
		print(n);
	}
}
