public class Main {
    public static void main(String[] args) {
        
        Vehicle jeep1 = new Vehicle("Jeep", "Wrangler");
        CarOutside jeepOut = new CarOutside(2,5,4);
        CarInside jeepInsides = new CarInside(4, 6, 8);

        Jeep theJeep = new Jeep(jeep1, jeepInsides, jeepOut);
        theJeep.getOutside().outBuild(theJeep.getVehicle().getMake());
       System.out.println("These " + theJeep.getVehicle().getModel() +  " has " + theJeep.getOutside().getDoors() + " Doors");

       theJeep.buildV();
    }
}