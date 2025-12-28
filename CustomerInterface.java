package VehicleRent;

public interface CustomerInterface extends BaseFunctionalitiseInterface{
    public String getVehicleType();
    public int getRentDays();
    public void setVehicleType(String vehicleType);
    public void setRentDays(int rentDays);
}
