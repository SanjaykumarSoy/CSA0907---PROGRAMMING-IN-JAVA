public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.display();
        System.out.println();
        Vehicle v2 = new Vehicle("Toyota", "Camry");
        v2.display();
        System.out.println();
        ElectricVehicle ev = new ElectricVehicle(
            "Tesla", "Model 3", 60, 1.5
        );
        ev.displayElectric();
    }
}
class Vehicle {
    String brand;
    String model;
    Vehicle() {
        brand = "";
        model = "";
    }
    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
    }
}
class ElectricVehicle extends Vehicle {
    double batteryCapacity;
    double chargingTime;
    ElectricVehicle(String brand, String model,
                    double batteryCapacity, double chargingTime) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
    void displayElectric() {
        display();
        System.out.println("Battery Capacity : " + batteryCapacity + " kWh");
        System.out.println("Charging Time    : " + chargingTime + " hours");
    }
}
