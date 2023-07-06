import java.util.Scanner;
public class SearchCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String testString, testString2, firstName, lastName;
		int index, compareValue;
		System.out.println("Enter course code");
		testString = input.nextLine();
		//String长度
		System.out.println(testString.length());
		//search索引为2的字符
		System.out.println(testString.charAt(2));
		//search最后一个字符
		System.out.println(testString.charAt(testString.length()-1));
		
		if(testString.contains("PROG")) {
			System.out.println("It's a PROG");
		} else {
			System.out.println("Not a PROG");
		}
		
		index = testString.indexOf("p");
		//如果返回-1，即没有找到
		System.out.println(index);
		if (index >=0 ) {
			System.out.println(index);
		} else {
			System.out.println("Not found");
		}
		
		testString = "xx oo xx oo xx";
		//3是寻找开始的位置
		index = testString.indexOf("xx",3);
		System.out.println(index);
		//最后一次找到的位置
		index = testString.lastIndexOf("xx",0);
		System.out.println(index);
		
		testString = "Tony Theo";
		index = testString.indexOf(" ");
		//子串切分,从第一个切到第index前一位字符
		firstName = testString.substring(0,index);
		System.out.println(firstName);
		lastName = testString.substring(index + 1, testString.length());
		System.out.println(lastName);
		
		//3. Compare two strings
		testString = "Kitchener";
		testString2 = "Waterloo";
		//检查两个字符串是否相同,注意：大小写敏感！
		if(testString.equals(testString2)) {
		//if(testString.equalsIgnoreCase(testString2)) { 这样大小写就不敏感了
			System.out.println("Same city!");
		}else {
			System.out.println("Different city!");
		}
		//比较首字母在字母表中的次序
		compareValue = testString.compareTo(testString2);
		System.out.println(compareValue);
		
		if(compareValue == 0) {
			System.out.println();
		} else if(compareValue > 0){
			System.out.println(testString2 + " " + testString);
		} else {
			System.out.println(testString + " " + testString2);
		}

		
		input.close();
	}

}
