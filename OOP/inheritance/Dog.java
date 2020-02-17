public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, 1, 1, size, weight); // init the fields from the extended class animal

        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
        this. coat = coat;
    }

    private void chew() {
        System.out.println("private dog.chew() called (Dog class)");
    }


    
    @Override //overrides the eat() method of the class we are extendig from.
    public void eat() {
        System.out.println("Dog.eat() called (Dog class)");
        chew();// call the private chew() method in dog class
        super.eat();// call the eat() method in the animal clss
        
    }

    public void walk() {
        System.out.println("Dog.Walk() called (Dog class)");
        move(5);// if is a move method in this class execute move
    }

    public void run() {
        System.out.println("Dog.run() called (Dog class)");
        super.move(10); //super gose back to the class we are extending from
    }

    private void movelegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override // use to override a method from the super class
    public void move (int speed) {
        System.out.println("Dog.move() called");
        movelegs(speed);
        super.move(speed);

    }

    

}