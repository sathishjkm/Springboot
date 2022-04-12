package socialmedia.socialmedia;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    List<Teacher> teachers=new ArrayList<>();
    public void addTeacher( Teacher teacher) {
        teachers.add(teacher);
    }
    public List<Teacher>getTeachers() {
        return teachers;
    }
    public Teacher getTeacher(String teacher_id){
        Teacher responce=null;
        for (Teacher teacher:teachers){
            if (teacher.getId().equals(teacher_id)){
                responce=teacher;
                break;
            }
        }
        return responce;
    }
    public Teacher updateTeacher(Teacher teacher,String teacher_id){
        Teacher responce=null;
        for (Teacher teacher_obj:teachers){
            if (teacher_obj.getId().equals(teacher_id)){
                teacher_obj.setName(teacher.getName());
                teacher_obj.setSubject(teacher.getSubject());
                responce=teacher_obj;
                break;
            }
        }
        return responce;
    }
    public void deleteTeacher(String teacher_id){
        List<Teacher>new_teacher_list=new ArrayList<>();
        for (Teacher teacher:teachers){
            if (!teacher.getId().equals(teacher_id)){
                new_teacher_list.add(teacher);
            }
        }
        teachers=new_teacher_list;
    }
}
