package chapter5;


public class Exercise5_7 {

	public static void main(String[] args) {
	
		// ���� 5-6�� ������ ������ �߰��� ���α׷��̴�. Ŀ�ǵ�������κ��� �Ž��� �� �ݾ��� �Է¹޾� ����Ѵ�.
		// ������ ������ ������ �Ž������� ������ �� ������, '�Ž������� �����մϴ�.'��� ����ϰ� �����Ѵ�.
		// ������ ���� ����� ������, �Ž������� ������ ��ŭ ���� ������ ���� ���� ������ ������ ȭ�鿡 ����Ѵ�.
		
		args = new String[] {"3170"};
		if(args.length != 1) {
			System.out.println("USAGE: Exercise5_7 3120");
			System.exit(0);
		}
		
		// ���ڿ��� ���ڷ� ��ȯ�Ѵ�. �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�.
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money = " + money);
		
		int[] coinUnit = {500, 100, 50, 10};	// ������ ����
		int[] coin = {5, 5, 5, 5};				// ������ ������ ����
		
		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			
			coinNum = money / coinUnit[i];
			if(coin[i] < coinNum) {
				money = money - (coinUnit[i] * coin[i]);	
				coinNum = coin[i];
				coin[i] = 0;
			} else {
				coin[i] = coin[i] - coinNum;
				money %= coinUnit[i];
			}
				
			
			
			System.out.println(coinUnit[i]+"�� : " + coinNum);
		}
		
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�.");
			System.exit(0);		//���α׷��� �����Ѵ�.
		}
		
		System.out.println("= ���� ������ ���� =");
		
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "�� : " + coin[i]);
		}
	}	// end of main
}	// end of class
