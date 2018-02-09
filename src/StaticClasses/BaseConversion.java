package StaticClasses;

public final class BaseConversion {
	private BaseConversion() {
	}
	public static String binToHex(String data){
		return toHex(toDecimal(data, 2), 10);
	}
	public static String hexToBin(String data){
		return toBin(toDecimal(data, 16), 10);
	}
	public static String binToOctal(String data){
		return toOctal(toDecimal(data, 2), 10);
	}
	public static String octalToBin(String data){
		return toBin(toDecimal(data, 8), 10);
	}
	public static String octalToHex(String data){
		return toHex(toDecimal(data,8), 10);
	}
	public static String hexToOctal(String data){
		return toOctal(toDecimal(data, 16), 10);
	}
	public static int toDecimal(String data, int initBase) {
		int x = Integer.parseInt(data, initBase);
		return x;
	}

	public static int toDecimal(int data, int initBase) {
		String data1 = data + "";
		int x = Integer.parseInt(data1, initBase);
		return x;
	}

	public static String toHex(String data, int initBase) {
		int x = Integer.parseInt(data, initBase);
		return Integer.toHexString(x);
	}

	public static String toHex(int data, int initBase) {
		String data1 = data + "";
		int x = Integer.parseInt(data1, initBase);
		return Integer.toHexString(x);
	}

	public static String toBin(String data, int initBase) {
		int x = Integer.parseInt(data, initBase);
		return Integer.toBinaryString(x);
	}

	public static String toBin(int data, int initBase) {
		String data1 = data + "";
		int x = Integer.parseInt(data1, initBase);
		return Integer.toBinaryString(x);
	}

	public static String toOctal(String data, int initBase) {
		int x = Integer.parseInt(data, initBase);
		return Integer.toOctalString(x);
	}

	public static String toOctal(int data, int initBase) {
		String data1 = data + "";
		int x = Integer.parseInt(data1, initBase);
		return Integer.toOctalString(x);
	}
}
