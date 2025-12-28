package DeliverySystem;

/*
* This is my DeliverySystem application
* there are three entities-Sender,ExpressDelivery,StandardDelivery
* for Sender --> packageId,deliveryCharge,deliveryType,weight;
* for ExpressDelivery --> packageId,deliveryCharge
* for StandardDelivery --> packageId,deliveryCharge
* ExpressDelivery,StandardDelivery both perform shipPackage(int kg) and cancelShipment()
* ExpressDelivery can have priorityHandling() method
* StandardDelivery can have combinePackages() method
* */

public class Main {
    public static void main(String[] args){
        SenderInterface sender=new Sender();
        sender.setPackageId(2277);
        sender.setDeliveryCharge(500);
        sender.setDeliveryType("Express");
        sender.setWeight(10);

        ExpressDeliveryInterface express=new ExpressDelivery();
        if (sender.getDeliveryType()=="Express"){
            System.out.println("=====Sender 1:EXPRESS=====");
            express.setPackageId(sender.getPackageId());
            express.shipPackage(5);
            System.out.println("DeliveryCharge:");
            System.out.println(express.getDeliveryCharge());
            express.priorityHandling();
        }
        SenderInterface sender2=new Sender();
        sender2.setPackageId(3344);
        sender2.setDeliveryCharge(500);
        sender2.setDeliveryType("Standard");
        sender2.setWeight(10);

        StandardDeliveryInterface standard=new StandardDelivery();
        if (sender2.getDeliveryType()=="Standard"){
            System.out.println("=====Sender 2:STANDARD=====");
            standard.setPackageId(sender2.getPackageId());
            standard.shipPackage(5);
            System.out.println("DeliveryCharge:");
            System.out.println(standard.getDeliveryCharge());
            standard.combinePackages();
        }
    }
}
