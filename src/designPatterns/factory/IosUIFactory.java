package designPatterns.factory;

import designPatterns.factory.button.Button;
import designPatterns.factory.button.IosButton;
import designPatterns.factory.dropdown.Dropdown;
import designPatterns.factory.dropdown.IosDropdown;
import designPatterns.factory.menu.IosMenu;
import designPatterns.factory.menu.Menu;

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
    public Dropdown createDropdown() {
        return new IosDropdown();
    }
}
