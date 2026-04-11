package designPatterns.factory;

import designPatterns.factory.button.Button;
import designPatterns.factory.dropdown.Dropdown;
import designPatterns.factory.menu.Menu;

public class Client {

    public static void main(String[] args) {

        Flutter flutter = new Flutter(SupportedPlatforms.ANDROID);
        UIFactory uiFactory = flutter.createUIFactory();
        Button button = uiFactory.createButton();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();
    }
}
