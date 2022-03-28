package exam01;

public class Child extends Parent {
	
//	public Child() {
//		super(1); // 부모생성자호출, 
//	}

	public void printNumber() {
		setNumber(2);
		System.out.println(getNumber());
	}
	
	public void setNumber(int number) {
		System.out.println("자식의 setNumber 메서드 시작");
		super.setNumber(number);
		System.out.println("자식의 setNumber 메서드 끝");
	}
	//안해도 상관 없지만 오버라이딩이 가능한 메서드인지 확인시키는 용도로 쓰인다.
	// @Override
	public void setName(String name) {
	}
}
