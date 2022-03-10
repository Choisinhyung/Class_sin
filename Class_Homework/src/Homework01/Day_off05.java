package Homework01;

import java.util.Scanner;

public class Day_off05 {

	public static void main(String[] args) {
		/* 
		 * 사용자가 입력한 정수값에 해당하는 구구단을 출력할 때 한 줄에 3개의 결과가 출력되도록 하시오.
		 */
		
		int num, i;
		
		System.out.println("원하는 단의 숫자를 입력해주세요 -> ");
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		for(i = 0; i <= 8;) {
			System.out.printf("%d X %d = %d  ", num, ++i, num * i);
			System.out.printf("%d X %d = %d  ", num, ++i, num * i);
			System.out.printf("%d X %d = %d  ", num, ++i, num * i);
			System.out.println();
		} 

	}

}
