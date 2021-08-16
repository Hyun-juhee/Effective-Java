package chapter2.item2.src.hierarchicalBuilder;

import static chapter2.item2.src.hierarchicalBuilder.Size.*;
import static chapter2.item2.src.hierarchicalBuilder.Topping.*;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();

        System.out.println(pizza.toString());
        System.out.println(calzone.toString());
    }
}
