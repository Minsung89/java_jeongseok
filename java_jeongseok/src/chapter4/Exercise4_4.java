package chapter4;

public class Exercise4_4 {
	public static void main(String[] args) {

		// 1 + (-2) + 3 + (-4) +...�� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�
		int i = 1;
		int sum = 0;
		int count = 0;
		while(true) {
			count ++;
			if(sum >= 100)
				break;
			sum += i % 2 == 0 ?  -i :  i;
			i++;
		}
		System.out.println(count);
	}
}
