import command.*;

import java.util.Scanner;

public class App {
    Menu menu;
    Command[] commands;

    public App() {
//        생성자에서 Menu로 객체 생성해서 초기화
        menu = new Menu();
        commands = new Command[] {
                new InitScoresCommand(), // 1.학생수 입력
                new GetScoresCommand(), // 2. 점수 입력
                new PrintScoreCommand(), // 3. 점수 출력
                new AnalizeCommand(), // 4. 분석
                new ExitCommand() // 5. 종료
        };
    }

    // executeCommand : 만들어둔 메소드들을 사용자의 입력값에 따라 호출
    public void executeCommand(int selectNo) {
        // 인덱스로 접근해야 하기 때문에 사용자가 입력한 번호에서 -1 해줌
        Command command = commands[selectNo-1];
        // 가져온 커맨드의 excute가 실행된다
        command.execute();
    }

    public void run() {
        while(true) {
            menu.printMenu();
            int selectNo = menu.getSelect();
            executeCommand(selectNo);
        }
    }
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}