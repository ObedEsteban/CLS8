package tarea;

import base.Topping;
import especialidades.PizzaItaliana;

public class Main {
    public static void main(String[] args) {

        double pizzaPrice = 12.99;
        double mozzarellaPrice = 1.99;
        double pepperoniPrice = 2.49;
        double basilPrice = 1.29;


        PizzaItaliana pizzaItaliana = new PizzaItaliana("Pizza Italiana", pizzaPrice, "Tomato Sauce",
                new Topping("Mozzarella", mozzarellaPrice),
                new Topping("Pepperoni", pepperoniPrice),
                new Topping("Basil", basilPrice));


        double totalPrecio = pizzaPrice;
        for (Topping topping : pizzaItaliana.getToppings()) {
            totalPrecio += topping.getPrecio();
        }





        pizzaItaliana.prepare();
        System.out.println("Esta es la salsa: " + pizzaItaliana.getSalsa());
        System.out.println("Precio total de la Pizza Italiana con Toppings: $" + totalPrecio);
    }
}
