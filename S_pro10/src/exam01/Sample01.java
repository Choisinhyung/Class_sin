package exam01;

public class Sample01 {
	
	public static void main(String[] args) {
		
		MyException m = new MyException();
		
//		m.exceptionThows();
		System.out.println("에러 발생 전.");
		m.exceptionNonThrows();
		System.out.println("에어 발생 후 처리 완료!");
;		
		
	}

}
