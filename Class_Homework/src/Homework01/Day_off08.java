package Homework01;

public class Day_off08 {

	public static void main(String[] args) {
		
		/*
		 * 배열의 크기가 10인 배열을 선언하고 10 ~ 1 까지의 값으로
		 * 초기화 하도록 한다.
		 */
		
		int arr[] =  new int[10];
		int arr1 = 10;  // 초기값 10 변수
		for(int i = 0; i < 10; i++) {
			arr[i] = arr1 - i; //
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		/*
		 * 배열의 크기가 10인 배열을 선언하고 2 부터 시작하여 짝수값에 해당하는
		 * 값으로 초기화 하도록 한다.
		 */
		
		int arr2[] = new int[10];
		int arr3 = 2; // 초기값 2변수 선언
		for(int i = 0; i < 10; i++) {
			arr2[i] = arr3;
			arr3 += 2;
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		/*
		 * 배열의 크기가 5인 실수 배열을 선언하고 1 부터 0.5 씩 증가된 값으로
		 * 초기화 하도록 한다.
		 */
		
		double arr4[] = new double[5];
		double arr5 = 1.0;
		for(int i = 0; i < 5; i++) {
			arr4[i] = arr5;
			arr5 += 0.5;
			System.out.print(arr4[i] + " ");
		}
		System.out.println();

		/*
		 * 배열의 크기가 5인 문자 배열을 선언하고 'A' ~ 'E' 까지의 문자값으로
		 * 초기화 하도록 한다.
		 */
		
		char arr6[] = new char[5];
		char arr7 = 'A';
		for(int i = 0; i < 5; i++) {
			arr6[i] = arr7;
			arr7 += 1;
			System.out.print(arr6[i] + " ");
		}


	}

}
