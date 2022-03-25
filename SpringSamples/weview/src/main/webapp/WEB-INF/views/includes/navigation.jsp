<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
<!-- 드롭다운 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<!-- Navigation-->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container px-4 px-lg-5">
		<a class="navbar-brand" href="mainpage.do"><span style="color: #FF6F61;">We</span>View</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
				<li class="nav-item"><a class="nav-link active" href="mainpage.do">메인</a></li>
				<li class="nav-item">
				<!-- 드롭다운 -->
					<div class="dropdown">
						<!-- 전환 버튼 -->
						<button class="btn dropdown-toggle" type="button"
							id="dropdownMenuButton" data-bs-display="static"
							data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							장르</button>
						<!-- 드롭 다운 메뉴ー -->
						<div class="dropdown-menu dropdown-menu-lg-end"
							aria-labelledby="dropdownMenuButton">
							<a class="dropdown-item" href="genrelist.do">전체장르</a> <a class="dropdown-item"
								href="comedy.do">코미디</a> <a class="dropdown-item" href="romance.do">로맨스</a>
							<a class="dropdown-item" href="action.do">액션</a> <a
								class="dropdown-item" href="sf.do">SF</a> <a class="dropdown-item"
								href="fantasy.do">판타지</a> <a class="dropdown-item"
								href="thriller.do">스릴러</a>
						</div>
					</div>
				</li>
				<li class="nav-item"><a class="nav-link active" href="reqlist.do">요청</a></li>


<%
	if(session.getAttribute("login") == null) {
%>
	<li class="nav-item"><a class="nav-link active" href="login.do">로그인</a></li>
<%
	}
	else
	{
%>
	<li class="nav-item"><a class="nav-link active" href="logout.do">로그아웃</a></li>
	<li class="nav-item"><a class="nav-link active" href="profile.do">내 정보</a></li>
<%
	}
%> 
				
			</ul>
			<form action="search.do" method="GET"
					class="form-inline my-2 my-lg-0" style="margin-right: 10px; display: flex">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search" name="keyword" />
				<button class="btn btn-outline-dark" type="submit"
						style="width: 5em; margin-left: 0.5em;">검색</button>
			</form>
		</div>
	</div>
</nav>
</body>
</html>