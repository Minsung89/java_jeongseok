package chapter4;

public class Exercise4_15 {
	public static void main(String[] args) {

		// ������ ȸ������ ���ϴ� ���α׷��̴�.
		// ȸ������, ���ڸ� �Ųٷ� �о ������ �д� �Ͱ� ���� ���� ���Ѵ�.
		// ���� ��� '12321'�̳� '13531'���� ���� ���Ѵ�.
		// ���α׷��� �ϼ��Ͻÿ�.
		int number = 12321;
		int tmp = number;
		
		int result = 0;	// ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ����
		
		while(tmp != 0) {
			result = result * 10 + tmp % 10;
			tmp = tmp / 10;
		}
		
		if(number == result) {
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		} else {
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");
		}
	}	// end of main
}  	// end of class