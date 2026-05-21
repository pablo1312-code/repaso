package repaso; 

import java.util.Scanner;



public class Algorithm1 {



		public static void main(String[] args) {

			//inputs: three numbers can be represented by three variables

			int a, b, c;

			//create a scanner object to establish comunication between our app and the console

			Scanner sc = new Scanner(System.in);

			//read three numbers from the console

			a =  sc.nextInt();

			b =  sc.nextInt();

			c =  sc.nextInt();
			
			System.nanoTime();
			System.currentTimeMillis();
			
			
            System.out.println("the result is" + combineDigits(a,b,c));;
            sc.close();

		}
		
		/**
		 * combine all the digits from a integer 
		 * @param a the highest digit 
		 * @param b
		 * @param c the Lowest digit 
		 * @return the combined integer 
		 */

		private static int combineDigits(int a, int b, int c) {

			//constraints: validation of the inputs 
			//logical operator: or ||, and &&, not !

			if (a > 9 || a < 0 || b > 9 || b < 0 || c > 9 || c < 0) {

				System.out.println("your number should be a single digit and non negative");
				//throw new InvalidArgsException()
				return 0;

			}
            //if a is less than 10 and greater than 0...
			if (a <= 9 && a > 0 && b <= 9 && b >= 0 && c <= 9 && c >= 0) {
				//if all the conditions are meet 
			}
			

			return 23;

		}

	}

