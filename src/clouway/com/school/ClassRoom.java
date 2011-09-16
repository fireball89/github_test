package clouway.com.school;

/**
 *
 */
public class ClassRoom {

    private String className;
    private Student[] students;
    private static final int MAX_CLASS_STUDENTS = 20;

    /**
     * Creates new ClassRoom object with a specified name
     *
     * @param className: the name of the class room
     */
    public ClassRoom(String className) {
        this.className = className;
        this.students = new Student[MAX_CLASS_STUDENTS];
    }

    public String getClassName() {
        return className;
    }

    public Student[] getStudents() {
        return students;
    }

    public static int getMaxClassStudents() {
        return MAX_CLASS_STUDENTS;
    }

    /**
     *
     * @param student
     * @param index
     */
    public void insertStudent(Student student, int index) {
        if (index < 0 && index > MAX_CLASS_STUDENTS - 1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            this.students[index] = student;
        }
    }

    /**
     *
     * @param index
     * @return
     */
    public Student getStudent(int index) {
        if (index < 0 && index > MAX_CLASS_STUDENTS - 1) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return this.students[index];
        }
    }
}

