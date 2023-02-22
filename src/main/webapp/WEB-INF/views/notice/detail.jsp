<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container -fluid my-5 ">
		<div class="row mb-4 ">
			<h1 class="col-md-7 mx-auto text-center pb-4">Notice Detail</h1>
		</div>
	<form action="./detail" method="get">
	<div class="row col-md-7 mx-auto">
	<c:if test="${not empty dto}">
	<div class="mb-3">
		<label for="num" class="form-label">글번호</label>
		<input type="text" name="num" class="form-control" id="num" value="${dto.num }" disabled="disabled">
	</div>	
	<div class="mb-3">
		<label for="title" class="form-label">글제목</label>
		<input type="text" name="title" class="form-control" id="title" value="${dto.title }" disabled="disabled">
	</div>	
	<div class="mb-3">
		<label for="contents" class="form-label">글내용</label>
		<input type="text" name="contents" class="form-control" id="contents" value="${dto.contents }" disabled="disabled">
	</div>	
	<div class="mb-3">
		<label for="id" class="form-label">작성자</label>
		<input type="text" name="id" class="form-control" id="id" value="${dto.id }" disabled="disabled">
	</div>	
	<div class="mb-3">
		<label for="regdate" class="form-label">작성 날짜</label>
		<input type="text" name="regdate" class="form-control" id="regdate" value="${dto.regdate }" disabled="disabled">
	</div>
	<div class="mb-3">
		<label for="hit" class="form-label">조회수</label>
		<input type="text" name="hit" class="form-control" id="hit" value="${dto.hit }" disabled="disabled">
	</div>		
	<div class="row col-md-5 mx-auto mt-5">
		<a href="./delete?num=${dto.num}" class="btn btn-outline-secondary">상품삭제</a>
		<a href="./update?num=${dto.num}" class="btn btn-outline-secondary">상품수정</a>
		<a href="./list" class="btn btn-outline-secondary">목록으로</a>
	
	</div>
	</c:if>
	
	<c:if test="${empty dto}">
			<h3>존재하지 않는 상품입니다.</h3>
	<div class="row col-md-5 mx-auto">
	<a href="./update?num=${dto.num}" class="btn btn-outline-secondary">상품수정</a>
	<a href="./list" class="btn btn-outline-secondary">목록으로</a>
	</div>
	</c:if>
	</div>
	</form>
	</div>
	
</body>
</html>