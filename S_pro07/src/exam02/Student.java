package exam02;

public class Student extends Person {
	//학생으로서 받아야하는 속성
	private int classLevel; // 학년
	private int classRoom; //반
	
	
	public int getClassLevel() {
		return classLevel;
	}
	public void setClassLevel(int classLevel) {
		this.classLevel = classLevel;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	public String toString() {
		return super.toString() + getClassLevel() + getClassRoom();
	}

}
