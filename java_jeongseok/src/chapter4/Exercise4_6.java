package chapter4;

public class Exercise4_6 {
	public static void main(String[] args) {

		// �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		int sum = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					sum++;
				}
			}
		}
		System.out.println(sum);
		
	}
} 