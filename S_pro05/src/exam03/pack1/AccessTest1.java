package exam03.pack1; // exam03패키지 안에 pack1라는 패키지를 생성

public class AccessTest1 { // class명은 AccessTest1
	
	public static void main(String[] args) { // 접근제한자public  static 결과없음void 
		AccessMain m1 = new AccessMain();
		System.out.println(m1.v1); // 모든 패키지 사용가능 public
		System.out.println(m1.v2); // 같은 패키지는 사용가능 protected
		System.out.println(m1.v3); // 같은 패키지는 사용가능 default
//		System.out.println(m1.v4); // AccessMain클래스에서만~
	}

}
