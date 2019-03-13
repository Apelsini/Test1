package class15patterns;


import java.util.List;

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

        Animal huskee = new Animal("Huskee Bob", Animal.Type.DOG, userParent);
        Animal spaniel = new Animal("Spaniel John", Animal.Type.DOG, userParent);
        Animal whitecat = new Animal("Cat Showball", Animal.Type.CAT, userChildren);
        List<Animal> animals = asList(huskee, whitecat);

        AnimalManager animalManager = new AnimalManager(animals);

        animalManager.doOnEach(new SitDownCommand());
        animalManager.doOnEach(new layDownCommand());
        animalManager.doOnEach(new VoiceCommand());

        new UserRelativesFacade().printRelativesByAnimal(userChildren,huskee);


    }
}
