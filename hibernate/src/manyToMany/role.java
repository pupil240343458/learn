package manyToMany;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by pupil on 2016/6/16.
 */
public class role {
    private int id;
    private String name;
    private Set<function> functions=new HashSet<function>();

    public Set<function> getFunctions() {
        return functions;
    }

    public void setFunctions(Set<function> functions) {
        this.functions = functions;
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
