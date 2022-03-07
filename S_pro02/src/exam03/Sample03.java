package exam03;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		/*	사용자가 입력한 한 줄 데이터를 처리하기 위한 sc.nextLine()
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String sInfut = sc.nextLine(); // next는 공백을 기준으로 잘라서 앞 부분만 저장..!
		
		System.out.println("입력 문자열 : " + sInfut);
		
		
	//	sc.next() / sc.nextLine()

	}

}
