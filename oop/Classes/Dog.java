package oop.Classes;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void bark(){
        System.out.println("Woof! My name is " + name + "!");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", " + "Age: " + age);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Gia", 3);
        Dog dog2 = new Dog("Ariel", 5);

        dog1.bark();
        dog1.displayInfo();

        System.out.println();

        dog2.bark();
        dog2.displayInfo();
    }
}
