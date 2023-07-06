
public class CharValuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ASCII表中，字母a的编号为97，所以可以给char赋数字，给int赋字符a
		char c = 97;
		int i = 'a';
		
		System.out.println(c);
		System.out.println(i);
		
		c++;
		System.out.println(c);
		
		if(c >= 'A' && c<='Z') {
			System.out.println(c + " is an uppercase letter.");
		} else if(c >= 'a' && c<='z') {
			System.out.println(c + " is an lowercase letter.");
		} else if(c >= '0' && c<='9') {
			System.out.println(c + " is a number.");
		}
		c = (char)i;
		System.out.println(c);
	}

}
