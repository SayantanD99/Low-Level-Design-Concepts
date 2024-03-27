package Design_Patterns.Factory;

import Design_Patterns.Factory.Components.Button.*;
import Design_Patterns.Factory.Components.DropDown.*;
import Design_Patterns.Factory.Components.Menu.*;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }
}
