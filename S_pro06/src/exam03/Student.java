package exam03;

import java.util.Random;

public class Student {
	private String name; // 이름
	private int age; // 나이
	private int grade; // 학년
	private int classRoom; // 반
	private int classNum; // 번호
	
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public Student (String name) {
		this.name = name;
		this.age = 14;
		this.grade = 1;
	}
	
	public Student (String name, int age) {
		this.name = name;
		this.age = age;
		this.grade = 1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
	public void nextYear() {
		age++;
		
		if(this.grade == 3) {
			this.graduate();
		} else {
			this.grade++;
			Random rand = new Random();
			this.classRoom = this.assignClassRoom();
		}
	}
	
	private int assignClassRoom() {
		Random rand = new Random();
		return rand.nextInt(9) + 1;
	}
	
	private void graduate() {
		this.grade = -1;
		this.classRoom = -1;
		this.classNum = -1;
	}
	
	public String toString() {
		return String.format("%s(%d) : %d 학년 %d 반", this.name, this.age, this.grade, this.classRoom); // format - printf에서 f를 의미
//		return this.name + "(" + this.age + "): " + this.grade + "학년 " + this.grade + "반 ";
	}
	
	
	
	
	
	
	

}
