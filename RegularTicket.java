package TicketBookingSystem;

public class RegularTicket extends Ticket{

    private User user;

    //user define Constructor...
    public RegularTicket(User user){
        this.user=user;
        this.setTicketId(user.getTicketId());
        this.setPrice(user.getPrice());
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public void book(){
        this.setPrice(user.getSeats()*200);
        System.out.println("Booking Successfully");
        System.out.println("Price");
        System.out.println(this.getPrice());
    }
    public void includeSnacks(){
        System.out.println("Snacks Included");
    }
}
