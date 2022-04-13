package socialmedia.socialmedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @PostMapping("/teacher")
//    @RequestMapping(method = RequestMethod.POST, value = "/teacher")
    public void addTeacher(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
    }
    @RequestMapping(method = RequestMethod.GET, value = "/teacher")
    public List<Teacher> getTeachers() {
        return teacherService.getTeachers();
    }
    @RequestMapping(method = RequestMethod.GET, value = "/teacher/{teacher_id}")
    public Teacher getTeacher(@PathVariable("teacher_id") String teacher_id) {
        return teacherService.getTeacher(teacher_id);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/teacher/{teacher_id}")
    public Teacher updateTeacher(@RequestBody Teacher teacher, @PathVariable("teacher_id") String teacher_id) {
        return teacherService.updateTeacher(teacher, teacher_id);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/teacher/{teacher_id}")
    public void deleteTeacher(@PathVariable("teacher_id") String teacher_id) {
        teacherService.deleteTeacher(teacher_id);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/teacher_ids")
    public List<Teacher> addTeachRequst(@RequestBody TeacherIdRequest  techid){
        return teacherService.addTeachRequst(techid.getIds());
    }
    @RequestMapping(method = RequestMethod.POST,value = "/customTeacher")
    public List<CustomTeacher>addcustomTeacher(@RequestBody TeacherIdRequest techid){
        return teacherService.addcustomTeacher(techid.getIds());
    }
    @RequestMapping(method = RequestMethod.POST,value = "/teacher_name")
    public List<Teacher> addTeachname(@RequestBody TeacherNameRequst  teacher_name){
        return teacherService.addTeachRequst(teacher_name.getNames());
    }
}

