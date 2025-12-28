package DeliverySystem;

public class Sender extends BaseFunctionalitise implements SenderInterface {
    private String deliveryType;
    private int weight;
    public String getDeliveryType() {
        return deliveryType;
    }
    public float getWeight() {
        return weight;
    }
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
