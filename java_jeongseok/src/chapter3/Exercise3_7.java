package chapter3;

public class Exercise3_7 {

	public static void main(String[] args) {
	
		// ȭ��(Fahrenheit)�� ����(Celcius)�� ��ȯ�ϴ� �ڵ��̴�.
		// ��ȯ������ 'C = 5/9 * (F - 32)'��� ��
		// ��ȯ ������� �Ҽ��� ��°�ڸ����� �ݿø��ؾ��Ѵ�.(Math.round()�� ������� �ʰ� ó���� ��)
		//celcius�� �ϼ��Ͽ���
		int fahrenheit = 100;
		float celcius = (int)(5 / 9f * (fahrenheit - 32) * 100 + 1) / 100f;
		
		System.out.println("Fahrenheit = " + fahrenheit);
		System.out.println("Celcius = " + celcius);
		
	}
}
