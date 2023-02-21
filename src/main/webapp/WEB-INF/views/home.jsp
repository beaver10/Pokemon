<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
	<title>Home</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<c:import url="./template/common_css.jsp"></c:import>
      <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
      <link href="https://fonts.googleapis.com/css2?family=Lobster&family=Paytone+One&display=swap" rel="stylesheet">
</head>
<body>
<c:import url="./template/header.jsp"></c:import>
  <div class="container-fluid my-5">
	  <div class="row col-md-6 offset-md-3">
	  <h1>밖은 위험하단다</h1>
	 	<h1>포켓몬 한마리를 데려가렴</h1>
	 	<div class="row col-md-4 offset-md-5">
	 	<img src="https://w.namu.la/s/8b2fc8caebbd310d8e032f9a4c93708f4e87eeb3be447757002a6cb6ff72657704be37b0cf26568e8dd0c02ec0b6c4399588ef26280a61da4ff97c951a57e8ceff51361a0a3909cfb240dc049508c1bd92279582fa4de16eb5ac9a07969034f7" class="">
		   </div>
		   <div id="carouselExampleAutoplaying" class="carousel slide" data-bs-ride="carousel">
		  <div class="carousel-inner">
		    <div class="carousel-item active">
		      <img src="https://w.namu.la/s/6d3f34f51bbeceab102ed5fcfbd44244fc7b977dad3f2152c992d7b55338e841f8d252f82d09cf760c2e555b8e0f3faaedd1b3ce6504c21f982e740dd6a37dcc64a22d57f6b2d0658f07d8c45600a9d3bf5d69808764f99a8ca63b16a420bbfe955d2a6722628a5d7ebb452d669b570f" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="https://w.namu.la/s/48c134a0ff54f42873ad58ee7b654bab4c4efec68ff350748cd6caa8049c6c5422182fc2b107acd0dc7f8fbe0893d7e35260aa5bcc6d75d3ba21c4224e7c829a8fc34883333a57a90e5c0c4de9773d80655ac844405636284cbe8d2e8ff742b175bb0582c163fdf5e086bdc72bf9ded6" class="d-block w-100" alt="...">
		    </div>
		    <div class="carousel-item">
		      <img src="https://w.namu.la/s/da1dd8c5205119b0115fa33a6748f97c275ea62449fb937febe49b1b0fbb17ca5c62fe816965b3a3e2ca007a2307215a1c01982912031b04585d9cc2d74b1102b79a1d77ba33ff3e3bb3869a97501300782f3032fc1d9605c684df3d347f6d3355fabc517e1a9f0f381e963dc0100496" class="d-block w-100" alt="...">
		    </div>
		  </div>
		  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="prev">
		    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Previous</span>
		  </button>
		  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleAutoplaying" data-bs-slide="next">
		    <span class="carousel-control-next-icon" aria-hidden="true"></span>
		    <span class="visually-hidden">Next</span>
		  </button>
			</div>
		</div>
	</div>
<c:import url="./template/common_js.jsp"></c:import>
</body>
</html>


