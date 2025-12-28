package VehicleRent;

public class Customer extends BaseFunctionalitise implements CustomerInterface{
    private String vehicleType;
    private int rentDays;
    public String getVehicleType() {
        return vehicleType;
    }
    public int getRentDays() {
        return rentDays;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }
}
