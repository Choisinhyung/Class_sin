package controller;

import model.vo.Grade;
import model.vo.Student;

public class DatabaseManager implements ImplDatabaseManager {
	
	private Student[] db;

	@Override
	public Grade[] search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student midify(String name, String subject, int score) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(String name) {
		// TODO Auto-generated method stub
		return false;
	}
	//학생 정보를 추가, 수정, 삭제할 수 있는 기능이 정의되어 있는 매니저 클래스

}
