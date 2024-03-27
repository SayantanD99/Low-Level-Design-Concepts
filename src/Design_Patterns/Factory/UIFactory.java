package Design_Patterns.Factory;

import Design_Patterns.Factory.Components.Button.*;
import Design_Patterns.Factory.Components.DropDown.*;
import Design_Patterns.Factory.Components.Menu.*;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
