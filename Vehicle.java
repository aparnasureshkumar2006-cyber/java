package VehicleRent;

public abstract class Vehicle extends BaseFunctionalitise implements VehicleInterface{
    public void book(int days){
        int ret=this.getRent()*days;
        this.setRent(ret);
        System.out.println("Booking Successfully");
    }
    public void cancel(int days){
        int ret=this.getRent()-days;
        this.setRent(ret);
        System.out.println("Canceled Successfully");
    }
}
