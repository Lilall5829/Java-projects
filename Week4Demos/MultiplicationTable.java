
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display table title
		System.out.println("          Multiplication Table\n");
		//Display column headings
		System.out.print("    ");
		for(int i = 1; i<=9; i++) {
			System.out.print("  " + i + " ");
		}
		System.out.println("\n---------------------------------------");
		//Display row data
		for(int i = 1; i<=9; i++) {
			System.out.print(i + " |");
			for(int j = 1; j<=9; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
	}
}
