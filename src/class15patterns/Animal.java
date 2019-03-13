package class15patterns;

/**
 * Created by user on 13.03.2019.
 */
public class Animal {

    public Animal(String name, Type type, User owner) {
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    private String name;
    private Type type;
     private User owner;

    enum Type {
        DOG, CAT
    }



    public void sitDown() {
        System.out.println(this.name+" sit down");
    }

    public void layDown() {
        System.out.println(this.name+" lay down");
    }

    public void Voice() {
        if (this.type==Type.CAT){
            System.out.println(this.name+" meow meow");
        }
        if (this.type==Type.DOG){
            System.out.println(this.name+" woff! woff!");
        }

    }
}
