package Homework01;

import java.util.Scanner;

public class Day_off04 {

	public static void main(String[] args) {
		/* 
		 * 사용자가 입력한 정수값에 해당하는 구구단을 출력하시오
		 */
	
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단의 숫자를 입력해주세요 -> ");

		
		int num = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num * i);
		}
		
		

	}

}
