
public class MathMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double randDouble, total, tipRate, tipAmount;
		int randInt, min, max;
		
		//1.Get a random values in a range
		randDouble = Math.random()*10;
		System.out.println(randDouble);
		
		//强制类型转换
		randInt = (int)(Math.random()*10);
		System.out.println(randInt);
		
		min = 10;
		max = 13;
		randInt = (int)(Math.random()*(max - min +1) + min);
		System.out.println(randInt);
		
		//2. round a decimal value, 不改变原值
		randDouble = 2.2;
		//向上/下取整
		System.out.println(Math.ceil(randDouble));
		System.out.println(Math.floor(randDouble));
		//四舍五入取整
		System.out.println(Math.round(randDouble));
		//四舍五入到最接近的偶数
		System.out.println(Math.rint(randDouble));
		
		//3. get the max and min values
		System.out.println(Math.max(min, max));
		System.out.println(Math.max(3, 4));
		
		//4. get the absolute value
		System.out.println(Math.abs(-4.3));
		
		//5. use power and square root
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(2));
		
		//6. calculate the tip on a bill and format output with specifier
		total = 67.45;
		tipRate = 0.15;
		tipAmount = total * tipRate;
		//System.out.println("tip: $" + tipAmount);
		System.out.printf("total: $%.2f   tip: $%.2f\n", total,tipAmount);
		
		//7. create a table of values
		System.out.println();
		//-10表示在变量左边的10个空格，正数表示右边
		System.out.printf("\n%-10s%-10s%s","x","x^2","x^3");
		System.out.printf("\n%-10.0f%-10.0f%-10.0f", 1.0, Math.pow(1, 2),Math.pow(1, 3));
		System.out.printf("\n%-10.3f%-10.0f%-10.0f", 2.0, Math.pow(2, 2),Math.pow(2, 3));
		System.out.printf("\n%-10d%-10.0f%-10.0f", 3, Math.pow(3, 2),Math.pow(3, 3));
	}

}
