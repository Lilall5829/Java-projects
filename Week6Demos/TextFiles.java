import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextFiles {

	public static void main(String[] args) {
		loadColours();
		loadColours2();
	}

	public static void loadColours() {
		File file = new File("Colours.txt");
		
		try(Scanner fileScanner  = new Scanner(file))
		{
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				System.out.println(line);
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void loadColours2() {
		File file = new File("Colours2.txt");
		
		try(Scanner fileScanner  = new Scanner(file))
		{
			while(fileScanner.hasNextLine()) {
				String[] line = fileScanner.nextLine().split("\\s+");
				
				for(String s: line) {
					System.out.print(s + " ");
				}
				
				System.out.println();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}