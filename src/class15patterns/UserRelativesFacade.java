package class15patterns;

import java.util.List;

/**
 * Created by user on 13.03.2019.
 */
public class UserRelativesFacade {
//    private ConsoleOrFile consoleOrFile;

    //    enum ConsoleOrFile {
//        CONSOLE, FILE;
//    }
    public UserRelativesFacade() {
    }
    private final static UserRelativesFacade facade = new UserRelativesFacade();

    public static UserRelativesFacade getInstance(){
        return facade;
    }

    public void printRelativesByAnimal(User user, Animal animal) {
        List<User> relatives = user.getRelatives();
        for (User relative : relatives) {
            if (relative == animal.getOwner()) {
                System.out.println(relative.getName() + " owns " + animal.getName());
            }
        }
    }

//    public void printAllParentsWithAnimals() {
//        for (User user : users) {
//            printOneParentsWithAnimals(user);
//        }
//    }
//
//    public void printOneParentsWithAnimals(User user) {
//        List<User> relatives = user.getRelatives();
//        for (User relative: relatives)
//        {
//         for (Animal animal: this.animals) {
//             if (animal.getOwner()=relative) {
//                 System.out.println(relative.getName()+" owns "+animal.getName());
//             }
//         }
//        }
//
//    }
}
