package chapter4;

public class FlowEx23 {

	public static void main(String[] args) {
	
		int sum = 0;
		int i = 0;
		
		while((sum += ++i) < 100) {		// i�� 1�� �������Ѽ� sum�� ��� ���س�����.
			System.out.println(i + " - " + sum);
		}
	}	
}		
