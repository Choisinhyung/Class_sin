package exam01;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		int korean, english, math;
		int sum, avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해주세요 -> ");
		korean = sc.nextInt();
		
		System.out.print("영어 점수를 입력해주세요 -> ");
		english = sc.nextInt();
		
		System.out.print("수학 점수를 입력해주세요 -> ");
		math = sc.nextInt();
		
		sum = korean + english + math;
		avg = (korean + english + math) / 3;
		
		if(avg >= 60) {
			System.out.println("축하합니다. 합격입니다!");
			System.out.printf("총점 : %d점\n국어 : %d점\n영어 : %d점\n수학 : %d점\n평균 : %d점", sum, korean, english, math, avg);
		} else if(40 <= avg && avg <= 59) {
			System.out.print("평균 점수가 미달하였습니다. ");
		} 
		
		if(korean <= 39) {
			System.out.print("과락된 과목이 있어 불합격 되었습니다");
		} else if(english <= 39) {
			System.out.print("과락된 과목이 있어 불합격 되었습니다");
		} else if(math <= 39) {
			System.out.print("과락된 과목이 있어 불합격 되었습니다");
		}
		
		
		
		
		
		
	}

}
