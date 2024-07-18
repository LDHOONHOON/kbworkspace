package org.scoula.lib.cil.ui;

import org.scoula.lib.cil.command.Command;

import java.util.ArrayList;

public class Menu {
    ArrayList<MenuItem> menus;
    public Menu() {
        menus = new ArrayList<>();
    }
    public void add(MenuItem item) {
        menus.add(item);
    }

    public void printMenu() {
        System.out.println("--------------------------------------------------------------");
        for(int i = 0; i < menus.size(); i++) {
//            menus[i]는 MenuItem의 객체이므로 title만 가져와서 출력
            System.out.printf("%d.%s | ", i+1, menus.get(i).getTitle());
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");
    }

    public Command getSelect() {
//        사용자가 입력한 숫자를 받아서 selectNo에 저장
        int selectNo = Input.getInt("선택> ");
        // index로 접근해야 되기 때문에 -1을 해줌
        // menus에서 MenuItem 객체 하나를 접근해서 Command만 가져온다
        return menus.get(selectNo-1).getCommand();
    }
}
