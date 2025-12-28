package DeliverySystem;

public abstract class Delivery extends BaseFunctionalitise implements DeliveryInterface{
    public void shipPackage(int kg){
        int dc=kg*100;
        this.setDeliveryCharge(dc);
        System.out.println("Package Shipped");
    }
    public void cancelShipment(int kg){
        int dc=kg-100;
        this.setDeliveryCharge(dc);
        System.out.println("Shipment Cancel");
    }
}
