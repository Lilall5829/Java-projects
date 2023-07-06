import java.util.Scanner;
public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double side1, side2,area;
		int intSide1, intSide2, intArea;
		System.out.println("Enter side1: ");
		side1 = input.nextInt();
//		System.out.println("Enter side2: ");
//		side2 = input.nextInt();
//		area = areaRectangle(side1, side2);
//		System.out.println(side1 + "*" + side2 + "=" + area);
		System.out.println("Enter side1: ");
		intSide1 = input.nextInt();
		System.out.println("Enter side2: ");
		intSide2 = input.nextInt();
		intArea = areaRectangle(intSide1,intSide2);
		System.out.println(intSide1 + intArea);
//		area = areaCircle(side1);
//		System.out.println(side1 + area);
		
	}

	public static double areaRectangle(double width, double length) {
		return width * length;
	}
	public static double areaCircle(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	//形參類型，方法類型不同，即使方法名一樣，也不會報錯，java會自動匹配與參數類型一致的方法
	public static int areaRectangle(int width, int length) {
		return width * length;
	}
}
	