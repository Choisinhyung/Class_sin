package exam07;

// 과장
public class Department extends Assistant {

	private boolean teamManager;	// 팀장직을 가지고 있는지 true, false 로 구분
	
	public Department(String name, int age) {
		super(name, age);
		this.setSalary(4000);
	}
	
	@Override
	public void bonus(int month) {
		switch(month) {
			case 4: case 8: case 12:
				super.bonus(month);
		}
	}

}
