package class15patterns;


import static java.util.Arrays.asList;

/**
 * Created by user on 13.03.2019.
 */
public class PatternsMain {
    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder();
        User userParent = userBuilder
                .name("Avraam")
                .age(40)
                .relatives(null)
                .build();
        User userChildren = userBuilder
                .name("Isaac")
                .age(16)
                .relatives(asList(userParent))
                .build();
        System.out.println(userParent.getName()+" "+userParent.getAge());
    }
}
