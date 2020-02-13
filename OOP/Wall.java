public class Wall {

    private double width;
    private double height;

    public Wall() {
        System.out.println("Empty Cunstructor");
    }

    public Wall(double ancho, double alto) {
            this.width = ancho;
            this.height = alto;
    }

    public double getWidth() {

        if (this.width < 0) {
            this.width = 0;
        }
        return this.width;
    }

    public void setWidth (double w) {
        this.width = w;
    }

    public double getHeight() {

        if(this.height < 0) {
            this.height = 0;
        }
        return this.height;
    }

    public void setHeight(double h) {
        this.height = h;

    }




}