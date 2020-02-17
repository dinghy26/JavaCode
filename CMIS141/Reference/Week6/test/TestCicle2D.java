

public class TestCicle2D {

    public static void main(String[] args) {
        
        Circle2D [] cArray = new Circle2D[5];

        
        cArray[0] = new Circle2D();
        cArray[1] = new Circle2D(6);
        cArray[2] = new Circle2D(2.0,4.0);
        cArray[3] = new Circle2D(10.0,20.0,25.0);
        cArray[4] = new Circle2D(2.0,4.0,5.0);


        for (int i = 0; i < cArray.length; i++) {
            System.out.format("xCenter = %.2f , yCenter = %.2f, Radius = %.2f\n",
            cArray[i].getxCenter(), cArray[i].getyCenter(), cArray[i].getRadius());

            System.out.format("The area of circle # %d = %.2f\n", i+1, cArray[i].getArea());
            System.out.format("The Circumference of circle # %d = %.2f\n", i+1, cArray[i].getCircumference());

        }


    }


}