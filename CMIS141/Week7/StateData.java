
public class StateData {
    private String[] arg = new String[51];

    private String state;
    private String bird;
    private String flower;

    private String[][] data = { 
        { "ALABAMA", "Yellowhammer", "Camellia" },
        { "ALASKA", "Willow Ptarmigan", "Forget Me Not" }, 
        { "ARIZONA", "Cactus Wren", "Saguaro cactus blossom" },
        { "ARKANSAS", "Mockingbird", "Apple blossom" }, 
        { "CALIFORNIA", "California Valley Quail", "Golden poppy" },
        { "COLORADO", "Lark Bunting", "Rocky Mountain columbine" }, 
        { "CONNECTICUT", "Robin", "Mountain laurel" },
        { "DELAWARE", "Blue Hen Chicken", "Peach blossom" }, 
        { "FLORIDA", "Mockingbird", "Orange blossom" },
        { "GEORGIA", "Brown Thrasher", "Cherokee rose" }, 
        { "HAWAII", "Nene", "Hibiscus" },
        { "IDAHO", "Mountain Bluebird", "Syringa" }, 
        { "ILLINOIS", "Cardinal", "Violet" },
        { "INDIANA", "Cardinal", "Peony" }, 
        { "IOWA", "Eastern Goldfinch", "Wild rose" },
        { "KANSAS", "Western Meadowlark", "Sunflower" }, 
        { "KENTUCKY", "Cardinal", "Goldenrod" },
        { "LOUISIANA", "Eastern Brown Pelican", "Magnolia" },
        { "MAINE", "Chickadee", "White pine cone and tassel" },
        { "MARYLAND", "Baltimore Oriole", "Black-eyed susan" }, 
        { "MASSACHUSETTS", "Chickadee", "Mayflower" },
        { "MICHIGAN", "American Robin", "Apple blossom" }, 
        { "MINNESOTA", "Common Loon", "Lady slipper" },
        { "MISSISSIPPI", "Mockingbird", "Bloom of the magnolia or evergreen magnolia" },
        { "MISSOURI", "Bluebird", "Hawthorn" }, 
        { "MONTANA", "Western Meadowlark", "Bitterroot" },
        { "NEBRASKA", "Goldenroad", "Western meadowlark"},
        { "NEVADA", "Sagebrush", "Mountain BlueBird"},
        { "NEW HAMPSHIRE", "Purple Lilac", "Purple Finch"},
        { "NEW JERSEY", "Purple Violet", "Eastern Goldfinch"},
        { "NEW MEXICO", "Yucca", "Roadrunner"},
        { "NEW YORK", "Rose", "Bluebird"},
        { "NORTH CAROLINA", "Dogwood", "Cardinal"},
        { "NORTH DAKOTA", "Wild praire rose", "Western Meadowlark"},
        { "OHIO", "Scarlet Carnation", "Cardinal"},
        { "OKLAHOMA", "Mistletoe", "Scissor-Tailed Flycatcher"},
        { "OREGON", "Oregon Grape", "Western Meadowlark"},
        { "PENNSYLVANIA", "Moutain Laurel", "Ruffed Grouse"},
        { "RHODE ISLAND", "Violet", "Rhode Island Red"},
        { "SOUTH CAROLINA", "Yellow Jessamine", "Great Carolina Wren"},
        { "SOUTH DAKOTA", "Pasque Flower", "Ring-necked"},
        { "TENNESSEE", "Purple iris", "Mockingbird"},
        { "TEXAS", "Texas Blue Bonnet", "Mockingbird"},
        { "UTAH", "Sego Lily", "American Seagull"},
        { "VERMONT", "Red Clover", "Hermit Thrush"},
        { "VIRGINIA", "Dogwood", "Cardinal"},
        { "WASHINGTON", "Wstern Rhododendron", "Willow Goldfinch"},
        { "WEST VIRGINIA", "Rhododendron", "Cardinal"},
        { "WISCONSIN", "Wood Violet", "Robin"},
        { "WYOMING", "Indian Paint Brush", "Western Meadowlark"},

    };

    public StateData() {

    }

    public StateData(String state, String bird, String flower, String[][] data) {
        this.state = state;
        this.bird = bird;
        this.flower = flower;
        this.data = data;
    }

    public StateData(String[][] data) {
        this.data = data;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public void getStates(String state) {

        for (int i = 0; i < data.length; i++) {
            if (state.equals(data[i][0])) {
                System.out.println("State: " + data[i][0]);
                setState(data[i][0]);
                System.out.println("Bird: " + data[i][1]);
                setBird(data[i][1]);
                System.out.println("Flower: " + data[i][2]);
                setFlower(data[i][2]);

                arg[i] = getState() + ", " + getBird() + ", " + getFlower();
            }

        }

    }

    // for test the array
    public void getArg() {
        for (int i = 0; i < arg.length; i++) {
            System.out.println(arg[i]);
        }
    }

    public void getset() {
        for (int i = 0; i < arg.length; i++) {
            if (arg[i] != null) {
                System.out.println(arg[i]);
            }
        }
    }

    public String toString() {

        return "(" + getState() + "," + getBird() + "," + getFlower() + ")";
    }

}
