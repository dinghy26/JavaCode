
public class BirdAndFlower {

    private String state;



    StateData birdFlower = new StateData();


    public BirdAndFlower() {
        //this("Enter State");
    }



    public BirdAndFlower(String state) {
        this.state = state;

    }

    public String getState() {
        return state;
    }


    public void setState(String state) {
        this.state = state;

    }


    // method calling the state
    public void theState (String state) {
        birdFlower.getStates(state);
    } 

}
