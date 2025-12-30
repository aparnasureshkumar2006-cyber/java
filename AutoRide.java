package RideBookingSystem;

public class AutoRide {
    private String destination;
    private String rideId;
    private int fare;
    public AutoRide(String rideId,int fare){
        this.rideId=rideId;
        this.fare=fare;
    }
    public AutoRide(){
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
        this.fare=200;
        System.out.println("Ride Started");
        System.out.println(this.fare);
    }
}
