package S_040403;

import S_0404.Grade;

public class DatabaseManager implements ImplDatabaseManager {
	// 학생 정보를 추가, 수정, 삭제할 수 있는 기능이 정의되어 있는 매니저 클래스
	
	private Student[] datas;
	
	// 초기화 블록
	{
		datas = new Student[5];
		datas[0] = new Student("홍길동");	datas[1] = new Student("김도원");
		datas[2] = new Student("박수아");	datas[3] = new Student("최종희");
		datas[4] = new Student("이정우");
		
		for(int i = 0; i < datas.length; i++) {
			datas[i].setGrades(new Grade[] {
					new Grade("국어"), new Grade("영어"), new Grade("수학"), new Grade("과학")
			});
		}
	}
	
	@Override
	public Grade[] search(String name) {
		return null;
	}

	@Override
	public boolean add(String name) {
		return false;
	}

	@Override
	public Student modify(String name, String subject, int score) {
		return null;
	}

	@Override
	public boolean remove(String name) {
		// TODO Auto-generated method stub
		return false;
	}
}