package Design_Patterns.Decorator.AddOns;

import Design_Patterns.Decorator.Beverage;

public class Waffer implements AddOn{
    Beverage b;

    public Waffer(Beverage b){
        this.b = b;
    }
    @Override
    public int getPrice() {
        return b.getPrice() + 50;
    }
}