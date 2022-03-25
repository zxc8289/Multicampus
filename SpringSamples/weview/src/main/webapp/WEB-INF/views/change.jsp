<%@page import="weview.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../inc.jsp" %>

<%
	MemberDto mem = (MemberDto) request.getSession().getAttribute("login");
%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="UTF-8">

<link rel="apple-touch-icon" type="image/png"
	href="https://cpwebassets.codepen.io/assets/favicon/apple-touch-icon-5ae1a0698dcc2402e9712f7d01ed509a57814f994c660df9f7a952f3060705ee.png" />
<meta name="apple-mobile-web-app-title" content="CodePen">

<link rel="shortcut icon" type="image/x-icon"
	href="https://cpwebassets.codepen.io/assets/favicon/favicon-aec34940fbc1a6e787974dcd360f2c6b63348d4b1f4e06c77743096d55480f33.ico" />

<link rel="mask-icon" type="image/x-icon"
	href="https://cpwebassets.codepen.io/assets/favicon/logo-pin-8f3771b1072e3c38bd662872f6b673a722f4b3ca2421637d5596661b4e2132cc.svg"
	color="#111" />

<title>Weview - 정보변경</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<script defer
	src="https://use.fontawesome.com/releases/v5.0.8/js/solid.js"
	integrity="sha384-+Ga2s7YBbhOD6nie0DzrZpJes+b2K1xkpKxTFFcx59QmVPaSA8c7pycsNaFwUK6l"
	crossorigin="anonymous"></script>
<script defer
	src="https://use.fontawesome.com/releases/v5.0.8/js/fontawesome.js"
	integrity="sha384-7ox8Q2yzO/uWircfojVuCQOZl+ZZBg2D2J5nkpLqzH1HY0C1dHlTKIbpRz/LG23c"
	crossorigin="anonymous"></script>

<link href="resources/css/font.css" rel="stylesheet" />
<link href="resources/css/profStyle.css" rel="stylesheet" />

<script>
	window.console = window.console || function(t) {
	};
</script>



<script>
	if (document.location.search.match(/type=embed/gi)) {
		window.parent.postMessage("resize", "*");
	}
</script>


</head>

<body translate="no">
<jsp:include page="includes/navigation.jsp" /> <!-- 네비게이션 -->
	<div class="cover-image-container container-fluid " style="padding: 0px; !important">
		<div class="cover-image">
			<img
				src="https://s3.ap-south-1.amazonaws.com/static3.tagtaste.com/images/p/160/hi/DtMryWkuZy5AApHMAUXIR7bwVfpf27az.jpg" />
		</div>
	</div>
	<div class="nav-holder">
		<div class="container-fluid">
			<div class="container">
				<div class="row">
					<div class="col-sm-3">
						<div class="profile-pic">
							<img src="resources<%= mem.getProfile()%>"
									style="width: inherit; height: inherit;">
						</div>
					</div>
					<div class="nav-section col-sm-9">
						<ul class="nav nav-tabs nav-custom" id="myTab" role="tablist">
							<li class="nav-item"><a class="nav-link active"
								id="about-tab" data-toggle="tab" href="#about" role="tab"
								aria-controls="about" aria-selected="false">회원정보</a></li>


							<li class="nav-item"><a class="nav-link" id="interests-tab"
								data-toggle="tab" href="#interests" role="tab"
								aria-controls="interests" aria-selected="false">찜목록</a></li>

						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="main-content-container container-fluid">
		<div class="main-content container">
			<div class="row">
				<div class="col-sm-3 left-side-nav">
					<div class="box-component user-information">
						<div class="profile-info-view">
							<h5 class="user-name"><%=mem.getName()%></h5>
							<h6 class="user-handle"><%=mem.getNickname()%></h6>
							<hr class="full-width-hr" />
							<div class="user-followers">
								<div class="following">
									<span class="num">회원정보 페이지입니다.</span>
								</div>

							</div>
						</div>
						<div class="profile-info-edit"></div>
					</div>
				</div>
				<div class="col-sm-9 general-info">
					<div class="tab-content" id="myTabContent">
						<div class="tab-pane fade show active" id="about" role="tabpanel"
							aria-labelledby="about-tab">
							<div class="box-component">
								<div class="container">
									<div class="row">
										<div class="col-sm-12"
											style="margin-top: 10px; margin-bottom: 10px">
											<h5>회원정보</h5>
										</div>
										<form action="update.do" method="POST">
											<div class="col-sm-12 pt-3">
												<div class="row">
													<div class="col-sm-2">
														<h6 class="light-text small-head bold-weight" style="margin-top: 5px">SEQ</h6>
													</div>
													<div class="col-sm-10">
														<input type="text"
															style="margin-left: 20px" id="seq_user" name="seq_user" value="<%=mem.getSeq_user()%>" readonly="readonly">
													</div>
												</div>
											</div>
											<div class="col-sm-12 pt-3">
												<div class="row">
													<div class="col-sm-2">
														<h6 class="light-text small-head bold-weight"
															style="margin-top: 5px;">ID</h6>
													</div>
													<div class="col-sm-10">
														<input type="text"
															style="margin-bottom: 10px; margin-left: 20px" name="id">
													</div>
												</div>
											</div>
											<div class="col-sm-12">
												<div class="row">
													<div class="col-sm-2">
														<h6 class="light-text small-head bold-weight"
															style="margin-top: 5px">PWD</h6>
													</div>
													<div class="col-sm-10">
														<input type="text"
															style="margin-bottom: 10px; margin-left: 20px" name="pwd">
													</div>
												</div>
											</div>
											<div class="col-sm-12">
												<div class="row">
													<div class="col-sm-2">
														<h6 class="light-text small-head bold-weight"
															style="margin-top: 5px;">NickName</h6>
													</div>
													<div class="col-sm-10">
														<input type="text"
															style="margin-bottom: 10px; margin-left: 20px"
															name="nickname">
													</div>
												</div>
											</div>


											<button class="btn btnoutline-dark"
												style="margin-right: 40px; margin-left: 10px; border-radius: 50px"
												type="submit">수정완료</button> <!-- alert 띄우기 -->
										</form>


									</div>
								</div>
							</div>
						</div>


						<div class="tab-pane fade" id="interests" role="tabpanel"
							aria-labelledby="interests-tab">
							<div class="box-component">
								<div class="container">
									<div class="row">
										<div class="col-sm-12">
											<h6>Interests</h6>
										</div>
										<div class="col-sm-12 pt-3">
											<div
												class="row d-flex align-items-center justify-content-flex-start">
												<div class="sectional-tabs">Women Empowerment</div>
												<div class="sectional-tabs">Child Empowerment</div>
												<div class="sectional-tabs">Women Empowerment</div>
												<div class="sectional-tabs">Child Empowerment</div>
												<div class="sectional-tabs">Women Empowerment</div>
												<div class="sectional-tabs">Child Empowerment</div>
												<div class="sectional-tabs">Women Empowerment</div>
												<div class="sectional-tabs">Child Empowerment</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>


</html>