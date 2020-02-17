public class CarOutside {
    private int doors;
    private int wheels;
    private int windows;

    public CarOutside(int doors, int wheels, int windows) {
        this.doors = doors;
        this.wheels = wheels;
        this.windows = windows;
    }

    public void outBuild(String vName) {
        System.out.println("The outside of " + vName + " commence building...");
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public int getWindows() {
        return windows;
    }

    
}