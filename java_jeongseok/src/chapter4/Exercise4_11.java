package chapter4;

public class Exercise4_11 {
	public static void main(String[] args) {

		// �Ǻ���ġ ������ ���� �� ���� ���ؼ� ���� ���� ����� ������ �����̴�.
		// ���� ��� ���� �� ���� 1�� 1�̶�� �� ���� ���� 2�� �ǰ� �� ���� ���� 1�� 2�� ���ؼ� 3�� �Ǿ  1, 1, 2, 3, 5, 8, 13, 21...�� ���� ������ ����ȴ�.
		// 1�� 1���� �����ϴ� �Ǻ���ġ������ 10��° ���� �������� ����ϴ� ���α׷��� �ϼ��Ͽ���.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1+","+num2);
		
		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print(","+ num3);
			num2 = num1;
			num1 = num3;
			
		}
	}
} 