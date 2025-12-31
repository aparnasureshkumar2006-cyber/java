package TicketBookingSystem;

public class PremiumTicket extends Ticket{

    private User user;

    //user define Constructor...
    public PremiumTicket(User user){
        this.user=user;
        this.setTicketId(user.getTicketId());
        this.setPrice(user.getPrice());
    }

    public void book(){
        this.setPrice(user.getSeats()*400);
        System.out.println("Booking Successfully");
        System.out.println("Price");
        System.out.println(this.getPrice());
    }
    public void cancel(){
        System.out.println("Ticket Cancelled");
    }
    public void reclinerSeat() {
        System.out.println("Recliner Seat Enabled");
    }
}
