package org.scoula.board.controller;

import lombok.RequiredArgsConstructor;
import org.scoula.board.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.log4j.Log4j;

@Controller // controller 기능을 하는 빈 등록
@Log4j
@RequestMapping("/board") // url 공동 설정
@RequiredArgsConstructor // 생성자 주입

public class BoardController {

    final private BoardService Service;
}
