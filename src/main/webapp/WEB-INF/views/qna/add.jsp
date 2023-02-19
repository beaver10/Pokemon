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
			<h1 class="col-md-7 mx-auto text-center pb-4">QNA Add</h1>
		</div>
	
		
			<form action="./add" method="post">
			<div class="row col-md-7 mx-auto">
				
				
				<div class="mb-3">
				    <label for="qnaName" class="form-label">글제목</label>
				    <input type="text" name="qnaName" class="form-control" id="qnaName" placeholder="글제목 입력">
			    </div>
				
				<div class="mb-3">
				  <label for="qnaDetail" class="form-label">글내용</label>
				  <textarea class="form-control" name="qnaDetail" id="FormControlqnaDetail" placeholder="글내용 입력" rows="3"></textarea>
				</div>
				
				<div class="mb-3">
				    <label for="id" class="form-label">ID</label>
				    <input type="text" name="id" class="form-control" id="Inputid" placeholder="ID 입력">
			    </div>
			    
			    <div class="mb-3">
				    <label for="day" class="form-label">DAY</label>
				    <input type="text" name="day" class="form-control" id="Inputday" placeholder="DAY 입력">
			    </div>
			   
			    <div class="mb-3">
				    <label for="viewTotal" class="form-label">조회수</label>
				    <input type="text" name="viewTotal" class="form-control" id="InputviewTotal" placeholder="0을 입력해주세요">
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