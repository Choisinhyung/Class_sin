package exam01;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		
		double rate;
		int menuNumber;
		int dollar, won;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("원 달러 환율 값 입력 -> ");
		rate = sc.nextDouble();
		
		System.out.println("달러를 원화로 계산하겠습니까? 아니면 원화를 달러로 계산하겠습니까?");
		System.out.print("(1:달러->원화, 2:원화->달러) -> ");
		menuNumber = sc.nextInt();
		
		if(menuNumber == 1 ) {
			System.out.print("달러값 입력 : ");
			dollar = sc.nextInt();
			won = (int)(dollar * rate);
			System.out.printf("%d 달러는 %d원 입니다.", dollar, won);
		} else if(menuNumber == 2) {
			System.out.print("원화값 입력 : ");
			won = sc.nextInt();
			dollar = (int)(won / rate);
			System.out.printf("%원은 %.2f달러 입니다.", won, dollar);
		}
		
		
		

	}

}
