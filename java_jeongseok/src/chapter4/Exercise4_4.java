package chapter4;

public class Exercise4_4 {
	public static void main(String[] args) {

		// 1 + (-2) + 3 + (-4) +...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오
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
