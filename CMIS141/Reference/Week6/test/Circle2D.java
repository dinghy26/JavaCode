public class Circle2D {

    private double xCenter;
    private double yCenter;
    private double radius;
    private static int numCircles;

    public Circle2D() {
        this(0.0, 0.0, 1.0);
        numCircles++;
    }

    public Circle2D(double radius) {
        this(0.0, 0.0,radius);
        numCircles++;
    }

    public Circle2D(double xCenter, double yCenter) {
        this(xCenter,yCenter,1.0);
        numCircles++;
    }

    public Circle2D (double xCenter, double yCenter, double radius) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.radius = radius;
        numCircles++;
    }

    public double getArea () {
        double area = (radius * radius) * Math.PI;
        return area;
    }

    public double getCircumference () {
        double circumference = 2.0*Math.PI*radius;
        return circumference;
    }

    public double getxCenter() {
        return xCenter;
    }

    public void setxCenter(double xCenter) {
        this.xCenter = xCenter;
    }

    public double getyCenter() {
        return yCenter;
    }

    public void setyCenter(double yCenter) {
        this.yCenter = yCenter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getNumCircles() {
        return numCircles;
    }


    

    



}