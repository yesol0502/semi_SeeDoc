/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-07-13 12:58:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1594081654000L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1594080906000L));
  }

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
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
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
      out.write("                <a href=\"\"><img src=\"");
      out.print(request.getContextPath() );
      out.write("/img/logo.png\" alt=\"\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <nav>\r\n");
      out.write("\r\n");
      out.write("                <ul>\r\n");
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
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/member/edit-info\">\r\n");
      out.write("                        <li>회원정보수정</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <a href=\"");
      out.print(request.getContextPath());
      out.write("/member/mypage\">\r\n");
      out.write("                        <li>예약내역</li>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"sub-bar\"></div>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/mypage.css\">\r\n");
      out.write("<section>\r\n");
      out.write("<script>\r\n");
      out.write("function writeReview(){\t\r\n");
      out.write("\tlet url = \"");
      out.print( request.getContextPath() );
      out.write("/board/writeReview\";\r\n");
      out.write("\tlet title = \"updatePasswordPopup\";\r\n");
      out.write("\tlet spec = \"left=500px, top=200px, width=500px, height=530px\";\r\n");
      out.write("\t\r\n");
      out.write("\topen(url, title, spec);\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("        <div class=\"profile-wrap\">\r\n");
      out.write("            <div class=\"profile\">\r\n");
      out.write("                <img src=\"../img/person1.png\" alt=\"\">\r\n");
      out.write("                <h1>씨닥터님</h1>\r\n");
      out.write("                <p>SeeDoc0629</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"res-result\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <img src=\"../img/mypage-1.png\" alt=\"\">\r\n");
      out.write("                    <p>전체</p>\r\n");
      out.write("                    <h1>12</h1>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <img src=\"../img/mypage-2.png\" alt=\"\">\r\n");
      out.write("                    <p>이용예정</p>\r\n");
      out.write("                    <h1>7</h1>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <img src=\"../img/mypage-3.png\" alt=\"\">\r\n");
      out.write("                    <p>이용완료</p>\r\n");
      out.write("                    <h1>3</h1>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <img src=\"../img/mypage-4.png\" alt=\"\">\r\n");
      out.write("                    <p>취소</p>\r\n");
      out.write("                    <h1>2</h1>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"res-wrap\">\r\n");
      out.write("            <h1><span>●</span> 내 예약</h1>\r\n");
      out.write("            <div class=\"res-card\">\r\n");
      out.write("                <div class=\"res-type\">\r\n");
      out.write("                    <img src=\"../img/mypage-3.png\" alt=\"\">\r\n");
      out.write("                    <p>이용완료</p>\r\n");
      out.write("                    <input type=\"button\" value=\"리뷰작성\" class=\"review-btn\"\r\n");
      out.write("                    onclick=\"writeReview()\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"res-main\">\r\n");
      out.write("                    <p class=\"res-no\">No.20200628</p>\r\n");
      out.write("                    <h1>서울삼성병원 - 가나다 교수</h1>\r\n");
      out.write("                    <p>일정 : 2020.06.26(금) 오후 4:00</p>\r\n");
      out.write("                    <p>진료 : 이비인후과</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"res-card\">\r\n");
      out.write("                <div class=\"res-type\">\r\n");
      out.write("                    <img src=\"../img/mypage-3.png\" alt=\"\">\r\n");
      out.write("                    <p>이용완료</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"res-main\">\r\n");
      out.write("                    <p class=\"res-no\">No.20200628</p>\r\n");
      out.write("                    <h1>서울삼성병원 - 가나다 교수</h1>\r\n");
      out.write("                    <p>일정 : 2020.06.26(금) 오후 4:00</p>\r\n");
      out.write("                    <p>진료 : 이비인후과</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"paging\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"7px\"\r\n");
      out.write("                        height=\"11px\">\r\n");
      out.write("                        <path fill-rule=\"evenodd\" fill=\"rgb(55, 59, 68)\"\r\n");
      out.write("                            d=\"M0.818,4.634 C1.177,4.275 1.758,4.275 2.117,4.634 L6.014,8.531 C6.372,8.889 6.372,9.471 6.014,9.830 C5.655,10.188 5.074,10.188 4.715,9.830 L0.818,5.933 C0.459,5.574 0.459,4.993 0.818,4.634 Z\" />\r\n");
      out.write("                        <path fill-rule=\"evenodd\" fill=\"rgb(55, 59, 68)\"\r\n");
      out.write("                            d=\"M0.818,5.067 L4.715,1.170 C5.074,0.812 5.655,0.812 6.014,1.170 C6.372,1.529 6.372,2.110 6.014,2.469 L2.117,6.366 C1.758,6.725 1.177,6.725 0.818,6.366 C0.459,6.007 0.459,5.426 0.818,5.067 Z\" />\r\n");
      out.write("                    </svg>\r\n");
      out.write("                </a>\r\n");
      out.write("                <a href=\"#\" style=\"font-weight: 800;\">1</a>\r\n");
      out.write("                <a href=\"#\">2</a>\r\n");
      out.write("                <a href=\"#\">3</a>\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" width=\"7px\"\r\n");
      out.write("                        height=\"11px\">\r\n");
      out.write("                        <path fill-rule=\"evenodd\" fill=\"rgb(55, 59, 68)\"\r\n");
      out.write("                            d=\"M6.026,6.397 C5.667,6.756 5.085,6.756 4.727,6.397 L0.830,2.500 C0.471,2.142 0.471,1.560 0.830,1.201 C1.189,0.843 1.770,0.843 2.129,1.201 L6.026,5.098 C6.384,5.457 6.384,6.038 6.026,6.397 Z\" />\r\n");
      out.write("                        <path fill-rule=\"evenodd\" fill=\"rgb(55, 59, 68)\"\r\n");
      out.write("                            d=\"M6.026,5.964 L2.129,9.861 C1.770,10.220 1.189,10.220 0.830,9.861 C0.471,9.502 0.471,8.920 0.830,8.562 L4.727,4.665 C5.085,4.306 5.667,4.306 6.026,4.665 C6.384,5.024 6.384,5.605 6.026,5.964 Z\" />\r\n");
      out.write("                    </svg>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    ");
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