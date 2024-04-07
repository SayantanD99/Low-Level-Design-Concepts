package Design_Patterns.Decorator.AddOns;

import Design_Patterns.Decorator.Beverage;

public class Milk implements AddOn{

    Beverage b;

    public Milk(Beverage b){
        this.b = b;
    }
    @Override
    public int getPrice() {
        return b.getPrice() + 30;
    }
}
