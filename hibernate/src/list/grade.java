package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pupil on 2016/6/13.
 */
public class grade {
    private int id;
    private String name;
//    因为一个年级有多个学生，所以这里用set
    private List<student> students=new ArrayList<student>();

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

    public List<student> getStudents() {
        return students;
    }

    public void setStudents(List<student> students) {
        this.students = students;
    }
}
