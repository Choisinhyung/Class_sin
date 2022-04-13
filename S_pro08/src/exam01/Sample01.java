package exam01;

import java.util.Arrays;

public class Sample01 {

	public static void main(String[] args) {
	//문자열 생성
	String s1 = "문자열";
	String s2 = new String("문자열"); //생성자

	char[] cArr = new char[] {'문', '자', '열'};
	String s3 = new String(cArr);

	byte[] bArr = new byte[] {65,66,67,68};
	String s4 = new String(bArr);
						
	System.out.println(s1 + " | " + s2 + " | " + s3 + " | " + s4);
						
	//문자열 관련 메서드
	boolean equal = s1.equals(s2);
	System.out.println("동일한 문자열 값 비교 : " + equal);

	for(int i = 0; i < s1.length(); i++) {
		char c1 = s1.charAt(i);
		System.out.println("\"문자열\" 문자에서 추출 : " + c1 );
	}

	s1 = "String(문자열) 관련 메서드";
	boolean contain = s1.contains("문자");
	System.out.println("\"문자열\" 에서 \"문자\" 포함 유무 : " + contain);
		
	int index = s1.indexOf("문자");
	System.out.println("\"문자열\" 에서 \"문자\"가 포함되어 있으면 그 위치가 어디냐 : " + index);
			
	s1 = s1.replace("메서드", "method"); // 메서드를 찾아서 method로 고쳐라
	System.out.println(s1);
			
	String[] sArr = s1.split(" "); //공백만들어주는 것 - 분리하는 기준~
	System.out.println(Arrays.toString(sArr)); // 공백을 기준으로 배열로 나눠서 분리 하는 것
			
	s1 = "010-1234-5678";
	sArr= s1.split("-");
	System.out.println(Arrays.toString(sArr));
			
	s1 = String.join("/", sArr); //String.join(무엇을 기준으로 합칠건지~), 배열이름
	System.out.println(s1);
			
	s1 = "		앞/뒤로 공백이 포함된 문자열 		";
	s1 = s1.trim(); //양 끝 불필요한 공백 제거기능
	System.out.println(s1);
			
	s1 = s1.substring(2); // 2번인덱스부터 출력
	System.out.println(s1);
			
	s1 = s1.substring(3, 6); // 3번 인덱스부터 6번인덱스 직전까지 잘라서 출력해라
	System.out.println(s1);
						
	s1 = "영문자 upper/lower";
	s1 = s1.toUpperCase(); //대문자로 변경
	System.out.println(s1);
			
	s1 = s1.toLowerCase(); //소문자로 변경
	System.out.println(s1);
			
	cArr = s1.toCharArray(); // 문자열을 문자 배열로 반환
	System.out.println(cArr);
			
	s1 = "010-1234-5678";
	boolean isPhone = s1.matches("\\d{3}-\\d{4}-\\d{4}"); //정규표현식
	System.out.println(isPhone);
	}
}
