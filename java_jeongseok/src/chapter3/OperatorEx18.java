package chapter3;

public class OperatorEx18 {

	public static void main(String[] args) {

		float pi = 3.141592f;
		// 소수점 첫째자리에서 반올림을 하고 그 결과를 정수로 돌려주는 메서드(Math.round())
		float shortPi = Math.round(pi * 1000) / 1000f; 
		
		System.out.println(shortPi);
	}
}
