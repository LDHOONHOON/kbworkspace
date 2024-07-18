package org.scoula.lib.cli;

import org.scoula.lib.cil.ui.Menu;
import org.scoula.lib.cil.ui.MenuItem;
import org.scoula.lib.cli.service.StudentScoreService;

public class StudentScoreApp extends App { // 클래스 이름을 StudentScoreApp으로 변경
    StudentScoreService service = new StudentScoreService();

    @Override
    public void createMenu(Menu menu) {
        menu.add(new MenuItem("학생수", service::initScores));
        menu.add(new MenuItem("점수입력", service::getScores));
        menu.add(new MenuItem("점수리스트", service::printScores));
        menu.add(new MenuItem("분석", service::analize));
    }

    public static void main(String[] args) {
        org.scoula.lib.cli.App app = new StudentScoreApp();
        app.run();
    }
}
