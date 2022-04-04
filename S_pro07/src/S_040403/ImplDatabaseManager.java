package S_040403;

import S_0404.Grade;

public class ImplDatabaseManager {
	public Grade[] search(String name);
	public boolean add(String name);
	public Student modofy(String name, String subject, int score);
	public boolean remove(String name);

}
