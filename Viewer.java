package MovieTicketSystem;

public class Viewer {
    private int numberOfSeats;
    private String screenType;
    private String wantsSnacks;
    private int snackQuantity;
    private GoldScreen goldScreen;
    private SilverScreen silverScreen;

    public Viewer(){

    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    public String getScreenType() {
        return screenType;
    }
    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }
    public String getWantsSnacks() {
        return wantsSnacks;
    }
    public void setWantsSnacks(String wantsSnacks) {
        this.wantsSnacks = wantsSnacks;
    }
    public int getSnackQuantity() {
        return snackQuantity;
    }
    public void setSnackQuantity(int snackQuantity) {
        this.snackQuantity = snackQuantity;
    }

    public GoldScreen getGoldScreen() {
        return goldScreen;
    }

    public void setGoldScreen(GoldScreen goldScreen) {
        this.goldScreen = goldScreen;
    }

    public SilverScreen getSilverScreen() {
        return silverScreen;
    }

    public void setSilverScreen(SilverScreen silverScreen) {
        this.silverScreen = silverScreen;
    }
}
