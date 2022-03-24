package exam03;

public class Run {

	public static void main(String[] args) {
		Student s = new Student("최신형", 16);
		
		s.nextYear();
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGrade());
		System.out.println(s);

	}

}
