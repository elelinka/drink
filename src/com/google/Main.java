package com.google;

public class Main {

    public static void main(String[] args) {

        Drink drink1 = new Drink();

        drink1.name = "Malibu";
        drink1.price = 25.0;
        drink1.isAlcoholic = true;

        //skladnik pierwszy
        Ingredient ingredient1 = new Ingredient();
        drink1.ingredient = ingredient1;
        ingredient1.name = "mleko";
        ingredient1.amount = 1.0;

        //skladnik drugi
        Ingredient ingredient2 = new Ingredient();
        drink1.ingredient = ingredient2;
        ingredient2.name = "wódka";
        ingredient2.amount = 0.5;

        //skladnik trzeci
        Ingredient ingredient3 = new Ingredient();
        drink1.ingredient = ingredient3;
        ingredient3.name = "syrop";
        ingredient3.amount = 0.3;

        System.out.println("Drink: " + drink1.name + ", cena: " + drink1.price + ", czy jest alkoholowy? " + drink1.isAlcoholic);
        System.out.println("Składniki: ");
        System.out.println(ingredient1.name + ", ilość: " + ingredient1.amount);
        System.out.println(ingredient2.name + ", ilość: " + ingredient2.amount);
        System.out.println(ingredient3.name + ", ilość: " + ingredient3.amount);

        //pojemnosc
        drink1.volume = ingredient1.amount + ingredient2.amount + ingredient3.amount;

        System.out.println("Pojmność: " + drink1.volume);
    }
}
