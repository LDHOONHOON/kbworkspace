package practice.ch07.examL2;

public  class HttpServletExample {
    public static void main(String[] args) {
        method(new LoginServlet()); //로그인 합니다.
        method(new FileDownloadServlet()); //다운로드 합니다.
    }
    public static void method(HttpServlet servlet) { //부모 클래스
        servlet.service();
    }
}

