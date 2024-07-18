package org.scoula.lib.cli;

import org.scoula.lib.cil.command.Command;
import org.scoula.lib.cil.command.ExitCommand;
import org.scoula.lib.cil.ui.Menu;
import org.scoula.lib.cil.ui.MenuItem;

public abstract class App {
    Menu menu;

    public App() {

    }

    public void init() {
        menu = new Menu();
        createMenu(menu);
        menu.add(new MenuItem("종료", new ExitCommand()));
    }

    public void createMenu(Menu menu){

    }

    public void run() {
        init();
        while(true) {
            menu.printMenu();
            // 사용자가 입력한 번호에 해당하는 command 리턴
            Command command = menu.getSelect();
            command.execute();
        }
    }
}
