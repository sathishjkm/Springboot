package socialmedia.socialmedia;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController

public class StudentController {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private StudentServiceImp studentServiceImp;

    @PostMapping("/students")
    Student createStudent(@RequestBody StudentDto studentDto){
        Student student=modelMapper.map(studentDto,Student.class);
        return studentServiceImp.createStudent(student);
    }
    @GetMapping("/students")
    List<StudentDto>getStudents(){
        return studentServiceImp.getStudents().stream().map(student -> modelMapper.map(student,StudentDto.class))
                .collect(Collectors.toList());
    }
    @GetMapping("/students/{student_id}")
    Optional<StudentDto>getStudentById(@PathVariable("student_id") Integer student_id){
        Optional<Student>student=studentServiceImp.getStudentById(student_id);
        Optional<StudentDto>studentDto=modelMapper.map(student,Optional.class);
        return studentDto;
    }
    @PutMapping("/students/{student_id}")
    StudentDto updateStudentById(@RequestBody StudentDto studentDto,@PathVariable("student_id") Integer student_id){
        Student student=modelMapper.map(studentDto,Student.class);
        student=studentServiceImp.updateStudentById(student,student_id);
        StudentDto responce=modelMapper.map(student,StudentDto.class);
        return responce;
    }
    @DeleteMapping("/students/{student_id}")
    public void deleteStudentById(@PathVariable("student_id") Integer student_id){
        studentServiceImp.deleteStudentById(student_id);
    }

}

