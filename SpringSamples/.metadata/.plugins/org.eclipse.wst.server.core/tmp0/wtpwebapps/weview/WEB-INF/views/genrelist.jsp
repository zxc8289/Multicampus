<%@page import="weview.dto.ListDto"%>
<%@page import="java.util.List"%>
<%@ include file="../inc.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	List<ListDto> genrelist = (List<ListDto>) request.getAttribute("genrelist");
	List<ListDto> colist = (List<ListDto>) request.getAttribute("colist");
	List<ListDto> rolist = (List<ListDto>) request.getAttribute("rolist");
	List<ListDto> alist = (List<ListDto>) request.getAttribute("alist");
	List<ListDto> sflist = (List<ListDto>) request.getAttribute("sflist");
	List<ListDto> flist = (List<ListDto>) request.getAttribute("flist");
	List<ListDto> tlist = (List<ListDto>) request.getAttribute("tlist");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />


<title>Weview - 장르목록</title>
</head>
<body>
	<jsp:include page="includes/navigation.jsp" />
	<!-- 네비게이션 -->

<div style="text-align: center; padding-top: 3em !important;">
	<h1 style="color: #FF6F61;">모든 장르 한 눈에 보기!</h1>
</div>
	


	<!-- Header-->

	<!-- Section-->
	
	<section>
		<div class="container px-4 px-lg-5 mt-5">
			<!-- 추천 div 시작 -->
			<h4>코미디</h4>
			<div
				class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">

				<!--// 하나의 추천 항목 -->
<%
	if(colist != null || colist.size() != 0)
	{
		for(int i = 0; i < colist.size(); i++)
		{
			ListDto dto = colist.get(i);
%>
						
				<div class="col mb-5">
					<div class="card h-100">
						<!-- Product image-->	
						
						<a href="detailpage.do"> <img class="card-img-top"
							src="resources<%=dto.getPoster() %>"
							alt="..." />
						</a>
						<!-- Product details-->
						<div class="card-body p-4">
							<div class="text-center">
								<!-- Product name-->
								<a href="detailpage.do">
									<h5 class="fw-bolder"><%=dto.getTitle() %></h5>
								</a>
								<p><%=dto.getCreated().substring(0, 4) %> · <%=dto.getCountry() %> · <%=dto.getGenre() %></p>
								<div
									class="d-flex justify-content-center small text-warning mb-2">
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
				
<%
		}
	}
%>
			</div>
		</div>
		<!-- 추천 div 끝 -->


		<div class="container px-4 px-lg-5 mt-5">
			<h4>로맨스</h4>
			<div
				class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">

<%
	if(rolist != null || rolist.size() != 0)
	{
		for(int i = 0; i < rolist.size(); i++)
		{
			ListDto dto = rolist.get(i);
%>				
				
				<div class="col mb-5">
					<div class="card h-100">
						<!-- Product image-->
						<a href="detailpage.do"> <img class="card-img-top"
							src="resources<%=dto.getPoster() %>"
							alt="..." />
						</a>
						<!-- Product details-->
						<div class="card-body p-4">
							<div class="text-center">
								<!-- Product name-->
								<a href="detailpage.do">
									<h5 class="fw-bolder"><%=dto.getTitle() %></h5>
								</a>
								<p><%=dto.getCreated().substring(0, 4) %> · <%=dto.getCountry() %> · <%=dto.getGenre() %></p>
								<div
									class="d-flex justify-content-center small text-warning mb-2">
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
<%
		}
	}
%>
				
				<!-- 끝 -->
			</div>
		</div>
		
		
		<div class="container px-4 px-lg-5 mt-5">
			<h4>액션</h4>
			<div
				class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
<%
if(alist != null || alist.size() != 0)
{
    for(int i = 0; i < alist.size(); i++)
    {
        ListDto dto = alist.get(i);
%>				
				
				
				<div class="col mb-5">
					<div class="card h-100">
						<!-- Product image-->
						<a href="detailpage.do"> <img class="card-img-top"
							src="resources<%=dto.getPoster() %>" 
							alt="..." />
						</a>
						<!-- Product details-->
						<div class="card-body p-4">
							<div class="text-center">
								<!-- Product name-->
								<a href="detailpage.do">
									<h5 class="fw-bolder"><%=dto.getTitle() %></h5>
								</a>
								<p><%=dto.getCreated().substring(0, 4) %> · <%=dto.getCountry() %>  · <%=dto.getGenre() %></p>
								<div
									class="d-flex justify-content-center small text-warning mb-2">
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
<%
		}
	}
%>
					
			
			</div>
		</div>
			<!-- 끝 -->
		
		<div class="container px-4 px-lg-5 mt-5">
			<h4>SF</h4>
			<div
				class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
<%
if(sflist != null || sflist.size() != 0)
{
    for(int i = 0; i < sflist.size(); i++)
    {
        ListDto dto = sflist.get(i);
%>				
							
				
				<div class="col mb-5">
					<div class="card h-100">
						<!-- Product image-->
						<a href="detailpage.do"> <img class="card-img-top"
							src="resources<%=dto.getPoster() %>"
							alt="..." />
						</a>
						<!-- Product details-->
						<div class="card-body p-4">
							<div class="text-center">
								<!-- Product name-->
								<a href="detailpage.do">
									<h5 class="fw-bolder"><%=dto.getTitle() %></h5>
								</a>
								<p><%=dto.getCreated().substring(0, 4) %>  ·  <%=dto.getCountry() %> · <%=dto.getGenre() %></p>
								<div
									class="d-flex justify-content-center small text-warning mb-2">
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
<%
		}
	}
%>
					
			</div>
		</div>
		
		<!-- 끝 -->
		<div class="container px-4 px-lg-5 mt-5">
			<h4>판타지</h4>
			<div
				class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">				
<%
if(flist != null || flist.size() != 0)
{
    for(int i = 0; i < flist.size(); i++)
    {
        ListDto dto = flist.get(i);
%>				
				
				<div class="col mb-5">
					<div class="card h-100">
						<!-- Product image-->
						<a href="detailpage.do"> <img class="card-img-top"
							src="resources<%=dto.getPoster() %>"
							alt="..." />
						</a>
						<!-- Product details-->
						<div class="card-body p-4">
							<div class="text-center">
								<!-- Product name-->
								<a href="detailpage.do">
									<h5 class="fw-bolder"><%=dto.getTitle() %></h5>
								</a>
								<p><%=dto.getCreated().substring(0, 4) %> · <%=dto.getCountry() %> · <%=dto.getGenre() %></p>
								<div
									class="d-flex justify-content-center small text-warning mb-2">
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
<%
		}
	}
%>				
				
			</div>
		</div>
		
		<!-- 끝 -->
		<div class="container px-4 px-lg-5 mt-5">
			<h4>스릴러</h4>
			<div
				class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
<%
if(tlist != null || tlist.size() != 0)
{
    for(int i = 0; i < tlist.size(); i++)
    {
        ListDto dto = tlist.get(i);
%>

				<div class="col mb-5">
					<div class="card h-100">
						<!-- Product image-->
						<a href="detailpage.do"> <img class="card-img-top"
							src="resources<%=dto.getPoster() %>"
							alt="..." />
						</a>
						<!-- Product details-->
						<div class="card-body p-4">
							<div class="text-center">
								<!-- Product name-->
								<a href="detailpage.do">
									<h5 class="fw-bolder"><%=dto.getTitle() %></h5>
								</a>
								<p><%=dto.getCreated().substring(0, 4) %> · <%=dto.getCountry() %> · <%=dto.getGenre() %></p>
								<div
									class="d-flex justify-content-center small text-warning mb-2">
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
<%
		}
	}
%>						
		
			</div>
		</div>
		
		<!-- 끝 -->		
	</section>
	<!-- Footer-->
	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">Copyright &copy; Your
				Website 2021</p>
		</div>
	</footer>
	<!-- Bootstrap core JS-->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
</body>
</html>
