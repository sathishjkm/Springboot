package socialmedia.socialmedia;

public class CustomTeacher {
    private String id;
    private String name;

    public CustomTeacher(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public CustomTeacher(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
