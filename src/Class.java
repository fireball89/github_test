


public class Class {

	private String className;
	private Student[] students;
	private static final int MAX_CLASS_STUDENTS=20;
	
	public Class(String className){
		this.className = className;
		this.students = new Student[MAX_CLASS_STUDENTS]; 
	} 

}

