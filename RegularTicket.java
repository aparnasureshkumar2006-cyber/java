package TicketBookingSystem;

public class RegularTicket {
    private String ticketId;
    private int price;
    private User user;

    //user define Constructor...
    public RegularTicket(User user){
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
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void book(){
        this.price=user.getSeats()*200;
        System.out.println("Booking Successfully");
        System.out.println("Price");
        System.out.println(this.getPrice());
    }
    public void cancel(){
        System.out.println("Ticket Cancelled");
    }
    public void includeSnacks(){
        System.out.println("Snacks Included");
    }
}
