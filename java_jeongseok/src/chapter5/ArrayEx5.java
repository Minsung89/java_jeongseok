package chapter5;

public class ArrayEx5 {

	public static void main(String[] args) {
		
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] = (int)(Math.random() * 10));
		}
		System.out.println();
		
		for (int i = 0; i < number.length; i++) {
			boolean changer = false;		// 자리바꿈이 발생햇는지를 체크한다.
			
			for (int j = 0; j < number.length - 1 - i; j++) {
				if(number[j] > number[j+1]) {
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					changer = true;			// 자리바꿈이 발생했으니 changed를 true로.
				}	// end of if
			}	//end of for j
			
			if(!changer) break;	// 자리바꿈이 없으면 반복문을 벗어난다.
			
			for (int k = 0; k < number.length; k++) {
				System.out.print(number[k]);	// 정렬된 결과를 출력한다.
			}
			System.out.println();
		}
	}	// end of main
}	// end of class
