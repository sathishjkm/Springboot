package socialmedia.socialmedia;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeacherController {
    List<Teacher>teachers=new ArrayList<>();

    @RequestMapping(method = RequestMethod.POST,value = "/teacher")
    public void addTeacher(@RequestBody Teacher teacher){
        teachers.add(teacher);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/teacher")
    public List<Teacher>getTeachers(){
        return teachers;
    }
    @RequestMapping(method = RequestMethod.GET,value = "/teacher/{teacher_id}")
    public Teacher getTeacher(@PathVariable("teacher_id")String teacher_id){
        Teacher responce=null;
        for (Teacher teacher:teachers){
            if (teacher.getId().equals(teacher_id)){
                responce=teacher;
                break;
            }
        }
        return responce;
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/teacher/{teacher_id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher,@PathVariable("teacher_id")String teacher_id){
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
    @RequestMapping(method = RequestMethod.DELETE,value = "/teacher/{teacher_id}")
    public void deleteTeacher(@PathVariable("teacher_id")String teacher_id){
        List<Teacher>new_teacher_list=new ArrayList<>();
        for (Teacher teacher:teachers){
            if (!teacher.getId().equals(teacher_id)){
                new_teacher_list.add(teacher);
            }
        }
        teachers=new_teacher_list;
    }
}
