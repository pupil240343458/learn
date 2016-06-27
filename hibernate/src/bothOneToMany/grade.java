package bothOneToMany;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pupil on 2016/6/13.
 */
public class grade {
    private int id;
    private String name;
//    因为一个年级有多个学生，所以这里用set
    private Set<student> students=new HashSet<student>();

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

    public Set<student> getStudents() {
        return students;
    }

    public void setStudents(Set<student> students) {
        this.students = students;
    }
}
