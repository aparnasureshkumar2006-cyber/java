package DeliverySystem;

public class BaseFunctionalitise implements BaseFunctionalitiseInterface{
    private int packageId;
    private int deliveryCharge;
    public int getPackageId() {
        return packageId;
    }
    public int getDeliveryCharge() {
        return deliveryCharge;
    }
    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }
    public void setDeliveryCharge(int deliveryCharge) {
        this.deliveryCharge = deliveryCharge;
    }
}
