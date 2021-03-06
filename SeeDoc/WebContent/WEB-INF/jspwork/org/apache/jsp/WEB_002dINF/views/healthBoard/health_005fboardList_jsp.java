/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-07-20 11:05:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.healthBoard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.service.MemberService;
import healthBoard.model.vo.HealthBoard;
import java.util.List;
import member.model.service.MemberService;
import member.model.vo.User;
import hospital.model.vo.Hospital;

public final class health_005fboardList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1595158624000L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1595220082000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.service.MemberService");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("healthBoard.model.vo.HealthBoard");
    _jspx_imports_classes.add("member.model.vo.User");
    _jspx_imports_classes.add("hospital.model.vo.Hospital");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	User userLoggedIn = (User)session.getAttribute("userLoggedIn");
	Cookie[] cookies2 = request.getCookies();
	boolean saveUserIdChecked = false;
	String saveUserIdValue = "";
	if(cookies2 != null) {
		for(Cookie c : cookies2) {
			String k = c.getName();
			String v = c.getValue();

			if("saveUserId".equals(k)) {
				saveUserIdChecked = true;
				saveUserIdValue = v;
			}
		}
	}
	
	
	
	Hospital hospLoggedIn = (Hospital)session.getAttribute("hospLoggedIn");
	//쿠키관련
	Cookie[] cookies = request.getCookies();
	boolean saveHospIdChecked = false;
	String saveHospIdValue = "";
	if(cookies != null) {
		for(Cookie c : cookies) {
			String k = c.getName();
			String v = c.getValue();

			if("saveHospId".equals(k)) {
				saveHospIdChecked = true;
				saveHospIdValue = v;
			}
		}
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>See Doctor</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/header.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/footer.css\" />\r\n");
      out.write("<script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-3.5.1.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"top-bar\">\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath() );
      out.write("\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/img/logo.png\" alt=\"\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <ul>\r\n");
      out.write("                ");
if(hospLoggedIn == null && userLoggedIn == null) { 
      out.write("\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath() );
      out.write("\">\r\n");
      out.write("                        <li style=\"color:white\">홈</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/member/login\">\r\n");
      out.write("                        <li>로그인</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/member/register\">\r\n");
      out.write("                        <li>회원가입</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                ");
 } else if(hospLoggedIn != null) { 
      out.write("\r\n");
      out.write("                \t<a href=\"");
      out.print(request.getContextPath());
      out.write("/hospital/hospital?hospId=");
      out.print( hospLoggedIn.getHospId() );
      out.write("\"><span class=\"login1\"><strong>");
      out.print( hospLoggedIn.getHospName() );
      out.write("</strong></span></a>\r\n");
      out.write("                \t<a href=\"");
      out.print(request.getContextPath());
      out.write("/hospital/logout\">\r\n");
      out.write("                \t\t<li>로그아웃</li>\r\n");
      out.write("                \t</a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/hospital/edit-info?hospId=");
      out.print( hospLoggedIn.getHospId() );
      out.write("\">\r\n");
      out.write("                        <li>병원정보수정</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/hospital/doctorList?hospId=");
      out.print( hospLoggedIn.getHospId() );
      out.write("\">\r\n");
      out.write("                        <li>의사보기</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <!-- 2/15 -->\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/booking/bookingHopitalList?hospId=");
      out.print( hospLoggedIn.getHospId() );
      out.write("\"> <!-- ts -->\r\n");
      out.write("                        <li>예약내역(병원)</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                 ");
}else if(userLoggedIn!=null&&userLoggedIn.getUserRole().equals(MemberService.MEMBER_ROLE_ADMIN)){ 
      out.write("   \r\n");
      out.write("                    <span class=\"login1\"><strong>");
      out.print( userLoggedIn.getUserName());
      out.write("</strong></span>\r\n");
      out.write("                \t<a href=\"");
      out.print(request.getContextPath());
      out.write("/member/logout\">\r\n");
      out.write("                \t\t<li>로그아웃</li>\r\n");
      out.write("                \t</a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/memberList\">\r\n");
      out.write("                        <li>회원조회</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/hospList\">\r\n");
      out.write("                        <li>병원조회</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    \r\n");
      out.write("                ");
 } else { 
      out.write("\r\n");
      out.write("                \t<span class=\"login1\"><strong>");
      out.print( userLoggedIn.getUserName());
      out.write("</strong></span>\r\n");
      out.write("                \t<a href=\"");
      out.print(request.getContextPath());
      out.write("/member/logout\">\r\n");
      out.write("                \t\t<li>로그아웃</li>\r\n");
      out.write("                \t</a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/member/edit-info?userId=");
      out.print( userLoggedIn.getUserId());
      out.write("\">\r\n");
      out.write("                        <li>회원정보수정</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <!-- 2/15 -->\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/booking/bookinglist?userId=");
      out.print( userLoggedIn.getUserId() );
      out.write("\"> <!-- ts -->\r\n");
      out.write("                        <li>예약내역</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"sub-bar\"></div>\r\n");
      out.write('\r');
      out.write('\n');

	List<HealthBoard> list = (List)request.getAttribute("list");
	String pageBar = (String)request.getAttribute("pageBar");
	

      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/healthBoard.css\">\r\n");
      out.write("<script>\r\n");
      out.write("$(function () {\r\n");
      out.write("\t$(\"#searchType\").change(function () {\r\n");
      out.write("\t\t$(\"#search-boardTitle, #search-boardWriter, #search-boardDate\").hide();\r\n");
      out.write("\t\t$(\"#search-\"+$(this).val()).css(\"display\",\"inline-block\");\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<section>\r\n");
      out.write("\t<h1>건강상식 게시판</h1>\r\n");
      out.write("\t<table class=\"bbc\">\r\n");
      out.write("\t\t<thead>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"width: 100px\">No</th>\r\n");
      out.write("\t\t\t\t<th colspan=\"6\">제목</th>\r\n");
      out.write("\t\t\t\t<th>\r\n");
      out.write("\t\t\t\t작성자</th>\r\n");
      out.write("\t\t\t\t<th>작성날짜</th>\r\n");
      out.write("\t\t\t\t<th>첨부파일</th>\r\n");
      out.write("\t\t\t\t<th>조회수</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</thead>\r\n");
      out.write("\t\t<tbody>\r\n");
      out.write("\t\t\t");
if(list ==null || list.isEmpty()){ 
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th colspan=\"6\">게시물이 없습니다.</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
}else{
				for(HealthBoard hb : list){
			
      out.write("\r\n");
      out.write("\t\t\t<tr class=\"list-back\">\r\n");
      out.write("\t\t\t\t<td style=\"color:#3c71bf; font-weight: bold;font-size: 19px \">");
      out.print(hb.getBoardNo());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td colspan=\"6\" class=\"title1\"><a class=\"title2\" href=\"");
      out.print(request.getContextPath());
      out.write("/healthBoard/healthBoardView?healthBoardNo=");
      out.print(hb.getBoardNo());
      out.write('"');
      out.write('>');
      out.print(hb.getBoardTitle());
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t");
if(hb.getBoardWriter().contains("admin")){ 
      out.write("\r\n");
      out.write("\t\t\t\t<td><svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"12pt\" height=\"12pt\" viewBox=\"0 0 12 12\" version=\"1.1\">\r\n");
      out.write("\t\t\t\t\t<g id=\"surface1\">\r\n");
      out.write("\t\t\t\t\t<path style=\" stroke:none;fill-rule:nonzero;fill:red;fill-opacity:1;\" d=\"M 5.25 4.5 C 5.042969 4.5 4.875 4.667969 4.875 4.875 C 4.875 5.082031 5.042969 5.25 5.25 5.25 C 5.457031 5.25 5.625 5.082031 5.625 4.875 C 5.625 4.667969 5.457031 4.5 5.25 4.5 Z M 10.933594 1.960938 L 6.433594 0.0859375 C 6.296875 0.0351562 6.148438 0.00390625 6 0 C 5.851562 0.00390625 5.707031 0.0351562 5.570312 0.0859375 L 1.070312 1.960938 C 0.648438 2.136719 0.375 2.546875 0.375 3 C 0.375 7.652344 3.058594 10.867188 5.566406 11.914062 C 5.84375 12.027344 6.15625 12.027344 6.429688 11.914062 C 8.441406 11.078125 11.625 8.1875 11.625 3 C 11.625 2.546875 11.351562 2.136719 10.933594 1.960938 Z M 9 6 L 8.714844 6 C 8.046875 6 7.714844 6.808594 8.1875 7.28125 L 8.386719 7.480469 C 8.53125 7.628906 8.53125 7.863281 8.386719 8.011719 C 8.238281 8.15625 8.003906 8.15625 7.855469 8.011719 L 7.65625 7.8125 C 7.183594 7.339844 6.375 7.671875 6.375 8.339844 L 6.375 8.625 C 6.375 8.832031 6.207031 9 6 9 C 5.792969 9 5.625 8.832031 5.625 8.625 L 5.625 8.339844 C 5.625 7.671875 4.816406 7.339844 4.34375 7.8125 L 4.144531 8.011719 C 3.996094 8.15625 3.761719 8.15625 3.613281 8.011719 C 3.46875 7.863281 3.46875 7.628906 3.613281 7.480469 L 3.816406 7.28125 C 4.285156 6.808594 3.953125 6 3.285156 6 L 3 6 C 2.792969 6 2.625 5.832031 2.625 5.625 C 2.625 5.417969 2.792969 5.25 3 5.25 L 3.285156 5.25 C 3.953125 5.25 4.285156 4.441406 3.8125 3.96875 L 3.613281 3.769531 C 3.46875 3.621094 3.46875 3.386719 3.613281 3.238281 C 3.761719 3.09375 3.996094 3.09375 4.144531 3.238281 L 4.34375 3.441406 C 4.816406 3.910156 5.625 3.578125 5.625 2.910156 L 5.625 2.625 C 5.625 2.417969 5.792969 2.25 6 2.25 C 6.207031 2.25 6.375 2.417969 6.375 2.625 L 6.375 2.910156 C 6.375 3.578125 7.183594 3.910156 7.65625 3.4375 L 7.855469 3.238281 C 8.003906 3.09375 8.238281 3.09375 8.386719 3.238281 C 8.53125 3.386719 8.53125 3.621094 8.386719 3.769531 L 8.1875 3.96875 C 7.714844 4.441406 8.046875 5.25 8.714844 5.25 L 9 5.25 C 9.207031 5.25 9.375 5.417969 9.375 5.625 C 9.375 5.832031 9.207031 6 9 6 Z M 6.75 6 C 6.542969 6 6.375 6.167969 6.375 6.375 C 6.375 6.582031 6.542969 6.75 6.75 6.75 C 6.957031 6.75 7.125 6.582031 7.125 6.375 C 7.125 6.167969 6.957031 6 6.75 6 Z M 6.75 6 \"/>\r\n");
      out.write("\t\t\t\t\t</g>\r\n");
      out.write("\t\t\t\t\t</svg>\r\n");
      out.write("\t\t\t\t\t");
      out.print(hb.getBoardWriter());
      out.write("</td>\r\n");
      out.write("\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<td><svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"10pt\" height=\"11pt\" viewBox=\"0 0 10 11\" version=\"1.1\">\r\n");
      out.write("\t\t\t\t\t<g id=\"surface1\">\r\n");
      out.write("\t\t\t\t\t<path style=\" stroke:none;fill-rule:nonzero;fill:#242d9a;fill-opacity:1;\" d=\"M 2.855469 5.242188 L 2.855469 4.382812 C 2.855469 4.242188 2.976562 4.125 3.125 4.125 L 4.019531 4.125 C 4.164062 4.125 4.285156 4.242188 4.285156 4.382812 L 4.285156 5.242188 C 4.285156 5.382812 4.164062 5.5 4.019531 5.5 L 3.125 5.5 C 2.976562 5.5 2.855469 5.382812 2.855469 5.242188 Z M 5.980469 5.5 L 6.875 5.5 C 7.023438 5.5 7.144531 5.382812 7.144531 5.242188 L 7.144531 4.382812 C 7.144531 4.242188 7.023438 4.125 6.875 4.125 L 5.980469 4.125 C 5.835938 4.125 5.714844 4.242188 5.714844 4.382812 L 5.714844 5.242188 C 5.714844 5.382812 5.835938 5.5 5.980469 5.5 Z M 4.285156 7.304688 L 4.285156 6.445312 C 4.285156 6.304688 4.164062 6.1875 4.019531 6.1875 L 3.125 6.1875 C 2.976562 6.1875 2.855469 6.304688 2.855469 6.445312 L 2.855469 7.304688 C 2.855469 7.445312 2.976562 7.5625 3.125 7.5625 L 4.019531 7.5625 C 4.164062 7.5625 4.285156 7.445312 4.285156 7.304688 Z M 5.980469 7.5625 L 6.875 7.5625 C 7.023438 7.5625 7.144531 7.445312 7.144531 7.304688 L 7.144531 6.445312 C 7.144531 6.304688 7.023438 6.1875 6.875 6.1875 L 5.980469 6.1875 C 5.835938 6.1875 5.714844 6.304688 5.714844 6.445312 L 5.714844 7.304688 C 5.714844 7.445312 5.835938 7.5625 5.980469 7.5625 Z M 10 10.226562 L 10 11 L 0 11 L 0 10.226562 C 0 10.085938 0.121094 9.96875 0.269531 9.96875 L 0.703125 9.96875 L 0.703125 1.828125 C 0.703125 1.578125 0.941406 1.375 1.238281 1.375 L 3.214844 1.375 L 3.214844 0.515625 C 3.214844 0.230469 3.453125 0 3.75 0 L 6.25 0 C 6.546875 0 6.785156 0.230469 6.785156 0.515625 L 6.785156 1.375 L 8.761719 1.375 C 9.058594 1.375 9.296875 1.578125 9.296875 1.828125 L 9.296875 9.96875 L 9.730469 9.96875 C 9.878906 9.96875 10 10.085938 10 10.226562 Z M 1.773438 9.945312 L 4.285156 9.945312 L 4.285156 8.507812 C 4.285156 8.367188 4.40625 8.25 4.554688 8.25 L 5.445312 8.25 C 5.59375 8.25 5.714844 8.367188 5.714844 8.507812 L 5.714844 9.945312 L 8.226562 9.945312 L 8.226562 2.40625 L 6.785156 2.40625 L 6.785156 2.921875 C 6.785156 3.207031 6.546875 3.4375 6.25 3.4375 L 3.75 3.4375 C 3.453125 3.4375 3.214844 3.207031 3.214844 2.921875 L 3.214844 2.40625 L 1.773438 2.40625 Z M 5.9375 1.375 L 5.355469 1.375 L 5.355469 0.816406 C 5.355469 0.746094 5.296875 0.6875 5.222656 0.6875 L 4.777344 0.6875 C 4.703125 0.6875 4.644531 0.746094 4.644531 0.816406 L 4.644531 1.375 L 4.0625 1.375 C 3.988281 1.375 3.929688 1.433594 3.929688 1.503906 L 3.929688 1.933594 C 3.929688 2.003906 3.988281 2.0625 4.0625 2.0625 L 4.644531 2.0625 L 4.644531 2.621094 C 4.644531 2.691406 4.703125 2.75 4.777344 2.75 L 5.222656 2.75 C 5.296875 2.75 5.355469 2.691406 5.355469 2.621094 L 5.355469 2.0625 L 5.9375 2.0625 C 6.011719 2.0625 6.070312 2.003906 6.070312 1.933594 L 6.070312 1.503906 C 6.070312 1.433594 6.011719 1.375 5.9375 1.375 Z M 5.9375 1.375 \"/>\r\n");
      out.write("\t\t\t\t\t</g>\r\n");
      out.write("\t\t\t\t\t</svg>\r\n");
      out.write("\t\t\t\t\t");
      out.print(hb.getBoardWriter());
      out.write("</td>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<td>");
      out.print(hb.getBoardDate());
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td style=\"padding: 0px\">\r\n");
      out.write("\t\t\t\t\t");
if(hb.getBoardOriginalFileName()!=null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t<svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"35pt\" height=\"35pt\" viewBox=\"0 0 35 35\" version=\"1.1\">\r\n");
      out.write("\t\t\t\t\t<g id=\"surface1\">\r\n");
      out.write("\t\t\t\t\t<path style=\" stroke:none;fill-rule:nonzero;fill:rgb(12.941176%,58.823529%,95.294118%);fill-opacity:1;\" d=\"M 6.777344 2.164062 C 6.539062 2.199219 5.925781 2.34375 5.691406 2.421875 C 4.917969 2.679688 4.0625 3.308594 3.542969 4.003906 C 3.058594 4.648438 2.871094 5.054688 2.695312 5.824219 C 2.640625 6.042969 2.585938 6.339844 2.574219 6.484375 C 2.53125 6.847656 2.53125 28.078125 2.570312 28.421875 C 2.636719 28.992188 2.839844 29.710938 3.058594 30.144531 C 3.347656 30.707031 3.863281 31.339844 4.335938 31.703125 C 4.964844 32.195312 5.398438 32.410156 6.121094 32.59375 C 6.828125 32.773438 5.875 32.757812 17.867188 32.757812 C 29.824219 32.757812 28.890625 32.773438 29.601562 32.597656 C 30.230469 32.441406 30.617188 32.265625 31.15625 31.886719 C 31.796875 31.441406 32.324219 30.820312 32.675781 30.117188 C 32.925781 29.613281 33.109375 28.964844 33.167969 28.351562 C 33.1875 28.160156 33.195312 24.488281 33.1875 17.253906 C 33.179688 7.089844 33.175781 6.425781 33.132812 6.207031 C 32.933594 5.25 32.746094 4.78125 32.300781 4.152344 C 32.015625 3.742188 31.6875 3.402344 31.304688 3.121094 C 30.710938 2.675781 30.292969 2.472656 29.640625 2.308594 C 28.878906 2.117188 29.859375 2.132812 17.828125 2.136719 C 11.835938 2.136719 6.863281 2.148438 6.777344 2.164062 Z M 26.886719 6.070312 C 27.597656 6.152344 28.355469 6.652344 28.738281 7.296875 C 28.894531 7.558594 29.03125 7.910156 29.066406 8.132812 C 29.085938 8.269531 29.09375 11.074219 29.089844 17.5 L 29.082031 26.671875 L 29 26.878906 C 28.722656 27.613281 28.296875 28.109375 27.6875 28.410156 C 27.347656 28.574219 27.203125 28.625 26.9375 28.660156 C 26.800781 28.675781 23.554688 28.683594 17.636719 28.679688 L 8.546875 28.671875 L 8.261719 28.570312 C 7.429688 28.269531 6.867188 27.703125 6.570312 26.867188 L 6.496094 26.648438 L 6.496094 8.105469 L 6.558594 7.914062 C 6.714844 7.453125 6.925781 7.109375 7.25 6.792969 C 7.5 6.546875 7.699219 6.410156 7.996094 6.273438 C 8.273438 6.152344 8.449219 6.097656 8.664062 6.070312 C 8.945312 6.039062 26.601562 6.039062 26.886719 6.070312 Z M 26.886719 6.070312 \"/>\r\n");
      out.write("\t\t\t\t\t<path style=\" stroke:none;fill-rule:nonzero;fill:rgb(12.941176%,58.823529%,95.294118%);fill-opacity:1;\" d=\"M 14.453125 10.175781 L 14.382812 10.230469 L 14.382812 17.910156 L 12.609375 17.910156 C 10.605469 17.910156 10.707031 17.898438 10.722656 18.109375 L 10.734375 18.226562 L 11.71875 18.90625 C 12.257812 19.277344 13.730469 20.292969 14.984375 21.160156 L 17.265625 22.734375 L 13.996094 22.75 C 10.828125 22.765625 10.722656 22.765625 10.667969 22.816406 C 10.609375 22.867188 10.609375 22.886719 10.609375 23.753906 C 10.609375 24.601562 10.613281 24.640625 10.664062 24.691406 C 10.71875 24.746094 10.753906 24.746094 17.878906 24.746094 L 25.039062 24.746094 L 25.089844 24.6875 C 25.140625 24.632812 25.144531 24.570312 25.152344 23.820312 C 25.160156 22.984375 25.144531 22.832031 25.050781 22.789062 C 25.027344 22.773438 23.5625 22.757812 21.796875 22.75 L 18.582031 22.734375 L 20.347656 21.519531 C 24.578125 18.597656 25.105469 18.230469 25.128906 18.167969 C 25.160156 18.085938 25.125 17.976562 25.050781 17.941406 C 25.015625 17.917969 24.421875 17.910156 23.230469 17.910156 L 21.464844 17.910156 L 21.464844 10.230469 L 21.394531 10.175781 C 21.320312 10.117188 21.320312 10.117188 17.921875 10.117188 C 14.527344 10.117188 14.527344 10.117188 14.453125 10.175781 Z M 14.453125 10.175781 \"/>\r\n");
      out.write("\t\t\t\t\t</g>\r\n");
      out.write("\t\t\t\t\t</svg>\r\n");
      out.write("\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(hb.getBoardReadCount());
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
  } 
			  }
			
      out.write("\r\n");
      out.write("\t\t</tbody>\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<br />\r\n");
      out.write("\t<input type=\"button\" value=\"글쓰기\" id=\"btn-add1\" onclick=\"location.href='");
      out.print(request.getContextPath());
      out.write("/healthBoard/healthBoardForm';\" style=\"display: none\" />\r\n");
      out.write("\t");
if(userLoggedIn!=null){ 
		if(MemberService.MEMBER_ROLE_ADMIN.equals(userLoggedIn.getUserRole())){
      out.write("\r\n");
      out.write("\t\t<script>$('#btn-add1').css('display','block');</script>\r\n");
      out.write("\t");
  } 
	  }else if(hospLoggedIn!=null ){
      out.write("\r\n");
      out.write("\t\t<script>$('#btn-add1').css('display','block');</script>\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t<div class=\"paging\" style=\"text-align: center;\">\r\n");
      out.write("\t\t");
      out.print(pageBar);
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"search-wrap\">\r\n");
      out.write("\t\t<select id=\"searchType\" name=\"cars\">\r\n");
      out.write("\t\t\t<option value=\"boardTitle\">제목</option>\r\n");
      out.write("\t\t\t<option value=\"boardWriter\">작성자</option>\r\n");
      out.write("\t\t\t<option value=\"boardDate\">작성날짜</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t<div id=\"search-boardTitle\" style=\"display: inline-block;\">\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/healthBoard/healthBoardFinder\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"searchType\" value=\"boardTitle\">\r\n");
      out.write("\t\t\t\t\t<input type=\"search\" name=\"searchKeyword\" placeholder=\"검색할 제목을 입력하시오.\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" id=\"btn-add2\" value=\"검 색\" style=\"float:none; margin-bottom: 50px; margin-left: 3px\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"search-boardWriter\" style=\"display: none\">\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/healthBoard/healthBoardFinder\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"searchType\" value=\"boardWriter\">\r\n");
      out.write("\t\t\t\t\t<input type=\"search\" name=\"searchKeyword\" placeholder=\"검색할 작성자를 입력하시오.\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" id=\"btn-add2\" value=\"검 색\" style=\"float:none; margin-bottom: 50px; margin-left: 3px\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"search-boardDate\" style=\"display: none\">\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/healthBoard/healthBoardFinder\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"searchType\" value=\"boardDate\">\r\n");
      out.write("\t\t\t\t\t<input type=\"date\" name=\"searchKeyword\" placeholder=\"검색할 날짜를 입력하시오.\" value=\"\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" id=\"btn-add2\" value=\"검 색\" style=\"float:none; margin-bottom: 50px; margin-left: 3px\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\t<footer>\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/docs/policy\">이용약관</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/docs/privacy\">개인정보처리방침</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/docs/biz\">사업자정보확인</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"");
      out.print(request.getContextPath());
      out.write("/bbc/cs\">고객센터</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <p>\r\n");
      out.write("            상호 : (주)씨닥 | 대표 : 씨닥 | 개인정보관리책임자 : KH | 전화 : 2588-2588 | 이메일 : khm0627@naver.com\r\n");
      out.write("            <Br />주소 : 서울특별시 강남구 역삼동 | 사업자등록번호 : 110-426-375674 | 통신판매 : 제 2020-서울강남-0922호 | 호스팅제공자 : (주)씨닥\r\n");
      out.write("            <br><br>\r\n");
      out.write("            Copyrighter ⓒ 2020 SeeDoc KH-m\r\n");
      out.write("        </p>\r\n");
      out.write("    </footer>\r\n");
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
