

public class TestSquareDemo {

    public static void main(String[] args) {
    
        SquareDemo square1 = new SquareDemo(5);
        System.out.println(" the square of square1 is " + square1.getArea());
        System.out.println("The Perimeter od square1 is " + square1.getPerimeter());
        System.out.println("This is instance " + SquareDemo.getSquareDemos());

        SquareDemo square2 = new SquareDemo();
        square2.setSides(6);
        System.out.println(" the square of square2 is " + square2.getArea());
        System.out.println("The Perimeter od square2 is " + square2.getPerimeter());
        System.out.println("This is instance " + SquareDemo.getSquareDemos());
        

        
    }
}