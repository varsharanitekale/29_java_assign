class Vehicle {
    String model;
    int price;
    int wheeler;

    Vehicle()
    {
        this.model="default-name";
        this.wheeler=4;
        this.price=120000;
        System.out.println(this.model);
        System.out.println(this.wheeler);
        System.out.println(this.price);
    }


    Vehicle(String model, int wheeler, int price)
    {
        this.model= model;
        this.wheeler= wheeler;
        this.price=price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWheeler(int wheeler) {
        this.wheeler = wheeler;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public int getWheeler() {
        return wheeler;
    }

    public int getPrice() {
        return price;
    }

}
public class vehicleassignment {
    public static void main(String[] args)
    {
        System.out.println("BIKE");
        Vehicle bike  = new Vehicle();
        bike.setModel("Pulsar");
        bike.setWheeler(2);
        System.out.println(bike.getModel());
        System.out.println(bike.getWheeler());
        System.out.println(bike.getPrice());

        System.out.println("CAR");
        Vehicle car  = new Vehicle();
        car.setModel("Audi");
        car.setWheeler(4);
        System.out.println(car.getModel());
        System.out.println(car.getWheeler());
        System.out.println(car.getPrice());

        System.out.println("TRUCK");
        Vehicle truck  = new Vehicle();
        truck.setModel("TATA");
        truck.setWheeler(8);
        System.out.println(truck.getModel());
        System.out.println(truck.getWheeler());
        System.out.println(truck.getPrice());
    }
}
