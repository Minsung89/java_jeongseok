package chapter3;

public class Exercise3_9 {

	public static void main(String[] args) {
		
		// ������ ���� ch�� ������(�빮�� �Ǵ� �ҹ���)�̰ų� ������ ���� ���� b�� ���� true�� �ǵ��� �ϴ� �ڵ��̴�.
		// b�� �ϼ��Ͽ���
		char ch = 'z';
		boolean b = (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9');
				
		System.out.println(b);
	}
}
