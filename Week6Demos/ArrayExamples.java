
public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		int[] numbers = new int[5];
		double[] dhoubleArray = new double[5];
		boolean[] boolArray = new boolean[5];
		String[] stringArray = new String[5];
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		System.out.println();
		//2. put values 1-5 in numbers
		age = 8;
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		System.out.println();
		for(int i=0; i < numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		// Add 1 to each value in array and display
		//
		//Sample Output:
		// 2 3 4 5 6 
		for(int i=0; i < numbers.length; i++) {
			numbers[i]++;
			System.out.print(numbers[i] + " ");
		}
		//Sum all the values in the given array
		//
		//Sample Output:
//		The sum is 20
		int sum = 0;
		for(int i = 0; i <numbers.length;i++) {
			sum += numbers[i];
		}
		System.out.println("\n" + sum);
		//输出数组中的每个元素
		for(int num: numbers) {
			System.out.print(num + " ");
		}
		
		int max = 0;
		for(int num: numbers) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("\n" + max);

	}
	
}
