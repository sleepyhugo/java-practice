package oop.Classes;

public class Car {
    String make;
    String model;
    int year;
    int mileage;

    public Car(String make, String model, int year, int mileage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void start(){
        System.out.println("The " + year + " " + make + " " + model + " is starting!");
    }

    public void drive(int miles){
        mileage += miles;
        System.out.println("You drove " + miles + " miles. New mileage: " + mileage);
    }

    public void displayInfo(){
        System.out.println("Car info: " + year + " " + make + " " + model + ", Mileage: " + mileage);
    }


    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M3", 1995, 160000);

        car1.start();
        car1.drive(20);
        car1.displayInfo();
    }
}
