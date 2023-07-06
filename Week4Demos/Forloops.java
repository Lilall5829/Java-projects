
public class Forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Create a loop that displays all values inclusive between 1-5.
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		//2. Create a loop that displays all values inclusive between 10-6.
		System.out.println();
		for(int i = 10; i >= 6; i--) {
			System.out.print(i + " ");
		}
		//3. Create a loop that displays even number inclusive between 2-10.
		System.out.println();
		for(int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		//4. Create a loop that displays the sum of all numbers between 1-10.
		System.out.println();
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.print(sum);
		//5. Create a loop that displays all leap years inclusive between 1990-2010.
		System.out.println();
		for(int year = 1990; year <= 2010; year++) {
			if( year % 4 == 0) {
				System.out.print(year + " ");
			}
		}

	}

}
