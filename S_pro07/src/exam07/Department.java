package exam07;

// 과장
public class Department extends Assistant implements TeamManager {

	private boolean teamManager;	// 팀장직을 가지고 있는지 true, false 로 구분
	// 과장부터 팀장직을 부여한다.
	
	public Department(String name, int age) {
		super(name, age);
		this.setSalary(4000);
	}
	
	@Override
	public void payMonth() { //월급?
		super.payMonth();
		teamPayBonus(teamManager);
	}
	
	@Override
	public void bonus(int month) {
		switch(month) {
			case 4: case 8: case 12:
				super.bonus(month);
		}
	}

	@Override
	public void teamPayBonus(boolean confirm) {
		// 팀장 직책을 수행하는 경우 연봉의 10%를 보너스로 받을 수 있습니다.
		System.out.println("팀장직 수행 보너스 : " + getSalary() / 0.1 / 12 + "원");
	}

}
