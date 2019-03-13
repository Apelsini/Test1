package class15patterns;

import java.util.List;

/**
 * Created by user on 13.03.2019.
 */
public class UserBuilder {
    private String name;
    private Integer age;
    private List<User> relatives;

    public UserBuilder(String name, Integer age, List<User> relatives) {
        this.name = name;
        this.age = age;
        this.relatives = relatives;
    }

    public UserBuilder name(String name){
        this.name=name;
        return this;
    }

    public UserBuilder age(Integer age){
        this.age=age;
        return this;
    }
    public UserBuilder relatives(List<User> relatives){
        this.relatives=relatives;
        return this;
    }

    public User build() {
        return new User(name, age, relatives);
    }
}
