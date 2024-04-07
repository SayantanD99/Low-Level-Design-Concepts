package Design_Patterns.Decorator;

import Design_Patterns.Decorator.AddOns.Milk;
import Design_Patterns.Decorator.AddOns.Waffer;

public class Main {
    public static void main(String[] args) {

        Beverage b = new Espresso();
        b = new Milk(b);
        b = new Waffer(b);
        System.out.println(b.getPrice());
    }
}