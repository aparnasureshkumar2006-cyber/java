package RideBookingSystem;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("FunMall","Cab");
        CabRide cab = new CabRide("AZ1",100);
        if (passenger.getRideType()=="Cab"){
            cab.startRide(passenger.getDestination());
        }
        Passenger passenger1 = new Passenger("FunMall","Auto");
        AutoRide auto= new AutoRide("Az1",100);
        if (passenger1.getRideType()=="Auto"){
            auto.startRide(passenger1.getDestination());
        }
    }
}
