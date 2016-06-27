package map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pupil on 2016/6/13.
 */
public class grade {
    private int id;
    private String name;
//    因为一个年级有多个学生，所以这里用set
    private Map<String,student> students=new HashMap<String,student>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, student> getStudents() {
        return students;
    }

    public void setStudents(Map<String, student> students) {
        this.students = students;
    }
}
