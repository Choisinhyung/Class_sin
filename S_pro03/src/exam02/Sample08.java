package exam02;

public class Sample08 {

	public static void main(String[] args) {
		/*
		 * while 문
		 * 		while(조건식) {
		 * 			반복 수행할 코드 작성
		 * 		}
		 * for문과 다르게 초기식, 증감식에 대한 형식은 없지만 일정 횟수 반복을 위해서는
		 * for문과 동일하게 초기식, 증감식 작성이 필요하다.
		 */
		
		int i = 0;
		while(i < 5) {
			System.out.println("i -> " + i);
			i += 1;
		}
		
		/*
		 * do...while문
		 * 		do {
		 * 			반복 수행할 코드 작성
		 * 		} while(조건식);
		 * 일단 최초 1회는 무조건 반복 진행을 하다 다음(2번째) 반복 부터는
		 * 조건식의 결과가 참일 때에만 진행을 하게 된다.
		 */
		
		do {
			System.out.println("i -> " + i);
			i += 1;
		} while(i < 5);
		
		/*
		 * break;문
		 * 		- 반복문을 강제로 종료시키기 위해 사용하는 구문
		 * 
		 * continue문
		 * 		- 반복문 안에서 다음 실행 코드의 진행을 막고 다시 반복문의 처음으로 돌려보내주는 구문
		 */
		
		i = 0;
		while(i < 10) {
			i += 1; // 무조건 진행
			if(i % 3 == 0) { // i = 3이 될 때마다 / 3 6 9
			System.out.println("i -> " + i); 
			} else {
				continue;
			}
			System.out.println("continue가 되면 이 출력은 동작 안함");
		}
	}

}