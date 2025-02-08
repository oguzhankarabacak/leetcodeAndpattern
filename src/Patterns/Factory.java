package Patterns;

interface Vehicle{
    void drive();
}

class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

class Truck implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Truck is driving");
    }
}

abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}

class TruckFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Truck();
    }
}

public class Factory {

    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();

        Vehicle car = carFactory.createVehicle();
        car.drive();

    }
}
