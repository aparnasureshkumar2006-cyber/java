package VehicleRent;

public class Main {
    public static void main(String[] args) {
        CustomerInterface customer = new Customer();
        customer.setVehicleNo(6677);
        customer.setRent(100);
        customer.setVehicleType("Bike");
        customer.setRentDays(3);

        BikeInterface bike=new Bike();
        if (customer.getVehicleType() == "Bike") {
            System.out.println("=====CUSTOMER1:BIKE=====");
            bike.setVehicleNo(customer.getVehicleNo());
            bike.setRent(customer.getRent());
            bike.book(3);
            System.out.println("Rent Days:");
            System.out.println(customer.getRentDays());
            System.out.println("Rent:");
            System.out.println(bike.getRent());
            bike.helmetIncluded();
        }
        CustomerInterface customer2 = new Customer();
        customer2.setVehicleNo(2244);
        customer2.setRent(200);
        customer2.setVehicleType("Car");
        customer2.setRentDays(5);

        CarInterface car=new Car();
        if (customer2.getVehicleType() == "Car"){
            System.out.println("=====CUSTOMER2:BIKE=====");
            car.setVehicleNo(customer2.getVehicleNo());
            car.setRent(customer2.getRent());
            car.book(3);
            System.out.println("Rent Days:");
            System.out.println(customer2.getRentDays());
            System.out.println("Rent:");
            System.out.println(car.getRent());
            car.driverIncluded();
        }
    }
}
