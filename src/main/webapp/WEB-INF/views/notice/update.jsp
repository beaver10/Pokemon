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
			
			<input type="hidden" name="noticeNum" value="${dto.noticeNum}">
		
			
			<fieldset>
				<legend>글제목</legend>
				<input type="text" name="noticeName" value="${dto.noticeName}" placeholder="글제목 입력">
			</fieldset>
			
			<fieldset>
				<legend>글내용</legend>
				<textarea rows="" cols=""  name="noticeDetail">${dto.noticeDetail}</textarea> 
			</fieldset>
				
			<fieldset>
				<legend>ID</legend>
				<input type="text" name="id" value="${dto.id}">
			</fieldset>
			
			
			<fieldset>
				<legend>DAY</legend>
				<input type="text" name="day"value="${dto.day}">
			</fieldset>
			
			<fieldset>
				<legend>조회수</legend>
				<input type="text" name="viewTotal"value="${dto.viewTotal}">
			</fieldset>
			
			
		
			
			<fieldset>
				<legend>수정</legend>
				<input type="submit" value="수정" >
			</fieldset>
			
			
	</form>
</body>
</html>