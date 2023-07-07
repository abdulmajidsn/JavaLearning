package Sunday;

public class ReversePyramid{
	public static void main(String[] args) {
		
		/* row print
		154321
		25432
		3543
		454
		55
*/
		 //r=1 move the next loop and will print untill value goes false 54321
		// false then again move to outer and r=2 again print the value follow the pross 
		for (int r = 1; r <= 5; r++) {  
			
			for (int c = 5; c >= r; c--) { //
				System.out.print(c);
			}
			System.out.println();
		}

	}
}
