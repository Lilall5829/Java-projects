import java.util.Scanner;

public class MethodParameters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
//		String userName, userPin;
//		System.out.print("Enter number:");
//		num1 = input.nextInt();
//		System.out.print("Enter number:");
//		num2 = input.nextInt();
//		add(num1, num2);
//		canVote(17);
//		System.out.println("Enter name:");
//		userName = input.nextLine();
//		System.out.println("Enter pin:");
//		userPin = input.nextLine();
//		userCheck(userName, userPin);
		inchesToCm(2.45);
		num1 = 10;
		num2 = 36;
		System.out.println("Before method swap:" + num1 + " " + num2);
		switchValues(num1, num2);
		//形參和實參不是一回事，所以實參num1,num2 after method沒變
		System.out.println("After method swap:" + num1 + " " + num2);
	}

	public static void add(int x, int y) {
		int sum;
		sum = x + y;
		System.out.println(sum);
	}

	public static void canVote(int age) {
		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			System.out.println("You can not vote");
		}
	}

	public static void userCheck(String name, String pin) {
		if (pin.equals("1234")) {
			System.out.println("Welcome" + name);
		} else {
			System.out.println("Wrong Pin");
		}

	}

	// convert inches to cm(1inch = 2.54cm)
	public static void inchesToCm(double inches) {
		double cm;
		cm = inches * 2.54;
		System.out.println("conversion is " + cm + "cms");
	}

	public static void switchValues(int num1, int num2) {
		System.out.println("Method before swap:" + num1 + " " + num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Method after swap:" + num1 + " " + num2);
	}

}
