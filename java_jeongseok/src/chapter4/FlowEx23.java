package chapter4;

public class FlowEx23 {

	public static void main(String[] args) {
	
		int sum = 0;
		int i = 0;
		
		while((sum += ++i) < 100) {		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
			System.out.println(i + " - " + sum);
		}
	}	
}		
