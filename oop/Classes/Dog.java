package oop.Classes;

public class Dog {
    String name;
    int age;

    public void bark(){
        System.out.println("Woof! My name is " + name + "!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", " + "Age: " + age);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Gia";
        dog1.age = 3;

        Dog dog2 = new Dog();
        dog2.name = "Ariel";
        dog2.age = 5;

        dog1.bark();
        dog1.displayInfo();

        System.out.println();

        dog2.bark();
        dog2.displayInfo();
    }
}
