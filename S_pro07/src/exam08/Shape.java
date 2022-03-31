package exam08;

public abstract class Shape { // 모양 - 추상클래스 abstract 추가..!
	
	private double width; // 너비
	private double height; // 높이
	
	//추상메서드 abstract 가 있으면 추상클래스로 만들어야 함
	public abstract double getArea();
	
	//추상메서드
	public abstract double getRound();
	
	//메서드
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	

}
