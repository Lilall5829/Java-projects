
public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length;i++) {
			numbers[i] = (int)(Math.random()*10);
		}
		displayArray(numbers);
	}
	public static void displayArray(int[] array) {
		System.out.println();
		for(int num: array) {
			System.out.print(num + " ");
		}
	}
}
