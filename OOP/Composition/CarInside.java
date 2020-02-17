public class CarInside {

    private int seats;
    private int speakers;
    private int vents;

    public CarInside(int seats, int speakers, int vents) {
        this.seats = seats;
        this.speakers = speakers;
        this.vents = vents;
    }

    public void inBuild(String vName) {
        System.out.println("The inside of " + vName + " commence building...");
    }

    public int getSeats() {
        return seats;
    }

    public int getSpeakers() {
        return speakers;
    }

    public int getVents() {
        return vents;
    }   

    
}