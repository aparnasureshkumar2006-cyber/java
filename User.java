package TicketBookingSystem;

public class User {
    private String ticketId;
    private int price;
    private String ticketType;
    private int seats;

    //user define Constructor
    public User(String ticketId,int price,String ticketType,int seats){
        this.ticketId=ticketId;
        this.price=price;
        this.ticketType=ticketType;
        this.seats=seats;
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
    public String getTicketType() {
        return ticketType;
    }
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
}
