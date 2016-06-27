package manyToMany;

/**
 * Created by pupil on 2016/6/16.
 */
public class function {
    private int id;
    private String name;
    private String power;

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

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public function() {
    }

    public function(String name, String power) {
        this.name = name;
        this.power = power;
    }
}
