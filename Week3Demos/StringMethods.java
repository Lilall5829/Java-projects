
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "LI LA";
		char chatTest = '+';
		//1. Create and display a string in upper and lowercase, 不改变原值
		System.out.println(name);
		System.out.println(name.toLowerCase());
		name = name.toLowerCase();
		System.out.println(name);
		//对于char类型
		System.out.println(Character.toLowerCase(chatTest));
		System.out.println(Character.toUpperCase(chatTest));
		
		//2. Determine what 'type' a character is
		//检查是否是字母
		if(Character.isLetter(chatTest)) {
			System.out.println(chatTest + " is a letter");
		} else {
			System.out.println(chatTest + " is not a letter");
		}
		//检查是否是数字
		if(Character.isDigit(chatTest)) {
			System.out.println(chatTest + " is a Digit");
		} else {
			System.out.println(chatTest + " is not a Digit");
		}
		//检查是字母或数字
		if(Character.isLetterOrDigit(chatTest)) {
			System.out.println(chatTest + " is a LetterOrDigit");
		} else {
			System.out.println(chatTest + " is not a LetterOrDigit");
		}
		if(!Character.isLetterOrDigit(chatTest)) {
			System.out.println(chatTest + " is not a LetterOrDigit");
		} else {
			System.out.println(chatTest + " is a LetterOrDigit");
		}
		//3. Remove excess blank lines
		name = "   LI LA   ";
		//只能除掉内容前后的空格，不能除掉内容中间的
		System.out.println(name.trim() + ".");
		
		
		
	}

}
