package org.scoula.ex05;

import org.scoula.ex05.domain.Member;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet("/format")
public class formatServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Member member = new Member ("홍길동_" + i, "hong_" + i);
            members.add(member);
        }
        request.setAttribute("members", members);
        request.setAttribute("role", "ADMIN");

//        현재 날짜로 today 속성 세팅
        request.setAttribute("today", new Date());

        request.getRequestDispatcher("format.jsp")
                .forward(request, response);
    }
}
