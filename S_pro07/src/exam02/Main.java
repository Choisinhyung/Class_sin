package exam02;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(16);
		s.setGender('M');
		s.setClassLevel(1);
		s.setClassRoom(5);
		System.out.println(s);
		
		Teacher t = new Teacher();
		t.setName("박주성");
		t.setAge(30);
		t.setGender('M');
		t.setClassLevel(1);
		t.setClassRoom(5);
		t.setSubject("영어");
		System.out.println(t);
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("김정수"); p1.setAge(20);
		p2.setName("김정수"); p2.setAge(25);
		
		System.out.println(p1.equals(p2));

	}

}
