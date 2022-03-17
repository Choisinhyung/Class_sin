package exam03.pack1;

public class AccessMain extends AccessParent { //AccessMain이 자손 extends AccessParent가 부모 - 이게 상속이다..! inheritance
	public int v1;  //모든 패키지 사용가능
	protected int v2; // 같은 클래스 같은 패키지 후손
	int v3; //default
	private int v4; // 해당 클래스만~
	
	public void method1() {
}
	
	public void method2() {
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
//		System.out.println(p4); // AccessParent 클래스에서만 사용가능
	}
}
