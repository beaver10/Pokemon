<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>UPDATE PAGE</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container -fluid my-5 ">
		<div class="row mb-4 ">
			<h1 class="col-md-7 mx-auto text-center pb-4">Notice Update</h1>
		</div>
	<form action="./update" method="post">
	<div class="row col-md-7 mx-auto">
	<input type="hidden" name="num" value="${dto.num}">
	<div class="mb-3">
		<label for="title" class="form-label">글제목</label>
		<input type="text" name="title" class="form-control" id="title" value="${dto.title }" >
	</div>	
	<div class="mb-3">
		<label for="contents" class="form-label">글내용</label>
		<input type="text" name="contents" class="form-control" id="contents" value="${dto.contents }" >
	</div>	
	<div class="mb-3">
		<input type="text" name="writer" class="form-control" id="writer" value="${dto.writer }" hidden="">
	</div>	
	<div class="mb-3">
		<input type="text" name="regdate" class="form-control" id="regdate" value="${dto.regdate }" hidden="">
	</div>
	<div class="mb-3">
		<input type="text" name="hit" class="form-control" id="hit" value="${dto.hit }" hidden="">
	</div>		
	<div class="row col-md-5 mx-auto mt-5">
		<button type="submit" class="btn btn-outline-secondary">상품수정</button>
		<a href="./list" class="btn btn-outline-secondary">목록으로</a>
	</div>


	</div>
	</form>
	</div>
	
	
	
	<%-- 
	
<title>Insert title here</title>
</head>
<body>
	<h1>글수정 Page</h1>
	
	<form action="./update" method="post">
			
			<input type="hidden" name="num" value="${dto.num}">
		
			
			<fieldset>
				<legend>글제목</legend>
				<input type="text" name="title" value="${dto.title}" placeholder="글제목 입력">
			</fieldset>
			
			<fieldset>
				<legend>글내용</legend>
				<textarea rows="" cols=""  name="contents">${dto.contents}</textarea> 
			</fieldset>
				
			<fieldset>
				<legend>ID</legend>
				<input type="text" name="id" value="${dto.id}" hidden="">
			</fieldset>
			
			
			<fieldset>
				<legend>regdate</legend>
				<input type="text" name="regdate"value="${dto.regdate}" hidden="">
			</fieldset>
			
			<fieldset>
				<legend>조회수</legend>
				<input type="text" name="hit"value="${dto.hit}" hidden="">
			</fieldset>
			
			
		
			
			<fieldset>
				<legend>수정</legend>
				<input type="submit" value="수정" >
			</fieldset>
			
			
	</form> --%>
</body>
</html>