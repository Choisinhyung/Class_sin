package KH_test01;

public class Circle {
	
	// 속성 영역
	public static final double pi = 3.14; // 상수 파이의 값은 3.14
	public double radius; 
	
	
	//기능 메서드 영역
	
	public Circle() {} //기본생성자
	
	public Circle(double radius) { // Circle메소드영역 매개변수는 더블radius
		this.radius = radius; // 멤버변수 radius = 매개변수 radius
	}
	
	public double getRadius() { // getRadius 호출 / radius를 반환함.
		return radius;
	}
	public void setRadius(double radius) { // 반환값없는 setRadius메서드의 매개번수는 radius
		this.radius = radius; // 멤버변수 radius = 매개변수 radius
	}
	public static double getPi() { //static변수는 객체를 생성x. 반환값이 더블인 getpi메서드 호출
		return pi; // pi값을 반환 3.14
	}
	
	public void draw() { // 매개변수 없고 반환값 없는 draw메서드 호출
		System.out.println("반지름" + radius + "cm인 원을 그립니다.");
	}

} // 불필요한거 한개더..
