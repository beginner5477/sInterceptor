<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
	<div>
		<a href="${pageContext.request.contextPath}/board/boardList">게시판 리스트</a>
		<a href="${pageContext.request.contextPath}/board/boardInput">게시판 글쓰기</a>
		<a href="${pageContext.request.contextPath}/board/boardUpdate">게시판 글수정</a>
	</div>
</body>
</html>
