package kidOYO;

//Unicode starts at ~33 and ends at ~59493, emojis are around 30000
public class printUnicodeTable {
		public static void main(String[] args){
			printEmojis();
			print10000ChineseCharacters();
		}
		public static void printEmojis(){
			System.out.println("You're a " + (char)11088);
		}
		public static void print10000ChineseCharacters(){
			for(int i = 20000; i < 30000; i++){
				if(i % 10 == 0 && i != 20000){
					System.out.println();
				}
				System.out.print(i + ". " + (char)i + " ");
			}
		}
}
