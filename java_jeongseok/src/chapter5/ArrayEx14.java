package chapter5;

public class ArrayEx14 {

	public static void main(String[] args) {
		args = new String[] {"sos"};
		if(args.length != 1) {
			System.out.println("usage : java MorseConverter WORD" );
			System.exit(0);
		}
		
		System.out.println("source : " + args[0]);
		String source = args[0].toUpperCase();		// �빮�ڷ� ��ȯ�Ѵ�.
		
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
				"-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...","-",
				"..-", "...-", ".--", "-..-", "-.--", "--.."};
		String result = "";
		
		for (int i = 0; i < source.length(); i++) {
			result += morse[source.charAt(i) - 'A'];
		}
		
		System.out.println("morse : " + result);
	}
}	// end of class
