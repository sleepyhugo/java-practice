package oop.Classes;

public class PetHotel {

    public static class Pet{
        String name;
        String type;
        int age;

        public Pet(String name, String type, int age){
            this.name = name;
            this.type = type;
            this.age = age;
        }

        public void displayPet(){
            System.out.println("My " + type + " is " + age + " years old. Their name is " + name + "!");
        }
    }

    public static class Reservation{
        Pet pet;
        int nights;
        double pricePerNight;

        public Reservation(Pet pet, int nights, double pricePerNight){
            this.pet = pet;
            this.nights = nights;
            this.pricePerNight = pricePerNight;
        }

        public double getTotal(){
            double total = nights * pricePerNight;
            return total;
        }

        public void displayReservations(){
            pet.displayPet();
            System.out.println("We are staying for " + nights + " nights! The total came out to " + getTotal());
        }
    }

    public static void main(String[] args){
        Pet pet = new Pet("Gia", "Dog", 3);

        Reservation reservation = new Reservation(pet, 10, 100.00);
        reservation.displayReservations();
    }
}