import java.lang.reflect.Array;

public class ArrayReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {1,2,3};
		int[] array2 = array1;
		int[] array3 = new int[array1.length];
		
		for(int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}
		
		array1[0] = -1;
		array2[0] = -2;
		displayArray(array1);
		displayArray(array2);
		modifyArray(array1);
		displayArray(array1);
		displayArray(array2);
	}
	public static void displayArray(int[] array) {
		System.out.println();
		for(int num: array) {
			System.out.print(num + " ");
		}
	}
	public static void modifyArray(int[] array) {
		array[0] = 9;
	}
}
