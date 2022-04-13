package socialmedia.socialmedia;


public class TeacherIdRequest {
    public String[] ids;
    public TeacherIdRequest(String[] id) {
        this.ids = id;
    }
    public TeacherIdRequest(){}

    public String[] getIds() {
        return ids;
    }
    public void setIds(String[] ids) {
        this.ids = ids;
    }
}


