package chapter3;

public class Exercise3_10 {

	public static void main(String[] args) {
		
		// �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��̴�.
		// ���� ch�� ����� ���ڰ� �빮���� ��쿡�� �ҹ��ڷ� �����Ѵ�.
		// �����ڵ�� �ҹ��ڰ� �빮�ں��� 32��ŭ �� ũ��.
		// ���� ��� 'A '�� �ڵ�� 65�̰� ' a'�� �ڵ�� 97�̴�.
		// lowerCase�� �ϼ��Ͽ���
		char ch = 'A';
		
		char lowerCase = ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch;
		
		System.out.println("ch : " + ch);
		System.out.println("ch to lowerCase : " + lowerCase);
	}
}
