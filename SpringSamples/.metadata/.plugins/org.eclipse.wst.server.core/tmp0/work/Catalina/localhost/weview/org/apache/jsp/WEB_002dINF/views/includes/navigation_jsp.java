/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-01-20 04:51:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.includes;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navigation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	request.setCharacterEncoding("utf-8");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!-- 드롭다운 -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Navigation-->\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("	<div class=\"container px-4 px-lg-5\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"mainpage.do\"><span style=\"color: #FF6F61;\">We</span>View</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\" href=\"mainpage.do\">메인</a></li>\r\n");
      out.write("				<li class=\"nav-item\">\r\n");
      out.write("				<!-- 드롭다운 -->\r\n");
      out.write("					<div class=\"dropdown\">\r\n");
      out.write("						<!-- 전환 버튼 -->\r\n");
      out.write("						<button class=\"btn dropdown-toggle\" type=\"button\"\r\n");
      out.write("							id=\"dropdownMenuButton\" data-bs-display=\"static\"\r\n");
      out.write("							data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("							장르</button>\r\n");
      out.write("						<!-- 드롭 다운 메뉴ー -->\r\n");
      out.write("						<div class=\"dropdown-menu dropdown-menu-lg-end\"\r\n");
      out.write("							aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("							<a class=\"dropdown-item\" href=\"genrelist.do\">전체장르</a> <a class=\"dropdown-item\"\r\n");
      out.write("								href=\"comedy.do\">코미디</a> <a class=\"dropdown-item\" href=\"romance.do\">로맨스</a>\r\n");
      out.write("							<a class=\"dropdown-item\" href=\"action.do\">액션</a> <a\r\n");
      out.write("								class=\"dropdown-item\" href=\"sf.do\">SF</a> <a class=\"dropdown-item\"\r\n");
      out.write("								href=\"fantasy.do\">판타지</a> <a class=\"dropdown-item\"\r\n");
      out.write("								href=\"thriller.do\">스릴러</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\" href=\"reqlist.do\">요청</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	if(session.getAttribute("login") == null) {

      out.write("\r\n");
      out.write("	<li class=\"nav-item\"><a class=\"nav-link active\" href=\"login.do\">로그인</a></li>\r\n");

	}
	else
	{

      out.write("\r\n");
      out.write("	<li class=\"nav-item\"><a class=\"nav-link active\" href=\"logout.do\">로그아웃</a></li>\r\n");
      out.write("	<li class=\"nav-item\"><a class=\"nav-link active\" href=\"profile.do\">내 정보</a></li>\r\n");

	}

      out.write(" \r\n");
      out.write("				\r\n");
      out.write("			</ul>\r\n");
      out.write("			<form action=\"search.do\" method=\"GET\"\r\n");
      out.write("					class=\"form-inline my-2 my-lg-0\" style=\"margin-right: 10px; display: flex\">\r\n");
      out.write("				<input class=\"form-control mr-sm-2\" type=\"search\"\r\n");
      out.write("					placeholder=\"Search\" aria-label=\"Search\" name=\"keyword\" />\r\n");
      out.write("				<button class=\"btn btn-outline-dark\" type=\"submit\"\r\n");
      out.write("						style=\"width: 5em; margin-left: 0.5em;\">검색</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
