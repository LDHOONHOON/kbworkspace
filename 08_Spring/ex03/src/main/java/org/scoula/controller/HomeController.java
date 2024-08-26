package org.scoula.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
//        키와 VALUE 쌍으로 MODELdp 저장
//        request scope에 저장되며, 뷰에서 사용 가능
        model.addAttribute("name", "홍길동");
        return "index";// View의 이름
    }
}
