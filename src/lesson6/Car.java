package lesson6;

public class Car {
    int price;
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;
//комит
    public Car() {
    }

    public Car(int price, int yearOfManufacturing, String ownerName) {
        this.price = price;
        this.yearOfManufacturing = yearOfManufacturing;
        this.ownerName = ownerName;
    }

    public void startRun() {
        System.out.println("I am running....");
    }

    public void stopRun() {
        System.out.println("I am stopping....");
    }

    public void changeOwner(String newOwnerName) {
        this.ownerName = newOwnerName;
    }
}