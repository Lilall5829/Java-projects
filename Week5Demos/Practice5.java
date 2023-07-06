import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int number, sum, 
//		int numberPL;
//		char start, end;
		int num, width;
		String value;
		Scanner input = new Scanner(System.in);
//		System.out.println("Enter number: ");
//		number = input.nextInt();
		//sum = sumDigits(number);
		//System.out.println("Sum: " + sum);
		
//		System.out.println("Enter start char: ");
//		start = input.next().charAt(0);
//		System.out.println("Enter end char: ");
//		end = input.next().charAt(0);
//		System.out.println("Enter number per line: ");
//		numberPL = input.nextInt();
//		printChars(start, end, numberPL);
		System.out.println("Enter num: ");
		num = input.nextInt();
		System.out.println("Enter width: ");
		width = input.nextInt();
		value = format(num, width);
		System.out.println(value);
	}

	public static int sumDigits(int n) {
		int i = 0, sum = 0;
		while (n >= 1) {
			i = n % 10;
			sum += i;
			n /= 10;
		}
		return sum;
	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		char i = ch1;
		int j = 1;
		while (i <= ch2) {
			System.out.printf("%-2c", i);
			i++;
			j++;
			if (j % numberPerLine == 0) {
				System.out.println();
			}
		}
	}
	public static String format(int number, int width ) {

		StringBuffer str = new StringBuffer(Integer.toString(number));
		int i = Integer.toString(number).length();
		if(width <= i) {
			return Integer.toString(number);
		}else {
			while(width-i>0) {
				str = str.insert(0,"0");
				width--;
			}
			return str.toString();
		}
	}
	
}
