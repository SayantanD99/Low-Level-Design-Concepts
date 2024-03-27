package Design_Patterns.Factory;

import Design_Patterns.Factory.Components.Button.*;
import Design_Patterns.Factory.Components.DropDown.*;
import Design_Patterns.Factory.Components.Menu.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatform.MAC);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
    }
}

/*
    Flutter ->
    If we choose IOS, it will generate IOS Apps
    else if we choose Android, it will android apps
 */