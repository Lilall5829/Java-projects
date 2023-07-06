import java.util.Scanner;
public class MethodExamples {
	//全局方法全局變量
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add();
		printName();
	}
	// 創建一個方法
	public static void printName() {
		System.out.println("Your's truly\nGrace Hopper");
	}
	public static void add() {
		int num1, num2, sum;
		System.out.print("Enter number:");
		num1 = input.nextInt();
		System.out.print("Enter number:");
		num2 = input.nextInt();
		sum = num1 + num2;
		System.out.println(sum);
	}
}
