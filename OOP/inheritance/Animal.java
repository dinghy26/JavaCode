// this is the super class
public class Animal {
    
    private String name;
    private int brain;
    private int body;
    private  int size;
    private int weight;

    // cunstructor to init. the fields (Variables)
    public Animal(String name, int brain, int body, int size, int weight) {

        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;

    }

    public void eat() {
        System.out.println("animal.eat() called. (Animal class)");

    }

    public void move( int speed) {
        System.out.println("Animal.move called. is moving at " + speed);
        // move method in the super class

    }


    // getter method
    public String getName() {
        return this.name;
    }

    public int getBrain() {
        return this.brain;
    }

    public int getBody() {
        return this.body;
    }

    public int getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }
    
}

    