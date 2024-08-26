package org.scoula.ex03.Controller;

import lombok.extern.log4j.Log4j;
import org.scoula.ex03.dto.SampleDTO;
import org.scoula.ex03.dto.SampleDTOList;
import org.scoula.ex03.dto.TodoDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Arrays;

//

@Controller
@RequestMapping("/sample")
@Log4j
public class SampleController {

    @RequestMapping("") // url : /sample
    public void basic() {
        log.info("basic............");
    }

    @RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST}) // url: /sample/basic
    public void basicGet() {
        log.info("basic get............");
    }

    @GetMapping("/basicOnlyGet") // url: /sample/basicOnlyGet
    public void basicGet2() {
        log.info("basic get only get............");
    }

    @GetMapping("/ex01")
    public String ex01(SampleDTO dto) {
        log.info("" + dto);
        return "ex01";
    }

    @GetMapping("/ex02")
    public String ex02(
            @RequestParam("name") String name,
            @RequestParam("age") int age) {
        log.info("name: " + name);
        log.info("age: " + age);
        return "ex02";
    }

    @GetMapping("/ex02List")
    public String ex02List(@RequestParam("ids") String[] ids) {
        log.info("array ids: " + Arrays.toString(ids));
        return "ex02List";
    }

    @GetMapping("/ex02Bean")
    public String ex02Bean(SampleDTOList list) {
        log.info("list dtos: " + list);
        return "ex02Bean";
    }

    //    http://localhost:8080/sample/ex04?title=test&dueDate=2023/01/01
    @GetMapping("/ex03")
    public String ex03(TodoDTO todo) {
        log.info("todo: " + todo);
        return "ex03";
    }

    //    http://localhost:8080/sample/ex04?name=aaa&age11&page=9
//    page를 기본 자료형으로 넘기면 로그에는 찍히지만 뷰로는 전달되지 않는다
//    따라서 @ModelAttribute로 전달해야 한다 (request scope 저장)
    @GetMapping("/ex04")
    public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
        log.info("dto: " + dto);
        log.info("page: " + page);

        return "sample/ex04";
    }

    //    http://localhost:8080/sample/ex05
    // return값이 void일 경우 요청 url을 기준으로 jsp파일을 찾는다
    // /WEB-INF/views/sample/ex05.jsp 파일을 찾게 됨
    @GetMapping("/ex05")
    public void ex05() {
        log.info("/ex05........");
    }

//    http://localhost:8080/sample/ex06
//    해당 경로 접근시 http://localhost:8080/sample/ex06-2?name=AAA&age=12 로 리다이렉트함
    @GetMapping("/ex06")
    public String ex06(RedirectAttributes ra) {
        log.info("/ex06........");
//        리다이렉트 시 요청 파라미터로 name과 age를 추가해준다
        ra.addAttribute("name", "AAA");
        ra.addAttribute("age", 10);
//        리다이렉트 시 "redirect:" 접두사를 사용한다
        return "redirect:/sample/ex06-2";
    }
//    http://localhost:8080/sample/ex07
//    @ResponseBody 어노테이션은 반환된 객체가 JSON 형식으로 변환되어 보여지도록 한다
    @GetMapping("/ex07")
    public @ResponseBody SampleDTO ex07() {
        log.info("/ex07........");

        SampleDTO dto = new SampleDTO();
        dto.setName("10");
        dto.setName("홍길동");

        return dto;
    }
//    http://localhost:8080/sample/ex08
    @GetMapping("/ex08")
    public ResponseEntity<String> ex08() {
        log.info("/ex08..........");

        String msg = "{\"name\": \"홍길동\"}"; // body에 들어갈 json 형태의 문자열

        HttpHeaders header = new HttpHeaders();
//        HttpHeaders 객체 생성 후 Content-Type 헤더 설정
        header.add("Content-Type", "application/json;charset=UTF-8");

//        ResponseEntity 객체 내ㅔ 바디, 헤더, 상태 코드(200) 반환
        return new ResponseEntity<>(msg, header, HttpStatus.OK);
    }

    @GetMapping("/exUpload")
    public void exUpload() {
        log.info("/exUpload..........");
    }

    @PostMapping("/exUploadPost")
    public void exUploadPost(ArrayList<MultipartFile> files) {
        for(MultipartFile file : files) {
            log.info("----------------------------------");
            log.info("name:" + file.getOriginalFilename());
            log.info("size:" + file.getSize());
        }
    }
}
