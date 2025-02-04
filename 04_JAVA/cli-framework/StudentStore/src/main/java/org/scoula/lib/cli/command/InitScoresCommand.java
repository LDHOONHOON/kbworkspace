package org.scoula.lib.cli.command;

import org.scoula.lib.cil.command.Command;
import org.scoula.lib.cil.ui.Input;
import org.scoula.lib.cli.domain.StudentScores;

public class InitScoresCommand implements Command {
    StudentScores studentScores = StudentScores.getInstance();

    @Override
    public void execute() {
//        getInt를 사용해서 사용자한테 학생수를 입력받음
        int studentNum = Input.getInt("학생수> ");
//        studentNum과 점수 배열의 크기를 할당
        studentScores.setStudentNum(studentNum);
    }

}
