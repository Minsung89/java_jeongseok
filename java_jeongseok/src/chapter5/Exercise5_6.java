package chapter5;


public class Exercise5_6 {

	public static void main(String[] args) {
		
		// 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
		// 변수 money의 금약을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		// 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다.
		
		// 큰 금액의 동전을 우선적으로 거슬러 주어야한다.
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		System.out.println("money = " + money);
 		
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] +"원 : " + money/coinUnit[i]);
			money %= coinUnit[i];
			
		}
		
	}	// end of main
}	// end of class
