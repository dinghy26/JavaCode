

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Setter Method
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknow";
        }
    }

    // Getter Method
    public String getModel() {
        return this.model;
    }

}
