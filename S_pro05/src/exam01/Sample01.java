package exam01;

public class Sample01 {

	public static void main(String[] args) {
		/*
		 * Java - 객체 지향 언어
		 * 		- 현실 세계에 존재하는 객체들 간의 관계(상호작용)을 프로그램 안에서
		 * 		  동일하게 사용할 수 있도록 만들어 두었기 떄문에 이를 객체지향언어라고 한다.
		 *  	- 자바에서는 이러한 객체가 class라고 하는 단위로 정의가 되고 이 class를 통해
		 *  	  생성이 되면 메모리에 저장이 된다. -> jvm이 동작
		 *  	- class를 이용하여 객체를 만들 때에는 new 연산자를 사용한다.
		 *  	- 객체에는 변수, 배열, 객체, 메서드 등이 포함되어 사용된다. 
		 *  	- 객체를 만들기 위해서 class를 사용하는데 이 class는 객체의 설계도로 생각하면 된다. -> 블루프린트
		 *  	- class로부터 생성된 객체(object)는 인스턴스(instance)라는 이름으로도 불리운다. / 인스턴스는 오브젝트보다 작은 단위
		 * 
		 *  		
		 */
		
		PersonPub p1 = new PersonPub();
		PersonDef p2 = new PersonDef();
		
		System.out.println("실행 완료!");

	}

}
