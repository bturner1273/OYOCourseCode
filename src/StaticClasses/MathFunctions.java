package StaticClasses;

public class MathFunctions {

	private MathFunctions() {}
	
	public static int pow(int base, int toThePowerOf){
		int originalBase = base;
		for(int i = 1; i < toThePowerOf; i++){
			base *= originalBase;
		}
		return base;
	}
	
	public static double pow(double base, int toThePowerOf){
		double originalBase = base;
		for(int i = 1; i < toThePowerOf; i++){
			base *= originalBase;
		}
		return base;
	}
	
	public static int abs(int a){
		if(a < 0){
			return (-1*a);
		}else
			return a;
	}
	
	public static double abs(double a){
		if(a < 0){
			return (-1*a);
		}else
			return a;
	}
	public static int incrementExact(int a) throws Exception{
		if(a <= Integer.MAX_VALUE-1){
			a++;
		}
		return a;
	}
	public static long incrementExact(long a) throws Exception{
		if(a <= Integer.MAX_VALUE-1){
			a++;
		}
		return a;
	}
	public static int decrementExact(int a) throws Exception{
		if(a >= Integer.MIN_VALUE + 1){
			a--;
		}
		return a;
	}
	public static long decrementExact(long a) throws Exception{
		if(a >= Integer.MIN_VALUE + 1){
			a--;
		}
		return a;
	}
	public static int max(int a, int b){
		if(a > b){
			return a;
		}else{
			return b;
		}
	}
	public static double max(double a, double b){
		if(a > b){
			return a;
		}else{
			return b;
		}
	}

}
