package clouway.com.school;


public class Student {


    private String studentID;
    private String studentName;

    public Student(String studentID, String studentName) {

        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }
}
