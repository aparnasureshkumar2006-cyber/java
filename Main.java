package TicketBookingSystem;

public class Main {
    public static void main(String[] args){
        User user=new User("AZ12",100,"Regular",3);

        if (user.getTicketType()=="Regular") {
            RegularTicket rt = new RegularTicket(user);
            System.out.println("=====USER1:REGULAR=====");
            rt.book();
            rt.includeSnacks();
        }

        User user2=new User("AZ12",100,"Premium",2);

        if (user2.getTicketType()=="Premium") {
            PremiumTicket pt = new PremiumTicket(user2);
            System.out.println("=====USER2:PREMIUM=====");
            pt.book();
            pt.reclinerSeat();
        }
    }
}
