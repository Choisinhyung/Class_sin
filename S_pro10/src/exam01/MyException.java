package exam01;

public class MyException {
	
	public void exceptionThows() throws Exception {
		// 현재 메서드를 실행한 위치로 발생된 에어를 던지는 메서드
		
		exceptionRun();
	}
	
	public void exceptionNonThrows() {
		// 현재 메서드에서 발생된 에러를 처리하는 메서드
		
		try {
			exceptionRun();
		} catch (Exception e) {
			System.out.println("Exception을 처리하였습니다. ");
		}
	}
	
	private void exceptionRun() throws Exception {
		//에러를 발생 시키기 위한 메서드
		System.out .println("에러 발생!");
		throw new Exception();
	}

}
