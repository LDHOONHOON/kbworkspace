package ui;

import command.Command;
import command.PrintScoreCommand;

// 따로 관리되던 메뉴명과 Command를 하나의 클래스로 캡슐화해줌
public class MenuItem {
    String title; // 1. 학생수 입력
    Command command; // 2.
    public MenuItem(String title, Command command)
    {
        this.title = title;
        this.command = command;
    }
    public String getTitle() {
        return title;
    }
    public Command getCommand() {
        return command;
    }
}
