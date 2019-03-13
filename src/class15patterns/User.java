package class15patterns;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by user on 13.03.2019.
 */
public class User {
    private String name;
    private Integer age;
    private List<User> relatives;

    public User(String name, Integer age, List<User> relatives) {
        this.name = name;
        this.age = age;
        this.relatives = relatives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<User> getRelatives() {
        return relatives;
    }

    public void setRelatives(List<User> relatives) {
        this.relatives = relatives;
    }



}



