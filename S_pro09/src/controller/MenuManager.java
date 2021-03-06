package controller;

import java.util.Scanner;

public class MenuManager {
	//학생 성적 관리의 메뉴를 관리하기 위한 매니저 클래스
	
	Scanner sc = new Scanner(System.in);
	private DatabaseManager db = new DatabaseManager();
	
	public void main() {
		StringBuilder menu = new StringBuilder();
		menu.append("1. 성적 조회\n"); //searchMenu()
		menu.append("2. 학생 정보 추가\n"); //studentAddMenu()
		menu.append("3. 성적 정보 수정\n"); //subjectModifyMenu()
		menu.append("4. 학생 정보 삭제\n"); //studentDeleteMenu()
		menu.append("9. 프로그램 종료\n"); //exit()
		
		while(true) {
			System.out.println(menu);
			System.out.println("원하는 메뉴의 숫자를 입력해주세요");
			String input = sc.nextLine();
	
			
			if(input.equals("1")) {
				searchMenu();
			} else if(input.equals("2")) {
				studentAddMenu();
			} else if(input.equals("3")) {
				subjectModifyMenu();
			} else if(input.equals("4")) {
				studentDeleteMenu();
			} else if(input.equals("9")) {
				System.out.println("프로그램을 종료합니다. ");
				System.exit(0);
			}
		}
	}
	
	public void searchMenu() {
		System.out.println("성적 조회 메뉴 실행\n");
		
	}
	
	public void studentAddMenu() {
		System.out.println("학생 정보 추가 메뉴 실행\n");
	}
	
	public void subjectModifyMenu() {
		System.out.println("성적 정보 수정 메뉴 실행\n");
	}
	
	public void studentDeleteMenu() {
		System.out.println("학생 정보 삭제 메뉴 실행\n");
	}
	
	

}
