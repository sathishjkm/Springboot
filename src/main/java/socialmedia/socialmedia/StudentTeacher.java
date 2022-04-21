package socialmedia.socialmedia;

public class StudentTeacher {
    private String[] student;
    private String[] teacher;

    public StudentTeacher(String[] student, String[] teacher) {
        this.student = student;
        this.teacher = teacher;
    }
    public StudentTeacher(){}

    public String[] getStudent() {
        return student;
    }
    public void setStudent(String[] student) {
        this.student = student;
    }
    public String[] getTeacher() {
        return teacher;
    }
    public void setTeacher(String[] teacher) {
        this.teacher = teacher;
    }
}
