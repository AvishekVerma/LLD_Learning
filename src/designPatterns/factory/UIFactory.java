package designPatterns.factory;

import designPatterns.factory.button.Button;
import designPatterns.factory.dropdown.Dropdown;
import designPatterns.factory.menu.Menu;

public interface UIFactory {

    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();


}
