package ui;

import basic.Input;
import command.Command;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<MenuItem> menus;
    public Menu() {
        menus = new ArrayList<>();
    }

    public void add(MenuItem item) {
        menus.add(item);
    }

    public void printMenu() {
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < menus.size(); i++) {
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
        // 올바른 범위 인지 체크
        return menus.get(selectNo-1).getCommand();
    }
}
