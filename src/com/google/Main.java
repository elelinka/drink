package com.google;

public class Main {

    public static void main(String[] args) {

        Drink drink1 = new Drink();

        drink1.name = "Malibu";
        drink1.price = 25.0;
        drink1.isAlcoholic = true;

        //skladnik pierwszy
        drink1.ingredient1 = new Ingredient();
        drink1.ingredient1.name = "mleko";
        drink1.ingredient1.amount = 1.0;

        //skladnik drugi
        drink1.ingredient2 = new Ingredient();
        drink1.ingredient2.name = "wódka";
        drink1.ingredient2.amount = 0.5;

        //skladnik trzeci
        drink1.ingredient3 = new Ingredient();
        drink1.ingredient3.name = "syrop";
        drink1.ingredient3.amount = 0.3;

        System.out.println("Drink: " + drink1.name + ", cena: " + drink1.price + ", czy jest alkoholowy? " + drink1.isAlcoholic);
        System.out.println("Składniki: ");
        System.out.println(drink1.ingredient1.name + ", ilość: " + drink1.ingredient1.amount);
        System.out.println(drink1.ingredient2.name + ", ilość: " + drink1.ingredient2.amount);
        System.out.println(drink1.ingredient3.name + ", ilość: " + drink1.ingredient3.amount);

        //pojemnosc
        drink1.volume = drink1.ingredient1.amount + drink1.ingredient2.amount + drink1.ingredient3.amount;

        System.out.println("Pojmność: " + drink1.volume);

    }
}
