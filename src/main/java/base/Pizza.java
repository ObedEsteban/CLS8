
package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String name;
    private double precioBase;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double precioBase, Topping... toppings) {
        this.name = name;
        this.precioBase = precioBase;
        Collections.addAll(this.toppings, toppings);
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {
        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + ", precioBase=" + precioBase + ", toppings=" + toppings + '}';
    }

    public void prepare() {
        System.out.println("Preparando..... " + name);
        System.out.println("añadiendo topping:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("la pizza esta lista!");
    }
}
