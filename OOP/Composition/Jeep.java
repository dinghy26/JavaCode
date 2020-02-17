public class Jeep {
    private Vehicle vehicle;
    private CarInside inside;
    private CarOutside outside;

    public Jeep(Vehicle vehicle, CarInside inside, CarOutside outside) {
        this.vehicle = vehicle;
        this.inside = inside;
        this.outside = outside;
    }

    public void buildV() {
        inside.inBuild(vehicle.getMake());
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public CarInside getInside() {
        return inside;
    }

    public CarOutside getOutside() {
        return outside;
    }
    
}