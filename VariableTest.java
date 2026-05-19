package repaso;


public class VariableTest {
	
	public static void main(String[] args) {
		//explicit conversion 
		var num1 = 1;
		int num2 = 1; 
		//explicit conversion 
		int result = num1 + num2; 
		System.out.println(result);
		result = Calculator.sum((int)num1,num2);
		
		double result2 = num1 / num2;
		result2 = new Calculator().division(num1, num2);
		System.out.println(result2);
		
		System.out.println(Calculator.modulus(3.2f, 3));
		
		
		boolean stop = false;
		String color = "green";
		if(color== "green") {
			stop == false; 
		}
		 
		//reference variables 
	}
	 }


