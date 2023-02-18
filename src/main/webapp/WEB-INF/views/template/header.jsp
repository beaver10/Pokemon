<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 


<header id="hd" class="page-pokemon">
		<h1>
			<a href="/"><img src="/resources/images/logo.png" alt="pokemon"></a>
		</h1>
		<div class="container flex-justify-space">
			<button type="button" class="js-mn no-style" title="메뉴열기/닫기">
				<span></span>
				<span></span>
				<span></span>
			</button>
			<nav id="gnb">
				<ul class="gnb">
					<li class="">
						<a href="/news" class="warning "><i class="icon-news"></i>소식</a>
					</li>
					<li class="">
						<a href="/game" class="primary "><i class="icon-game"></i>게임</a>
					</li>
					<li class="">
						<a href="https://pokemoncard.co.kr/" target="_blank" class="secondary"><i class="icon-card"></i>카드 게임</a>
					</li>
					<li class="">
						<a href="/animation" class="secondary2 "><i class="icon-ani"></i>애니메이션</a>
					</li>
					<li class="">
						<a href="/goods" class="danger "><i class="icon-ball"></i>상품</a>
					</li>
					<li class="d-lg-none d-block">
						<a href="/pokedex"><i class="icon-ball-c"></i>포켓몬 도감</a>
					</li>
					<li class="d-lg-none d-block">
						<a href="http://www.pokemonstore.co.kr" target="_blank" class="btn-store"><img src="/img/icon/icon_poke.png" alt="" class="mr-2">포켓몬 스토어</a>
					</li>
				

 
				</ul>
			</nav>
			<ul id="acc">
				<li class="d-lg-block d-none">
					<a href="/pokedex"><i class="icon-ball-c"></i>포켓몬 도감</a>
				</li>
								<li>
					<a href="/member/login?next=/"><i class="icon-login"></i>로그인</a>
				</li>
								<li>
					<button type="button" id="tsearchbtn" class="no-style collapsed" data-toggle="collapse" data-target="#search"><i class="icon-search"></i>통합검색</button>
				</li>
			</ul>
		</div>
		<a href="http://www.pokemonstore.co.kr" target="_blank" class="btn-store d-lg-flex d-none"><img src="/img/icon/icon_poke.png" alt="" class="mr-2">포켓몬 스토어</a>
		<div id="search" class="collapse">
			<div class="search-wrp">
				<input type="text" placeholder="검색어를 입력해주세요" name="tsword" id="tsword" onkeypress="if(event.keyCode==13) {totsearch(); return false;}" value="">
				<button type="button" onclick="totsearch()" class="no-style btn-search"><p class="sr-only">검색</p></button>
				<button tabindex="button" data-toggle="collapse" data-target="#search" class="no-style btn-close"><p class="sr-only">닫기</p></button>
			</div>
		</div>
	</header>