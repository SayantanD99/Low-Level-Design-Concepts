package Design_Patterns.Decorator.AddOns;

import Design_Patterns.Decorator.Beverage;

public class Whip implements AddOn{
    Beverage b;

    public Whip(Beverage b){
        this.b = b;
    }
    @Override
    public int getPrice() {
        return b.getPrice() + 40;
    }
}