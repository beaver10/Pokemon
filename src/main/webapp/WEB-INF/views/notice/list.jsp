<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>NOTICE</title>
	<c:import url="../template/common_css.jsp"></c:import>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
	
<div class="container -fluid my-5">

	<div class="row mb-4 border-bottom border-dark">
		<h1 class="col-md-7 mx-auto text-center pb-4">NOTICE</h1>
	</div>

		<table class="table table-hover"> 
		   <thead>
		      <tr>
		       <th>글번호</th>
		       <th>글제목</th>
		       <th>글내용</th>
		       <th>작성자</th>
		       <th>작성날짜</th>
		       <th>조회수</th>
		      </tr>
		   </thead>
		   <tbody class="table-group-divider">
		   
		   <c:forEach items="${list}" var="dto">
			   <tr>
			      <td><a href="./detail?num=${dto.num}">${pageScope.dto.num}</a></td>
			      <td class="tb1_td"><a>${pageScope.dto.title}</a></td>
			      <td class="tb1_td"><a>${pageScope.dto.contents}</a></td>
			      <td class="tb1_td"><a>${pageScope.dto.id}</a></td>
			      <td class="tb1_td"><a>${pageScope.dto.regdate}</a></td>
			      <td class="tb1_td"><a>${pageScope.dto.hit}</a></td>
			   </tr>
		   </c:forEach>
		
		   </tbody>
		</table>
	<!-- @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@PAGE.BUTTON@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ -->	
		<div class="row">
			<nav aria-label="Page navigation example">
				  <ul class="pagination" >
				    <li class="page-item" ${pager1.before?'disabled':''}>
				      <a class="page-link" href="./list?page=${pager1.startNum-1}&kind=${pager1.kind}&search=${pager1.search}" aria-label="Previous">
				        <span aria-hidden="true">&laquo;</span>
				      </a>
				    </li>
				    
				    <c:forEach begin="${pager1.startNum}" end="${pager1.lastNum}" var="i">
				    	<li class="page-item"><a class="page-link" href="./list?page=${i}&kind=${pager1.kind}&search=${pager1.search}">${i}</a></li>
				    </c:forEach>
				    
				    
				    <li class="page-item" ${pager1.after eq false ? 'disabled' : '' }>
				      <a class="page-link"  href="./list?page=${pager1.lastNum+1}&kind=${pager1.kind}&search=${pager1.search}"  aria-label="Next">
				        <span aria-hidden="true">&raquo;</span>
				      </a>
				    </li>
				  </ul>
				</nav>
		
		
			<!--for(int i=1;i<=??;i++){i}  -->
			
		</div>
		<!--@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 검색창 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@  -->
		<div>	
			<form class="row g-3" action="./list" method="get">
			  <div class="col-auto">
			    <label for="kind" class="visually-hidden">kind</label>
				<select class="form-select" name="kind" id="kind" aria-label="Default select example">
					<option value="title">글제목</option>
					<option value="contents">글내용</option>
					
					
				  </select>
			  </div>
			  <div class="col-auto">
			    <label for="search" class="visually-hidden">Search</label>
			    <input type="text" class="form-control" name="search" id="search" placeholder="검색어를 입력하세요">
			  </div>
			  <div class="col-auto">
			    <button type="submit" class="btn btn-primary mb-3">검색</button>
			  </div>
			</form>
		</div>
			
		
		<a href="./add" class="btn btn-primary col-2">글등록</a>
	
	</div>
		<c:import url="../template/common_js.jsp"></c:import>
		</body>
</html>