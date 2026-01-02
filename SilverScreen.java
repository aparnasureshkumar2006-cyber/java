package MovieTicketSystem;

public class SilverScreen {
    private String bookingId;
    private int ticketPrice;
    private int snackPrice;
    private int totalBill;
    private Viewer viewer;

    public SilverScreen(String bookingId,int ticketPrice,int snackPrice,int totalBill,Viewer viewer){
        this.bookingId=bookingId;
        this.ticketPrice=ticketPrice;
        this.snackPrice=snackPrice;
        this.totalBill=totalBill;
        this.viewer=viewer;
    }
    public SilverScreen() {

    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getSnackPrice() {
        return snackPrice;
    }

    public void setSnackPrice(int snackPrice) {
        this.snackPrice = snackPrice;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }
    public void calculateTicketPrice(){
        this.setTicketPrice(this.viewer.getNumberOfSeats()*200);
        System.out.println("Ticket Price:"+this.getTicketPrice());
    }
    public void calculateSnackPrice(){
        if(this.viewer.getWantsSnacks().equals("YES")){
            this.setSnackPrice(this.viewer.getSnackQuantity()*80);
            System.out.println("Snack Price:"+getSnackPrice());
        }
        else{
            this.setSnackPrice(0);
            System.out.println("Snack Price:"+getSnackPrice());
        }
    }
    public void generateBill(){
        this.setTotalBill(this.ticketPrice+this.snackPrice+50);
        System.out.println("Total Bill:"+getTotalBill());
    }
    public void applyDiscount(){
        if(this.viewer.getNumberOfSeats()>=4){
            int discountAmount=this.totalBill*10/100;
            System.out.println("Discount Applied:"+discountAmount);
        }
        else{
            System.out.println("No discount");
        }
    }
}
