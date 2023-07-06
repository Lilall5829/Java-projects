import java.util.Scanner;

public class MethodReturns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1, num2, answer, copies;
		double side1, side2, area;
//		System.out.println("Enter num1: ");
//		num1 = input.nextInt();
//		System.out.println("Enter num2: ");
//		num2 = input.nextInt();
//		System.out.println(add(num1, num2));
//		answer = add(num1, num2);
//
//		System.out.println(num1 + "+" + num2 + "=" + answer);
//		System.out.println("Enter side1: ");
//		side1 = input.nextInt();
//		System.out.println("Enter side2: ");
//		side2 = input.nextInt();
//		area = areaRectangle(side1, side2);
//		System.out.println(side1 + "*" + side2 + "=" + area);
		copies = 10000;
		System.out.println(printPrice(copies));
	}

	// 想要返回值，需要change void to int/double/string等返回值的類型,但是如果要返回兩個以上的類型，需要用到object
	public static int add(int x, int y) {
		int sum;
		sum = x + y;
//		System.out.println(x + " + " + y + " = " + sum);
		return sum;
	}

	public static double areaRectangle(double width, double length) {
		return width * length;
	}
	//A method that determines price for printing based on copies made
	//0 - 10 prints: $1.00/print
	//11 - 50 prints: $0.75/print
	//51 -100 prints: $0.65/print
	//101 or over: $0.50/print
	//千萬不要多次return！！！
	public static double printPrice( int copies) {
		double pricePerCopy;
		if(copies <= 10) {
			pricePerCopy = 1.00;
		}else if (copies <= 50){
			pricePerCopy = 0.70;
		}else if (copies <= 100) {
			pricePerCopy = 0.65;
		}else {
			pricePerCopy = 0.50;
		}
		
		return pricePerCopy * copies;
	}
}
