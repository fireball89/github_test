package clouway.com.school;

/**
 *
 */
public class ClassRoom {

	private String className;
	private Student[] students;
	private static final int MAX_CLASS_STUDENTS=20;

    /**
     * Creates new ClassRoom object with a specified name
     * @param className: the name of the class room
     */
	public ClassRoom(String className){
		this.className = className;
		this.students = new Student[MAX_CLASS_STUDENTS]; 
	} 

}

