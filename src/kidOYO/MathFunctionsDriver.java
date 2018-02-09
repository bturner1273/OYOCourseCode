package kidOYO;

import StaticClasses.MathFunctions;

public class MathFunctionsDriver {

		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
			int a = 10;
			System.out.println(MathFunctions.pow(a, 2));
			a *= -1;
			System.out.println(a);
			System.out.println(MathFunctions.abs(a));
			a = MathFunctions.abs(a);
			a -= 8;
			System.out.println(a);
			System.out.println(MathFunctions.pow(a, 10));
			try {
				System.out.println(MathFunctions.incrementExact(a));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Integer Overflow Detected");
				e.printStackTrace();
			}

		}

}
