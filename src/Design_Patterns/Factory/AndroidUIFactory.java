package Design_Patterns.Factory;

import Design_Patterns.Factory.Components.Button.*;
import Design_Patterns.Factory.Components.DropDown.*;
import Design_Patterns.Factory.Components.Menu.*;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }
    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
