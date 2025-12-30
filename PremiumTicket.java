package TicketBookingSystem;

public class PremiumTicket {
    private String ticketId;
    private int price;
    private User user;

    //user define Constructor...
    public PremiumTicket(User user){
        this.user=user;
        this.ticketId=user.getTicketId();
        this.price=user.getPrice();
    }
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void book(){
        this.price=user.getSeats()*400;
        System.out.println("Booking Successfully");
        System.out.println("Price");
        System.out.println(this.getPrice());
    }
    public void cancel(){
        System.out.println("Ticket Cancelled");
    }
    public void reclinerSeat(){
        System.out.println("Recliner Seat Enabled");
    }
}
