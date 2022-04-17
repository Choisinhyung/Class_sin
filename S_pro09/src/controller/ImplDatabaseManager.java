package controller;

import model.vo.Grade;
import model.vo.Student;

public interface ImplDatabaseManager {
	public Grade[] search(String name);
	public boolean add(String name);
	public Student midify(String name, String subject, int score);
	public boolean remove(String name);
}
