package KH_test01;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~10사이의 정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num >= 1 && num <=10) { // 1보다 크거나같고 or 10보다 작거나 같을때 아래를 실행한다
			for(int i = 1; i <= num; i++) { // i가 1이고 입력값보다 작거나 같을경우 i++실행  입력값이 5이면 1 2 3 4 5 
				if(i % 2 == 1) {
					System.out.println(i);					
				}
			}
		} else {
			System.out.println("1과10사이의 숫자가 아닙니다.");
		}
	}

}
