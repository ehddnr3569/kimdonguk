<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	out.println(123);
	out.println("<p>문단</p>");
	for(int i=0; i<10; i++){
		out.println("i="+i);
	}

%>