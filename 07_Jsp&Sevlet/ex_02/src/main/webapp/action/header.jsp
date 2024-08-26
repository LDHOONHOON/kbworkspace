<%--
  Created by IntelliJ IDEA.
  User: ldh
  Date: 2024. 7. 29.
  Time: 오후 4:04
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.Calendar"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    int minute = cal.get(Calendar.MINUTE);
    int second = cal.get(Calendar.SECOND);
%>
현재 시간은 <%= hour %> 시 <%= minute %> 분 <%= second %> 초 입니다.
