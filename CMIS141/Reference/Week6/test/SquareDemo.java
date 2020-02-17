public class SquareDemo {
    
    private double sides;
    private static int squareDemos = 0;

    public SquareDemo() {
        this(1.0);
        squareDemos++;
    }

    public SquareDemo(double sides) {
        this.sides = sides;
        squareDemos++;
    }

    public double getArea() {
        double area = Math.pow(sides, 2);
        return area;
    }

    public double getPerimeter() {
        double perimeter = sides * 4;
        return perimeter;
    }


    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    
    public static int getSquareDemos() {
        return squareDemos;
    }

    public static void setSquareDemos(int squareDemos) {
        SquareDemo.squareDemos = squareDemos;
    }

    

}