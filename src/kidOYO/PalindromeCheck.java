package kidOYO;

public class PalindromeCheck {
	public static void main(String[] args){
		String a = "mom";
		System.out.print(palindromeCheck(a));
	}
	public static boolean palindromeCheck(String a){
		char[] b = a.toCharArray();
		boolean palindrome = true;
		for(int i = 0; i < b.length/2; i++){
			int j = b.length - (i+1);
			if(b[i] == b[j]){
				palindrome = true;	//not necessary
			}else{
				palindrome = false;
				break;
			}
		}
		if(!palindrome){
		return false;
		}else
			return true;
	}
}
