package chapter2.item2.hierarchicalBuilder;

import static chapter2.item2.hierarchicalBuilder.Size.*;
import static chapter2.item2.hierarchicalBuilder.Topping.*;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();

        System.out.println(pizza.toString());
        System.out.println(calzone.toString());
    }
}
