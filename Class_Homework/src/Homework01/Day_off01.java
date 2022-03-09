package Homework01;

import java.util.Scanner;

public class Day_off01 {

	public static void main(String[] args) {
		/* 
		 * 환율 계산 프로그램
		 * 		원달러 환율 값 입력 : 1235.00
		 * 		달러를 원화로 계산하겠습니까? 아니면 원화를 달러로 계산하겠습니까?
		 *  	(1:달러->원화, 2:원화->달러)
		 *  	달러값 입력 : 100
		 *  	100 달러는 123500 원 입니다.
		 *  	원화값 입력 : 100000
		 *  	100000 원은 약 80.97 달러 입니다. 
		 */
		
		Scanner sc = new Scanner(System.in); // 스캐너 객체 sc생성
		
		System.out.print("달러를 원화로 계산하겠습니까? 아니면 원화를 달러로 계산하겠습니까? (1:달러->원화, 2:원화->달러) -> ");
		
		
		double Exchange_rate = 1235.00; // 환율 기입

		int Infut = sc.nextInt();
		
		if(Infut == 1) {
			System.out.print("달러->원화를 선택하셨습니다. 달러값을 입력해주세요 -> ");
			
			int Dollar = sc.nextInt();
			double A = Dollar * Exchange_rate;
				
			System.out.printf("%d달러는 %.0f원 입니다.", Dollar, A);
			
		} else if(Infut == 2) {
			System.out.print("원화->달러를 선택하셨습니다. 원화값을 입력해주세요 -> ");
			
			int Won = sc.nextInt();
			double B = Won / Exchange_rate;
			
			System.out.printf("%d원은 %.2f달러 입니다.", Won, B);
		}

	}

}

// 아무것도 안보고 혼자 성공!!!!!!!!!!!!♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
