package chapter2;

public class CodeToChar {
	
	public static void main(String[] args) {
		int code = 65;							// 또는 int code = 0x0041;
		char ch = (char)code; 					// char ch = '\u0041';로 바꿔 써도 같다
		
		System.out.println(code);
		System.out.println(ch);

	}

}
