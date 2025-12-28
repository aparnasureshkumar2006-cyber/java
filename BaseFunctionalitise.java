package VehicleRent;

public abstract class BaseFunctionalitise implements BaseFunctionalitiseInterface{
    private int vehicleNo;
    private int rent;
    public int getVehicleNo() {
        return vehicleNo;
    }
    public int getRent() {
        return rent;
    }
    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
    public void setRent(int rent) {
        this.rent = rent;
    }
}
