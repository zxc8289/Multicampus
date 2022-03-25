<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--
	List<MemberDto> list = (List<MemberDto>)request.getAttribute("list");
--%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="resources/css/styles.css" rel="stylesheet"/>
    <script>
        function show(){
            document.getElementById("hiddnviews").style.display ='block';
        }

        function hide(){
            document.getElementById("hiddnviews").style.display ='none';
        }
        function show1(){
            document.getElementById("showmoviestory").style.display ='block';
        }

        function hide1(){
            document.getElementById("showmoviestory").style.display ='none';
        }
        
        
    </script>
</head>
<body>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
        <div id="hiddnviews">
            <div id="showHide" >
            </div>
            <div id="showTRALER">
                <div id="showTRALER_1" class="TRALERcolor">
                <iframe id="TRALER" width="100%" height="100%" src="https://www.youtube.com/embed/amXcMw8cJZk/abcdefg" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope;  picture-in-picture" allowfullscreen></iframe>
                
                </div>
            </div>
            <div class="buttondiv">
                <button id="showbutton" onclick=hide();>X</button>
            </div>
        </div>
        <div id="showmoviestory">
            <div id="showHide" >
            </div>
            <div id="showTRALER" >
                <div id="showTRALER_1" class="storycolor">
                    <span id="story">
                        줄거리 줄거리 줄거리
                    </span>
                </div>
            </div>
            <div class="buttondiv">
                <button id="hiddnmoviestory" onclick=hide1();>X</button>
            </div>
        </div>
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container px-4 px-lg-5">
                <a class="navbar-brand" href="#!"><span style="color: red;">We</span>View</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
                        <li class="nav-item"><a class="nav-link active" aria-current="page" href="#!">영화요청</a></li>
                        <li class="nav-item"><a class="nav-link" href="#!">장르별영화</a></li>
                        <li class="nav-item"><a class="nav-link" href="#!">고객센터</a></li>
                        <li class="nav-item"><a class="nav-link" href="#!">마이페이지</a></li>
                    </ul>
                    <form class="form-inline my-2 my-lg-0" style="margin-right: 10px";>
                        <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" />
                    </form>

                    <form class="d-flex">
                        <button class="btn btn-outline-dark" type="submit">
                            회원가입
                        </button>
                    </form>
                </div>
            </div>
        </nav>
        <!-- Section-->
        <section class="py-5">
            <div class="container1 movie_ex"> 
                <img src="2-1.jpg" alt="" class="movie_img">
                <div class="information ">
                    <div class="score">
                        <div class="TITLE sc_1">
                            <div class="sc_1_1">
                                <span class="sc_1_1_movie_name" id="TITLE"><b><% %></b></span>
                            </div>
                        </div>
                        <div class="RATE sc_2" id="RATE">
                            <div class="sc_2_1">
                                <span class="sc_2_1_name">평점</span>
                            </div>
                            <div class="sc_2_2_star">
                                ☆☆☆☆☆
                            </div>
                            <div class="sc_2_3_age" >
                                <span class="sc_2_3_AGE"id="AGE">12세 관람가</span>
                            </div>
                        </div>
                        <div class="AGEdiv sc_3">
                            <button class="찜">
                                <div>♡     </div> 
                            </button>
                        </div>
                    </div>
                    <div class="details">
                        <dl>
                            <dt>
                                <span>개요</span> 
                            </dt>
                            <dd class="개요">
                                <p>
                                    <span class="span_1">코미디</span>
                                    <span class="span_2"> 미국</span>
                                    <span class="span_2">139분</span>
                                    <span class="span_2">2021.12.08 개봉</span>
                                </p>
                            </dd>
                            <dt class="director">감독</dt>
                            <dd>
                                <p>
                                    <span>
                                        김용화
                                    </span>
                                </p>
                            </dd>
                            <dt class="actor">배우</dt>
                            <dd>
                                <p>
                                    <span>하정우, </span>
                                    <span>차태현, </span>
                                    <span>주지훈 </span>
                                </p>
                            </dd>
                        </dl>
                    </div>
                    <div class="picture">
                        <div class="pic_1">
                            <button type="button" class="btn btn-outline-secondary" id="show"onclick=show();>예고편</button>
                            <button type="button" class="btn btn-outline-secondary" >사진</button>
                            <button type="button" class="btn btn-outline-secondary" id="show1" onclick=show1();>줄거리</button>
                        </div>
                    </div>
                </div>

                <div class="recommend">
                    <img src="캡처.PNG" alt="" class="recommend">
                </div>
            </div>
            <div class="container1 movie_re"> 
                <div class="m_1">
						<div class="comments">
						<div class="starpoint_wrap">
  <div class="starpoint_box">
    <label for="starpoint_1" class="label_star" title="0.5"><span class="blind">0.5점</span></label>
    <label for="starpoint_2" class="label_star" title="1"><span class="blind">1점</span></label>
    <label for="starpoint_3" class="label_star" title="1.5"><span class="blind">1.5점</span></label>
    <label for="starpoint_4" class="label_star" title="2"><span class="blind">2점</span></label>
    <label for="starpoint_5" class="label_star" title="2.5"><span class="blind">2.5점</span></label>
    <label for="starpoint_6" class="label_star" title="3"><span class="blind">3점</span></label>
    <label for="starpoint_7" class="label_star" title="3.5"><span class="blind">3.5점</span></label>
    <label for="starpoint_8" class="label_star" title="4"><span class="blind">4점</span></label>
    <label for="starpoint_9" class="label_star" title="4.5"><span class="blind">4.5점</span></label>
    <label for="starpoint_10" class="label_star" title="5"><span class="blind">5점</span></label>
    <input type="radio" name="starpoint" id="starpoint_1" class="star_radio">
    <input type="radio" name="starpoint" id="starpoint_2" class="star_radio">
    <input type="radio" name="starpoint" id="starpoint_3" class="star_radio">
    <input type="radio" name="starpoint" id="starpoint_4" class="star_radio">
    <input type="radio" name="starpoint" id="starpoint_5" class="star_radio">
    <input type="radio" name="starpoint" id="starpoint_6" class="star_radio">
    <input type="radio" name="starpoint" id="starpoint_7" class="star_radio">
    <input type="radio" name="starpoint" id="starpoint_8" class="star_radio">
    <input type="radio" name="starpoint" id="starpoint_9" class="star_radio">
    <input type="radio" name="starpoint" id="starpoint_10" class="star_radio">
    <span class="starpoint_bg"></span>
  </div>
</div>
							<!-- 원글에 댓글을 작성할 수 있는 폼 -->
								<div class="comment_form">
								<form action="comment_insert.do" method="post"> 
								<!-- 댓글의 그룹번호는 원글의 글번호가 된다. -->
								<input type="hidden" name="ref_group" value="${dto.num }"/>
								<!-- 댓글의 대상자는 원글의 작성자가 된다. -->
								<input type="hidden" name="target_id" value="${dto.writer }"/>
								<textarea rows="content"><c:if test="${empty id }">로그인이 필요합니다.</c:if></textarea>
				<button type="submit">등록</button>
            </form>
		</div>
   </div>
                </div>
            </div>
              

            
        </section>
</body>
</html>

