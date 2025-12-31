package TicketBookingSystem;

public abstract class Ticket {
    private String ticketId;
    private int price;
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
    public void cancel(){
        System.out.println("Ticket Cancelled");
    }
}
