package class15patterns;

import java.util.List;

/**
 * Created by user on 13.03.2019.
 */
public class AnimalManager {
    private final List<Animal> animals;

    public AnimalManager(List<Animal> animals) {
        this.animals = animals;
    }

    public void doOnEach(Command command) {
        for (Animal animal : animals) {
            command.execute(animal);
        }
    }
}
