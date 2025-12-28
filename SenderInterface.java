package DeliverySystem;

public interface SenderInterface extends BaseFunctionalitiseInterface{
    public String getDeliveryType();
    public float getWeight();
    public void setDeliveryType(String deliveryType);
    public void setWeight(int weight);
}
