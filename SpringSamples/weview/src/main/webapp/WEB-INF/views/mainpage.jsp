<%@page import="weview.dto.MainDto"%>
<%@page import="java.util.List"%>
<%@ include file="../inc.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MainDto ranmov = (MainDto) request.getAttribute("ranmov");
	List<MainDto> obslist = (List<MainDto>) request.getAttribute("obs");
	List<MainDto> obdlist = (List<MainDto>) request.getAttribute("obd");
	List<MainDto> obrlist = (List<MainDto>) request.getAttribute("obr");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Weview - 메인</title>
        <style>
        	.ignore-atag:link, .ignore-atag:visited
        	{
        		color: white;
        		text-decoration: none;
        	}
        	.ignore-atag:hover
        	{
        		color: white;
        		text-decoration: underline;
        	}
        </style>
    </head>
    <body>
    <jsp:include page="includes/navigation.jsp" />
        <!-- Header-->
       
        <!-- Section-->
        
        <!-- 배너 -->
<%
	if(ranmov != null)
	{
%>
        <section>
        	<div>
        		<div class="banner-height " id="banner" 
        		style="background: linear-gradient(to left,
						            rgba(20, 20, 20, 0) 10%,
						            rgba(20, 20, 20, 0.25) 25%,
						            rgba(20, 20, 20, 0.5) 50%,
						            rgba(20, 20, 20, 0.75) 75%,
						            rgba(20, 20, 20, 1) 100%
						          ), url('resources<%=ranmov.getPoster().replaceAll("\\\\", "/") %>');
						background-size: contain"> <!-- 배경 이미지 flex -->
					<div class="container banner-display" 
					style="height: inherit;
						   padding: 2em;">
	        			<div>
	        				<h1 style="font-size: 5em;">
	        				<a href="http://localhost:8080/weview/detailpage.do?seq_movie=<%=ranmov.getSeq_movie()%>"
	        				class="ignore-atag"><%=ranmov.getTitle() %></a>
	        				</h1>
	        			</div><!-- 제목 -->
	        			<div><h3>주연</h3>
		        			<p style="font-size: 1.4em;">
		        				<%=ranmov.getActor().replaceAll("/", ", ") %> 등
		        			</p>
	        			</div><!-- 정보 -->
	        			<div><h3>줄거리</h3>
		        			<p style="font-size: 1.4em;">
		        				<%=ranmov.getStory() %>
		        			</p>
	        			</div><!-- 줄거리 -->
					</div>
        		</div>
        	</div>
        </section>
<%
	}
%>
        <!-- 배너 -->
        
        <!-- <h1 style="text-align: center; color: #FF6F61">추천 영화</h1> -->
        
        <section>
            <div class="container px-4 px-lg-5 mt-5">
                <h4>높은 평가를 받는 영화들!</h4>
                <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
                    
                    <!--// 하나의 추천 항목 -->
<%
	if(obslist != null && obslist.size() != 0)
	{
		for(int i = 0; i < obslist.size(); i++)
		{
			MainDto dto = obslist.get(i);
%>
                    <div class="col mb-5">
                        <div class="card h-100">
                            <!-- Product image-->
                            <a href="http://localhost:8080/weview/detailpage.do?seq_movie=<%=dto.getSeq_movie()%>">
                            	<img class="card-img-top" src="resources<%=dto.getPoster() %>" alt="..." />
                            </a>
                            <!-- Product details-->
                            <div class="card-body p-4">
                                <div class="text-center">
                                    <!-- Product name-->
                                    <h5 class="fw-bolder"><%=dto.getTitle() %></h5>
                                    <p><%=dto.getCreated().substring(0, 4) %> · <%=dto.getCountry() %> · <%=dto.getGenre() %></p>
                                    <div class="d-flex justify-content-center small text-warning mb-2">
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                    </div>
                                    <p style="font-size: 15px;">평균 <%=dto.getRate() %></p>
                                </div>
                            </div>
                            <!-- Product actions-->
                          
                        </div>
                    </div>
                    
                    <!-- 하나의 추천 항목 //-->
<%
		}
	}
%>
                </div>
            </div>
             <div class="container px-4 px-lg-5 mt-5">
                <h4>최신 영화 모음집!</h4>
              <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
<%
	if(obdlist != null && obdlist.size() != 0)
	{
		for(int i = 0; i < obdlist.size(); i++)
		{
			MainDto dto = obdlist.get(i);
%>
                    <div class="col mb-5">
                        <div class="card h-100">
                            <!-- Product image-->
                            <a href="http://localhost:8080/weview/detailpage.do?seq_movie=<%=dto.getSeq_movie()%>">
                            	<img class="card-img-top" src="resources<%=dto.getPoster() %>" alt="..." />
                            </a>
                            <!-- Product details-->
                            <div class="card-body p-4">
                                <div class="text-center">
                                    <!-- Product name-->
                                    <h5 class="fw-bolder"><%=dto.getTitle() %></h5>
                                    <p><%=dto.getCreated().substring(0, 4) %> · <%=dto.getCountry() %> · <%=dto.getGenre() %></p>
                                    <div class="d-flex justify-content-center small text-warning mb-2">
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                    </div>
                                    <p style="font-size: 15px;">평균 <%=dto.getRate() %></p>
                                </div>
                            </div>
                            <!-- Product actions-->
                          
                        </div>
                    </div>
                    
                    <!-- 하나의 추천 항목 //-->
<%
		}
	}
%>
              </div>
          </div>
             <div class="container px-4 px-lg-5 mt-5">
                <h4>긴 런닝타임의 영화가 보고 싶다면!</h4>
              <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
<%
	if(obrlist != null && obrlist.size() != 0)
	{
		for(int i = 0; i < obrlist.size(); i++)
		{
			MainDto dto = obrlist.get(i);
%>
                    <div class="col mb-5">
                        <div class="card h-100">
                            <!-- Product image-->
                            <a href="http://localhost:8080/weview/detailpage.do?seq_movie=<%=dto.getSeq_movie()%>">
                            	<img class="card-img-top" src="resources<%=dto.getPoster() %>" alt="..." />
                            </a>
                            <!-- Product details-->
                            <div class="card-body p-4">
                                <div class="text-center">
                                    <!-- Product name-->
                                    <h5 class="fw-bolder"><%=dto.getTitle() %></h5>
                                    <p><%=dto.getCreated().substring(0, 4) %> · <%=dto.getCountry() %> · <%=dto.getGenre() %></p>
                                    <div class="d-flex justify-content-center small text-warning mb-2">
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                        <div class="bi-star-fill"></div>
                                    </div>
                                    <p style="font-size: 15px;">평균 <%=dto.getRate() %></p>
                                    <p style="font-size: 17px; font-weight: bold; color: red;"><%=dto.getRunningtime() %>분</p>
                                </div>
                            </div>
                            <!-- Product actions-->
                          
                        </div>
                    </div>
                    
                    <!-- 하나의 추천 항목 //-->
<%
		}
	}
%>
              </div>
          </div>
        </section>
        <!-- Footer-->
        <footer class="py-5 bg-dark">
            <div class="container"><p class="m-0 text-center text-white">Copyright &copy; Your Website 2021</p></div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>