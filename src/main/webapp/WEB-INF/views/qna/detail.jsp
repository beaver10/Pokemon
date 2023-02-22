<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Detail Page</h1> <!--empty = 비어있는  -->
	<c:if test="${not empty dto}">
		<h3>글번호 : ${dto.qnaNum }</h3>
		<h3>글제목 : ${dto.qnaName }</h3>
		<h3>글내용 : ${dto.qnaDetail }</h3>
		<h3>작성자 : ${dto.id }</h3>
		<h3>작성날짜 : ${dto.regdate }</h3>
		<h3>조회수 : ${dto.hit }</h3>
		<a href="./delete?qnaNum=${dto.qnaNum}">상품삭제</a>
	</c:if>
	
	<c:if test="${empty dto}">
			<h3>존재하지 않는 상품입니다.</h3>
	</c:if>
	<a href="./update?qnaNum=${dto.qnaNum}">상품수정</a>
	
	<a href="./list">목록으로</a>
	<a href="./update">상품수정</a>
	
	
</body>
</html>