package Design_Patterns.Factory;

import Design_Patterns.Factory.Components.Button.*;
import Design_Patterns.Factory.Components.DropDown.*;
import Design_Patterns.Factory.Components.Menu.*;

public class MacUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }
}
