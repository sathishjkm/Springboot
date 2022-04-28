package socialmedia.socialmedia;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getStudents();
    Student createStudent(Student student);
    Optional<Student> getStudentById(Integer id);
    Student updateStudentById(Student student, Integer student_id);
    void deleteStudentById(Integer id);

}
