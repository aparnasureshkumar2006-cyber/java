package RideBookingSystem;

public class CabRide {
    private String destination;
    private String rideId;
    private int fare;
    public CabRide(String rideId,int fare){
        this.rideId=rideId;
        this.fare=fare;
    }
    public CabRide(){
        this.destination=null;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getRideId() {
        return rideId;
    }

    public void setRideId(String rideId) {
        this.rideId = rideId;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
    public void startRide(String destination){
        this.fare=100;
        System.out.println("Ride Started");
        System.out.println(this.fare);
    }
}
