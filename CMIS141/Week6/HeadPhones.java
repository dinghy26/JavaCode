import java.awt.Color;

public class HeadPhones {

    //Static headphone volume
    static final int LOW = 1;
    static final int MEDIUM = 2;
    static final int HIGH = 3;

    private int volume;
    private boolean pluggedIn;
    private String manufacture;
    private Color headPhoneColor;

    // Cunstructor with out values set the default values. 
    public HeadPhones() {
        this(MEDIUM, false, "Product Manufacture", Color.BLACK);
    }

    public HeadPhones(String manufacture, Color headPhoneColor) {
        this(HIGH, true, manufacture, headPhoneColor);
    }

    public HeadPhones(int volume, boolean pluggedIn, String manufacture, Color headPhoneColor) {
        this.volume = volume;
        this.pluggedIn = pluggedIn;
        this.manufacture = manufacture;
        this.headPhoneColor = headPhoneColor;
    }
    
    // Headphones Methods
    public String toString() {

        return "Volume = " + getVolume() + "\n" + "pluggedIn = " + isPluggedIn() + "\n" 
        + "Manufacture = " + getManufacture() + "\n" + "HeadPhoneColor = " + getRGBColor()
        + " (" + getHeadPhoneColor() + ")";
    }

    public String getRGBColor() {
        if(this.headPhoneColor == Color.BLACK) {
            return "Black";
        } else if (this.headPhoneColor == Color.WHITE) {
            return "White";
        } else if (this.headPhoneColor == Color.RED) {
            return "Red";
        } else {
            return "Unknown";
        }
    }

    public String testPluggedIn() {
        if(this.pluggedIn == true) {
            return "The headphones are Plugged-in";
        } else {
            return "The headphones are NOT Plugged-in";
        }
    }

    public void changeVolume(int Vol) {
        this.volume = Vol;
    }
    
    // Getters and Setters
    public static int getLow() {
        return LOW;
    }

    public static int getMedium() {
        return MEDIUM;
    }

    public static int getHigh() {
        return HIGH;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPluggedIn() {
        return pluggedIn;
    }

    public void setPluggedIn(boolean pluggedIn) {
        this.pluggedIn = pluggedIn;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Color getHeadPhoneColor() {
        return headPhoneColor;
    }

    public void setHeadPhoneColor(Color headPhoneColor) {
        this.headPhoneColor = headPhoneColor;
    }


    
}