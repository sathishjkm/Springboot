package socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacher(int teacher_id) {
        return teacherRepository.findById(teacher_id);
    }

    public Teacher updateTeacher(Teacher teacher, int teacher_id) {
        teacher.setId(teacher_id);
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(int teacher_id) {
        teacherRepository.deleteById(teacher_id);
    }
}

//    public List<Teacher> addTeachRequst(String[] teacher_id) {
//        List<Teacher> new_teacher = new ArrayList<>();
//        for (Teacher teacher : teachers) {
//            for (int i = 0; i < teacher_id.length; i++) {
//                if (teacher.getId().equals(teacher_id[i])) {
//                    new_teacher.add(teacher);
//                    break;
//                }
//            }
//        }
//        return new_teacher;
//    }
//    public List<CustomTeacher>addcustomTeacher(String[] teacher_id){
//        List<CustomTeacher> new_customTeacher=new ArrayList<>();
//        for (Teacher teacher:teachers){
//            for (int i=0;i<teacher_id.length;i++){
//                if (teacher.getId().equals(teacher_id[i])){
//                    CustomTeacher customTeacher=new CustomTeacher(teacher.getId(),teacher.getName());
//                    new_customTeacher.add(customTeacher);
//                }
//            }
//        }
//        return new_customTeacher;
//    }
//    public List<Teacher> addTechName(String[] teacher_name) {
//        List<Teacher> new_teacher_name= new ArrayList<>();
//        for (Teacher teacher : teachers) {
//            for (int i = 0; i < teacher_name.length; i++) {
//                if (teacher.getName().equals(teacher_name[i])) {
//                    new_teacher_name.add(teacher);
//                    break;
//                }
//            }
//        }
//        return new_teacher_name;
//    }
//    public void addStudentTeacher(StudentTeacher teacherlist){
//        studentTeachers.add(teacherlist);
//    }
//}
