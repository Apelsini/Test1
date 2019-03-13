package class15patterns;

/**
 * Created by user on 13.03.2019.
 */
public class layDownCommand implements Command {
    @Override
    public void execute(Animal animal) {
        animal.layDown();
    }
}
