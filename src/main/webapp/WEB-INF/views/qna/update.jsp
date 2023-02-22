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
	<h1>글수정 Page</h1>
	
	<form action="./update" method="post">
			
			<input type="hidden" name="qnaNum" value="${dto.qnaNum}">
		
			
			<fieldset>
				<legend>글제목</legend>
				<input type="text" name="qnaName" value="${dto.qnaName}" placeholder="글제목 입력">
			</fieldset>
			
			<fieldset>
				<legend>글내용</legend>
				<textarea rows="" cols=""  name="qnaDetail">${dto.qnaDetail}</textarea> 
			</fieldset>
				
			<fieldset>
				<legend>ID</legend>
				<input type="text" name="id" value="${dto.id}">
			</fieldset>
			
			
			<fieldset>
				<legend>regdate</legend>
				<input type="text" name="regdate"value="${dto.regdate}">
			</fieldset>
			
			<fieldset>
				<legend>조회수</legend>
				<input type="text" name="hit"value="${dto.hit}">
			</fieldset>
			
			
		
			
			<fieldset>
				<legend>수정</legend>
				<input type="submit" value="수정" >
			</fieldset>
			
			
	</form>
</body>
</html>