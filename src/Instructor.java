
public class Instructor extends User{

	String imageLink;
	Lesson[] lessons;
	
	public void createLesson(Lesson [] lessons) {
		
		this.lessons = lessons;
				
	}
	
	public Lesson [] getLesson() {
		return this.lessons;
	}
	
	

}