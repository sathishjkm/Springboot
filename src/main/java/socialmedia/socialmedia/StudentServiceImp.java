package socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
    @Override
    public Optional<Student> getStudentById(Integer id) {
        return studentRepository.findById(id);
    }
    @Override
    public Student updateStudentById(Student student, Integer student_id) {
        student.setId(student_id);
        return studentRepository.save(student);
    }
    @Override
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }
}

