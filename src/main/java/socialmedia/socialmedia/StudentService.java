package socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(int student_id) {
        return studentRepository.findById(student_id);
    }

    public Student updateStudent(Student student, int student_id) {
        student.setId(student_id);
            return studentRepository.save(student);
        }
    public void deleteStudent(int student_id){
        studentRepository.deleteById(student_id);
    }
}
