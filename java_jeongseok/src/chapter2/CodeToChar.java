package chapter2;

public class CodeToChar {
	
	public static void main(String[] args) {
		int code = 65;							// �Ǵ� int code = 0x0041;
		char ch = (char)code; 					// char ch = '\u0041';�� �ٲ� �ᵵ ����
		
		System.out.println(code);
		System.out.println(ch);

	}

}
