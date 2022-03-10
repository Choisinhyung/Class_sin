package Homework01;

import java.util.Scanner;

public class Day_off02 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		int korean, english, math, sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해주세요 -> ");
		korean = sc.nextInt();
		
		System.out.print("영어 점수를 입력해주세요 -> ");
		english = sc.nextInt();
		
		System.out.print("수학 점수를 입력해주세요 -> ");
		math = sc.nextInt();
		
		sum = korean + english + math;
		avg = sum / 3.0;
		
		
		if(korean < 40 || english < 40 || math < 40) {
			System.out.println("과락된 과목이 있어 불합격 되었습니다");
			System.out.printf("과락된 과목은 다음과 같습니다.");
			if(korean < 40) {
				System.out.println("국어");
			}
			if(english < 40) {
				System.out.println("영어");
			}
			if(math < 40) {
				System.out.println("수학");
			}
		} else {
			if(0 <= avg && avg >= 60) {
				System.out.println("축하합니다. 합격입니다!");
				System.out.printf("총점 : %d점\n", sum);
				System.out.printf("국어 : %d점\n", korean);
				System.out.printf("영어 : %d점\n", english);
				System.out.printf("수학 : %d점\n", math);
				System.out.printf("평균 : %.1f점", avg);
			} else {
				System.out.print("평균 점수가 미달하였습니다. ");
			} 
		
//		if(korean <= 39) {
//			System.out.print("과락된 과목이 있어 불합격 되었습니다");
//		} else if(english <= 39) {
//			System.out.print("과락된 과목이 있어 불합격 되었습니다");
//		} else if(math <= 39) {
//			System.out.print("과락된 과목이 있어 불합격 되었습니다");
//		}
		

		}
	
	}
}
 // 나는 과락부분은 if문을 따로 생성하여 코드를 짰는데 중첩if로도 가능한 부분이였다. and or 까먹지 말고 유용하게 사용할 것. tab들여쓰기 잘 체크
/* 보기 좋게 총점과 점수나타내는 부분 printf 따로 작성할 것. 가독성 높이기
 * 	나는 이렇게 함ㅠㅠ : System.out.printf("총점 : %d점\n국어 : %d점\n영어 : %d점\n수학 : %d점\n평균 : %.1f점", sum, korean, english, math, avg);
 */