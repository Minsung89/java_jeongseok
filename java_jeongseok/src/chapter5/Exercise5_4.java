package chapter5;


public class Exercise5_4 {

	public static void main(String[] args) {
	
		// 2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
		
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30},
		};
		
		int total = 0;
		float average = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				average++;
			}
		}
		average = total / (float)average;
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
		
	}	// end of main
}	// end of class