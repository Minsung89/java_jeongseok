package chapter3;

public class OperatorEx18 {

	public static void main(String[] args) {

		float pi = 3.141592f;
		// �Ҽ��� ù°�ڸ����� �ݿø��� �ϰ� �� ����� ������ �����ִ� �޼���(Math.round())
		float shortPi = Math.round(pi * 1000) / 1000f; 
		
		System.out.println(shortPi);
	}
}
