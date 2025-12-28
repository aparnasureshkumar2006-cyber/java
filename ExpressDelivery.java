package DeliverySystem;

public class ExpressDelivery extends Delivery implements ExpressDeliveryInterface{
    public void priorityHandling(){
        System.out.println("Priority Handling Enabled");
    }
}
