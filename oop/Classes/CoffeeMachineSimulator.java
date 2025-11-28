package oop.Classes;

public class CoffeeMachineSimulator {

    public static class Coffee{
        String name;
        double price;

        public Coffee(String name, double price){
            this.name = name;
            this.price = price;
        }

        public void displayCoffee(){
            System.out.println(name + " - $" + price);
        }
    }

    public static class CoffeeMachine{
        Coffee selectedCoffee;
        double balance;

        public void insertMoney(double amount){
            balance += amount;
        }

        public void selectCoffee(Coffee coffee){
            selectedCoffee = coffee;
        }

        public void brew(){
            if (selectedCoffee == null){
                System.out.println("Please select a coffee first");
                return;
            } else if (balance >= selectedCoffee.price){
                System.out.println("Brewing you coffee");
                balance -= selectedCoffee.price;
            } else {
                System.out.println("Not enough money");
            }
        }

        public double getChange(){
            return balance;
        }
    }

    public static void main(String[] args){
        Coffee coffee = new Coffee("Mocha", 4.50);

        coffee.displayCoffee();

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.insertMoney(10.00);
        coffeeMachine.selectCoffee(coffee);
        coffeeMachine.brew();
        System.out.println(coffeeMachine.getChange());
    }
}
