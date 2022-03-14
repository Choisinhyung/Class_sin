package Homework01;

import java.util.Scanner;

public class Day_0ff07 {

	
	public static void main(String[] args) {
		/*
		 * 카이사르 암호 만들기.
		 * 		- 사용자 입력으로 영단어를 입력 받는다.
		 * 		- 입력받은 영단어는 문자 배열로 생성한다.
		 * 		- 생성된 문자 배열에 대해 암호화된 배열을 저장하기 위한 배열을 새로 만든다.
		 * 		- 문자 쉬프트는 3으로 하고 만약 'z' 문자에 대한 쉬프가 필요한 경우 'a'로 넘어가게 해야 한다.
		 * 
		 * 출력 형식
		 * 		암호화 전 : apple
		 * 		암호화 후 : dssoh
		 */
		
		Scanner sc = new Scanner(System.in);  // 스캐너 객체 sc 생성
		System.out.print("영단어를 입력하세요 -> ");
		String Input = sc.nextLine();  // 사용자 입력 input 생성
		
		// 문자열 -> 문자 배열
		char arr[] = new char[Input.length()];  // 사용자입력 Input문자열의 길이만큼을 문자배열 arr에 저장
		
		for(int i = 0; i < arr.length; i++) {  // for문을 사용, i가 arr의 길이보다 작은동안 i++ / 즉 input이 apple이면 01234
			arr[i] = Input.charAt(i); // .chatAt(input의 저장된 문자열 중에서 i 글자만 char로 변환)하여 arr[i]에 저장 / a p p l e
			System.out.print(arr[i]);
		} System.out.println();
		
		
		// 암호화 배열 생성
		char rock[] = new char[arr.length];  // arr의 길이만큼 암호화 배열 rock에 저장 apple 01234
		for(int i = 0; i < rock.length; i++) {  // i가 rock의 길이보다 작은 동안 i++ 반복 apple (input)
			if(arr[i] + 3 > 'z') {   // 만약 infut +3 이 z보다 클 경우 
				rock[i] = (char)(arr[i] + 3 - 26);   // 암호화배열 rock는 문자 배열 arr[i] + 3 - 26(z에서 끝나면 a로 넘어가기위함)
			} else { // false라면~
				rock[i] = (char)(arr[i] + 3);  // 암호화배열 rock는 문자 배열 arr[i] + 3
			}
			System.out.print(rock[i]);
		} 	System.out.println();
		
		// 생성된 문자를 문자열로 만들어서 출력해야함
		
			String res1 = "";	// 사용자 입력 배열 arr을 저장할 문자열 변수 생성
			String res2 = "";	// 암호화 배열 rock을 저장할 문자열 변수 생성
			
			for(int i = 0; i < arr.length; i++) {	// i가 arr의 길이보다 작은동안 i++ / apple 01234
				res1 += arr[i];  // res1에 apple값 누적
				res2 += rock[i]; // res2dp dssoh값 누적
			}
			
			System.out.println(res1);
			System.out.println(res2);
		
		
		

	}

}
