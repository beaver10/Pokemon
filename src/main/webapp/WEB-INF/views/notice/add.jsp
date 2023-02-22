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
			<h1 class="col-md-7 mx-auto text-center pb-4">Notice Add</h1>
		</div>
	
			<form action="./add" method="post">
			<div class="row col-md-7 mx-auto">
				
				
				<div class="mb-3">
				    <label for="title" class="form-label">글제목</label>
				    <input type="text" name="title" class="form-control" id="title" placeholder="글제목 입력">
			    </div>
				
				<div class="mb-3">
				  <label for="contents" class="form-label">글내용</label>
				  <textarea class="form-control" name="contents" id="FormControlcontents" placeholder="글내용 입력" rows="3"></textarea>
				</div>
				
				<div class="mb-3">
				    <label for="id" class="form-label"></label>
				    <input type="text" name="id" class="form-control" id="id" hidden="" value="${trainer.id }">
			    </div>
			    
<!-- 			    <div class="mb-3">
				    <label for="day" class="form-label">DAY</label>
				    <input type="date" name="day" class="form-control" id="Inputday" placeholder="DAY 입력">
			    </div> -->
			   
			    <div class="mb-3">
				    <label for="hit" class="form-label">조회수</label>
				    <input type="text" name="hit" class="form-control" id="Inputhit" placeholder="0을 입력해주세요">
			    </div>
				
				
				
			
			</div>
			
			<div class="row col-md-7 mx-auto my-5">
		
			<!-- <input type="submit" value="등록" > -->
			
			<fieldset>
			<button type="submit" class="btn btn-outline-secondary">등록</button>
			</fieldset>
			</div>
			
			
		
		</form>
</div>		
<c:import url="../template/common_css.jsp"></c:import>
</body>
</html>