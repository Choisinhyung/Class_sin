package exam03;

import java.util.Scanner;

public class Sample02 {

	public static void main(String[] args) {
		/*
		 * 사용자 입력을 받기 위한 Scanner 클래스
		 * 		- 기본적으로 모든 사용자 입력 데이터는 문자열이다.
		 * 		- 정수 또는 실수 데이터를 사용하기 위해서 별도의 함수를 사용해야 한다. -> sc.nextInt, sc.nextDouble
		 */
		
		// sc객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 사용자 입력 받기.
		int iInfut = sc.nextInt(); // int값 저장하려면 형변환
		
		System.out.println("사용자 입력 값 : " + iInfut);
		System.out.printf("사용자 입력 값 : %d\n", iInfut);
		
		
		double dInfut = sc.nextDouble(); // 실수값 저장하려면 형변환
		
		System.out.println("사용자 입력 값 : " + dInfut);
		System.out.printf("사용자 입력 값 : %f\n", dInfut);
		
		

	}

}
