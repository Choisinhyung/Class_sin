package exam08;

public class Main {

	public static void main(String[] args) {
		/*
		 * 추상 클래스
		 * 		- 몸체 없는 메서드(추상 메서드)를 포함하는 클래스, abstract 키워드를 사용해서 만든다.
		 * 		- 미완성된 클래스(추상클래스)를 만들어서 이를 상속하는 자식 클래스들이 미오나성된
		 * 		  부분을 완성할 수 있게 강제시키기 위한 용도로 사용.
		 * 		- 추상 클래스를 상속하는 모든 자식들은 미완성된 부분을 완성해야 하기 때문에 일관성이 높아진다.
		 * 		- 추상 클래스를 사용하여 객체를 직접 생성할 수는 없다.
		 * 		  (단,  참조 타입으로는 사용할 수 있다. - 다형성)
		 * 
		 *  접근제한자 반환형 메서드명 매개변수(타입,이름)만 정의되어있고 중괄호 안에 포함되어있는 몸체가 없다. -> 이걸 자식들이 만들어 줘야 함. abstract!
		 *  일관성! 다형성을 최대한 활용하기위한~ 일관성을 높여주기위해 추상클래스 사용
		 *  
		 *  
		 */
		
//		Shape s = new Shape(); // 객체 생성 불가(new)
		Shape s1 = new Circle();  // 자식으로 참조타입 생성은 가능~
		Shape s2 = new Square();
		Shape s3 = new Triangle();
		

	}

}
