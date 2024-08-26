package org.scoula.board.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.scoula.board.domain.BoardAttachmentVO;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.scoula.common.util.UploadFiles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller // controller 기능을 하는 빈 등록
@Log4j
@RequiredArgsConstructor // 생성자 주입
@RequestMapping("/board") // url 공통주소 할당
public class BoardController {
    final private BoardService service;

    // https://localhost:8080/board/list
    // return 값이 void이기 때문에 뷰도 경로가 동일 (board/list)
    @GetMapping("/list")
    public void list(Model model) {
        log.info("list");
        // Model의 속성에 데이터를 담을 경우 뷰로 전달 가능
        model.addAttribute("list", service.getList());
    }

    @GetMapping("/create")
    public void create(){
        log.info("create");
    }

    @PostMapping("/create")
    public String create(BoardDTO board,
                         RedirectAttributes ra) {
        System.out.printf("@@@@@@@@@@@@@@@@@@");
        service.create(board);
        ra.addFlashAttribute("result", board.getNo());

        return "redirect:/board/list";
    }

    @GetMapping({ "/get", "/update" })
    public void get(@RequestParam("no") Long no, Model model) {
        log.info("/get or update");
        model.addAttribute("board", service.get(no));
    }

    @PostMapping("/update")
    public String update(BoardDTO board,
                         RedirectAttributes ra) {
        if (service.update(board)) {
            ra.addFlashAttribute("result", "success");
        }
        return "redirect:/board/list";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("no") Long no,
                         RedirectAttributes ra) {
        if (service.delete(no)) {
            ra.addFlashAttribute("result", "success");
        }
        return "redirect:/board/list";
    }

    @GetMapping("/download/{no}")
    @ResponseBody // view를 사용하지 않고, 직접 내보냄
    public void download(@PathVariable("no") Long no, HttpServletResponse response) throws Exception {

        BoardAttachmentVO attach = service.getAttachment(no);

        File file = new File(attach.getPath());

        UploadFiles.download(response, file, attach.getFilename());
    }
}