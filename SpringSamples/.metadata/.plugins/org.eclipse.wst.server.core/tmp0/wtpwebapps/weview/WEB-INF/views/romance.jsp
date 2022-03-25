<%@page import="weview.dto.ListDto"%>
<%@page import="java.util.List"%>
<%@ include file="../inc.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%List<ListDto> roinlist = (List<ListDto>) request.getAttribute("roinlist"); %>       
    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />

<title>Weview - 로맨스</title>
</head>
<body>
<jsp:include page="includes/navigation.jsp" /> <!-- 네비게이션 -->

<div style="text-align: center; padding-top: 3em !important;">
	<h1 style="color: #FF6F61;">꿀 떨어지듯 달달한 로맨스!</h1>
</div>


 
 <!-- Header-->
       
        <!-- Section-->
  		
  	  		<!-- 추천 div 시작 로맨스-->
  	<section>	
  		  <div class="container px-4 px-lg-5 mt-5">               
          <div 
          class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
                    
        <!--// 하나의 추천 항목 -->
<%
	if(roinlist != null || roinlist.size() != 0)
	{
		for(int i = 0; i < roinlist.size(); i++)
		{
			ListDto dto = roinlist.get(i);
%>                    
                    
                    
                    <div class="col mb-5">
                        <div class="card h-100">
                            <!-- Product image-->
                            
                            
                             <a href="detailpage.do">
                            <img class="card-img-top" 
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