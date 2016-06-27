package manyToOne;

/**
 * Created by pupil on 2016/6/13.
 */
public class student {
    private String name;
    private int age;
    private int id;
    private grade grade;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public manyToOne.grade getGrade() {
        return grade;
    }

    public void setGrade(manyToOne.grade grade) {
        this.grade = grade;
    }

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
}
