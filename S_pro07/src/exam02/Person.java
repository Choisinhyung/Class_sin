package exam02;
//사람
public class Person {
	private String name;
	private char gender;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override // 모든 클래스는 오브젝트 클래스가 있는데 이 클래스논 모두 기본적으로 상속이 됨
	public String toString() { // 프린트 출력할때 객체 참조주소만 넣어도 출력된다
		return getName() + getAge() + getGender();
	}
	
	//모든 object가 가지고 있는 공통적인 기능   Object obj는 person객체와 같다
	@Override
	public boolean equals(Object obj) { // 객체간의 비교는 equals-객체가 가지고 있는 값에 대해 동일한 값을 가지고 있는 객체와 비교
		//동일 객체인지를 참조값으로 비교하는 것이 아닌 객체의 멤버 변수 값으로 비교하고자 할 때 활용
		if(this.getName().equals( ((Person)obj).getName() )) {
			//person객체 이름과 person obj객체의 이름과 같은지.(외부로부터 받은 person이라는 객체로 다운캐스팅-형변환)
			return true;

		}
		return false;
	}

	
	
}
