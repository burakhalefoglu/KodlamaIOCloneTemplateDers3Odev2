
public class Student extends User {

	Lesson[] lessons;
	
	public void registerLesson(Lesson[] lessons) {
		this.lessons = lessons;
	}
	
}
