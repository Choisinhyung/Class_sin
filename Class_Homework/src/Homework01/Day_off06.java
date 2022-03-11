package Homework01;

public class Day_off06 {

	public static void main(String[] args) {
		
		/*
		 * 다음의 결과가 나올 수 있도록 중첩 반복문을 사용하시요.(띄어쓰기는 \t)
		 * 
		 * 1
		 * 2	3
		 * 4	5	6
		 * 7	8	9	10
		 * 11	12	13	14	15
		 * 
		 */
		int n = 0;
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.print(++n + "\t");
			}
			System.out.println();
		}

	}

}
