package designPatterns.factory;

import designPatterns.factory.button.AndroidButton;
import designPatterns.factory.button.Button;
import designPatterns.factory.dropdown.Dropdown;
import designPatterns.factory.menu.AndroidMenu;
import designPatterns.factory.menu.Menu;

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
    public Dropdown createDropdown() {
        return new Dropdown() {
        };
    }
}
