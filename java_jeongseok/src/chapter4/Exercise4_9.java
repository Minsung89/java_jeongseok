package chapter4;

public class Exercise4_9 {
	public static void main(String[] args) {

		// ���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
		// ���� ���ڿ��� "12345"���, '1+2+3+4+5'�� ����� 15�� ����� ��µǾ���Ѵ�.
		String str = "12345";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			sum = sum + str.charAt(i) - 48;
		}
		
		System.out.println("sum = " + sum);
	}
} 