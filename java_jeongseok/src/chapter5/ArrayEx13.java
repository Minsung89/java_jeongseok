package chapter5;

public class ArrayEx13 {

	public static void main(String[] args) {
		
		args= new String[] {"abc", "123", "Hello world"};
		
		System.out.println("�Ű������� ���� : " + args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
	}
}	// end of class
