/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-08-26 10:04:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.tiles.template.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("  <section id=\"intro\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"ror\">\r\n");
      out.write("        <div class=\"col-md-8 col-md-offset-2\">\r\n");
      out.write("          <h1>A Bootstrap Template designed for all your business needs.</h1>\r\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <section class=\"section1\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"col-lg-4 col-md-4 col-sm-4\">\r\n");
      out.write("        <div class=\"servicebox text-center\">\r\n");
      out.write("          <div class=\"service-icon\">\r\n");
      out.write("            <div class=\"dm-icon-effect-1\" data-effect=\"slide-left\">\r\n");
      out.write("              <a href=\"#\" class=\"\"> <i class=\"active dm-icon fa fa-bars fa-3x\"></i> </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"servicetitle\">\r\n");
      out.write("              <h4>Responsive Layout</h4>\r\n");
      out.write("              <hr>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\"s standard dummy text ever since..</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- service-icon -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- servicebox -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- large-4 -->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-lg-4 col-md-4 col-sm-4\">\r\n");
      out.write("        <div class=\"servicebox text-center\">\r\n");
      out.write("          <div class=\"service-icon\">\r\n");
      out.write("            <div class=\"dm-icon-effect-1\" data-effect=\"slide-bottom\">\r\n");
      out.write("              <a href=\"#\" class=\"\"> <i class=\"active dm-icon fa fa-laptop fa-3x\"></i> </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"servicetitle\">\r\n");
      out.write("              <h4>Creative Design</h4>\r\n");
      out.write("              <hr>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\"s standard dummy text ever since..</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- service-icon -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- servicebox -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- large-4 -->\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-lg-4 col-md-4 col-sm-4\">\r\n");
      out.write("        <div class=\"servicebox text-center\">\r\n");
      out.write("          <div class=\"service-icon\">\r\n");
      out.write("            <div class=\"dm-icon-effect-1\" data-effect=\"slide-right\">\r\n");
      out.write("              <a href=\"#\" class=\"\"> <i class=\"active dm-icon fa fa-book fa-3x\"></i> </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"servicetitle\">\r\n");
      out.write("              <h4>Easy to Setup</h4>\r\n");
      out.write("              <hr>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\"s standard dummy text ever since..</p>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- service-icon -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- servicebox -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- large-4 -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end container -->\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- end section -->\r\n");
      out.write("  \r\n");
      out.write("  <section class=\"section1\">\r\n");
      out.write("    <div class=\"container clearfix\">\r\n");
      out.write("      <div class=\"content col-lg-8 col-md-8 col-sm-8 col-xs-12 clearfix\">\r\n");
      out.write("      	<div style=\"padding: 10px 0;border-bottom:1px solid;\">\r\n");
      out.write("          <h4>\r\n");
      out.write("          	<span>카페 검색</span>\r\n");
      out.write("          </h4>\r\n");
      out.write("          <div>\r\n");
      out.write("          	<form id=\"bbsearch\" class=\"form-inline\">\r\n");
      out.write("            	<input type=\"text\" class=\"form-control\" placeholder=\"검색할 카페명을 입력해주십시오.\" style=\"height:auto;margin-top:0;\">\r\n");
      out.write("            	<button type=\"button\" class=\"btn btn-primary\" style=\"padding: 3px 18px;margin-top:0;vertical-align:top;\">Search</button>\r\n");
      out.write("          	</form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div style=\"padding: 10px 0;\">\r\n");
      out.write("          <h4>\r\n");
      out.write("          	<span>카페 목록</span>\r\n");
      out.write("          </h4>\r\n");
      out.write("        </div>\r\n");
      out.write("        <table class=\"table table-striped effect-fade in\" data-effect=\"fade\" style=\"transition: all 0.7s ease-in-out 0s;\">\r\n");
      out.write("          <thead style=\"background: #2B2E31;color:#fff;\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>카페명</th>\r\n");
      out.write("              <th>소개</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </thead>\r\n");
      out.write("          <tbody>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>MaxFront Bootstrap Theme</td>\r\n");
      out.write("              <td>\r\n");
      out.write("              	No downloadable files found<br>\r\n");
      out.write("              	No downloadable files found<br>\r\n");
      out.write("                No downloadable files found<br>\r\n");
      out.write("              </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>Smart - Bootstrap Wordpress Theme</td>\r\n");
      out.write("              <td>1 Update Pending</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>Spot - GentsThemes Wordpress Theme</td>\r\n");
      out.write("              <td>No downloadable files found</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>MaxDash Bootstrap Theme</td>\r\n");
      out.write("              <td>Payment status is pending</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- end content -->\r\n");
      out.write("\r\n");
      out.write("      <div id=\"sidebar\" class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\" style=\"\">\r\n");
      out.write("          <h4 class=\"title\">\r\n");
      out.write("          	<span>로그인</span>\r\n");
      out.write("          </h4>\r\n");
      out.write("          <form id=\"loginform\" method=\"post\" name=\"loginform\" action=\"\">\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <div class=\"input-group\">\r\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"fa fa-user\"></i></span>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Username\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <div class=\"input-group\">\r\n");
      out.write("                <span class=\"input-group-addon\"><i class=\"fa fa-lock\"></i></span>\r\n");
      out.write("                <input type=\"password\" class=\"form-control\" placeholder=\"Password\">\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <div class=\"checkbox\">\r\n");
      out.write("                <label>\r\n");
      out.write("									<input type=\"checkbox\"> Remember me\r\n");
      out.write("								</label>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("              <button type=\"submit\" class=\"button\">Sign in</button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- end sidebar -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end container -->\r\n");
      out.write("  </section>\r\n");
      out.write("  \r\n");
      out.write("  <section class=\"section4 text-center\">\r\n");
      out.write("    <div class=\"general-title\">\r\n");
      out.write("      <h3>OUR BEST PRODUCTS</h3>\r\n");
      out.write("      <hr>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"portfolio-wrapper\">\r\n");
      out.write("      <div id=\"owl-demo\" class=\"owl-carousel\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <a data-rel=\"prettyPhoto\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_01.jpg\">\r\n");
      out.write("                        	<img class=\"lazyOwl\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_01.jpg\" data-src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_01.jpg\" alt=\"\">\r\n");
      out.write("                        	<div>\r\n");
      out.write("                                <small>Product Design</small>\r\n");
      out.write("                                <span>Project Name Here</span>\r\n");
      out.write("                                <i class=\"fa fa-search\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <a data-rel=\"prettyPhoto\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_02.jpg\">\r\n");
      out.write("                        	<img class=\"lazyOwl\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_02.jpg\" data-src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_02.jpg\" alt=\"\">\r\n");
      out.write("                        	<div>\r\n");
      out.write("                                <small>Product Design</small>\r\n");
      out.write("                                <span>Project Name Here</span>\r\n");
      out.write("                                <i class=\"fa fa-search\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <a href=\"single-portfolio-1.html\">\r\n");
      out.write("                        	<img class=\"lazyOwl\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_07.jpg\" data-src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_07.jpg\" alt=\"\">\r\n");
      out.write("                        	<div>\r\n");
      out.write("                                <small>Product Design</small>\r\n");
      out.write("                                <span>Project Name Here</span>\r\n");
      out.write("                                <i class=\"fa fa-link\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <a href=\"single-portfolio-1.html\">\r\n");
      out.write("                        	<img class=\"lazyOwl\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_05.jpg\" data-src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_05.jpg\" alt=\"\">\r\n");
      out.write("                        	<div>\r\n");
      out.write("                                <small>Product Design</small>\r\n");
      out.write("                                <span>Project Name Here</span>\r\n");
      out.write("                                <i class=\"fa fa-link\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <a data-rel=\"prettyPhoto\" href=\"img/portfolio_09.jpg\">\r\n");
      out.write("                        	<img class=\"lazyOwl\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_09.jpg\" data-src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_09.jpg\" alt=\"\">\r\n");
      out.write("                        	<div>\r\n");
      out.write("                                <small>Product Design</small>\r\n");
      out.write("                                <span>Project Name Here</span>\r\n");
      out.write("                                <i class=\"fa fa-search\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <a data-rel=\"prettyPhoto\" href=\"img/portfolio_10.jpg\">\r\n");
      out.write("                        	<img class=\"lazyOwl\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_10.jpg\" data-src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_10.jpg\" alt=\"\">\r\n");
      out.write("                        	<div>\r\n");
      out.write("                                <small>Product Design</small>\r\n");
      out.write("                                <span>Project Name Here</span>\r\n");
      out.write("                                <i class=\"fa fa-search\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"item\">\r\n");
      out.write("          <a data-rel=\"prettyPhoto\" href=\"img/portfolio_06.jpg\">\r\n");
      out.write("                        	<img class=\"lazyOwl\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_06.jpg\" data-src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/portfolio_06.jpg\" alt=\"\">\r\n");
      out.write("                        	<div>\r\n");
      out.write("                                <small>Product Design</small>\r\n");
      out.write("                                <span>Project Name Here</span>\r\n");
      out.write("                                <i class=\"fa fa-search\"></i>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- end owl-demo -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end portfolio-wrapper -->\r\n");
      out.write("    <a class=\"button large\" href=\"home3.html#\">VIEW ALL WORKS</a>\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- end section1 -->\r\n");
      out.write("\r\n");
      out.write("  <section class=\"section2\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"message text-center\">\r\n");
      out.write("        <h2 class=\"big-title\">Your <span>portfolio</span> should standout!</h2>\r\n");
      out.write("        <p class=\"small-title\">Lorem Ipsum is simply dummy text of the printing and typesetting industy has been the industry\"s standard.</p>\r\n");
      out.write("        <a class=\"button large\" href=\"#\">ABOUT OUR SERVICES</a> <a class=\" dmbutton large\" href=\"#\">CONTACT US TODAY</a>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- end message -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end container -->\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- end section2 -->\r\n");
      out.write("\r\n");
      out.write("  <section class=\"section1 text-center\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"general-title\">\r\n");
      out.write("        <h3>AFFORDABLE PRICES</h3>\r\n");
      out.write("        <hr>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\" data-effect=\"slide-bottom\">\r\n");
      out.write("          <div class=\"custom-box\">\r\n");
      out.write("            <div class=\"servicetitle\">\r\n");
      out.write("              <h4>Standard</h4>\r\n");
      out.write("              <hr>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"icn-main-container\">\r\n");
      out.write("              <span class=\"icn-container\">$25</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry.</p>\r\n");
      out.write("            <ul class=\"pricing\">\r\n");
      out.write("              <li>150 Mb Storage</li>\r\n");
      out.write("              <li>1 Domain</li>\r\n");
      out.write("              <li>2 Sub Domains</li>\r\n");
      out.write("              <li>3 MySQL DBs</li>\r\n");
      out.write("              <li>2 Emails</li>\r\n");
      out.write("              <li>WordPress Installation</li>\r\n");
      out.write("              <li>24/7 Support</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <a class=\"btn btn-primary\" href=\"#\">Order Now</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- end custombox -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end col-4 -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\" data-effect=\"slide-bottom\">\r\n");
      out.write("          <div class=\"custom-box\">\r\n");
      out.write("            <div class=\"servicetitle\">\r\n");
      out.write("              <h4>Mega Pack</h4>\r\n");
      out.write("              <hr>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"icn-main-container\">\r\n");
      out.write("              <span class=\"icn-container\">$55</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry.</p>\r\n");
      out.write("            <ul class=\"pricing\">\r\n");
      out.write("              <li>150 Mb Storage</li>\r\n");
      out.write("              <li>1 Domain</li>\r\n");
      out.write("              <li>2 Sub Domains</li>\r\n");
      out.write("              <li>3 MySQL DBs</li>\r\n");
      out.write("              <li>2 Emails</li>\r\n");
      out.write("              <li>WordPress Installation</li>\r\n");
      out.write("              <li>24/7 Support</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <a class=\"btn btn-primary\" href=\"#\">Order Now</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- end custombox -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end col-4 -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-lg-4 col-md-4 col-sm-4 col-xs-12\" data-effect=\"slide-bottom\">\r\n");
      out.write("          <div class=\"custom-box\">\r\n");
      out.write("            <div class=\"servicetitle\">\r\n");
      out.write("              <h4>Ultra Pack</h4>\r\n");
      out.write("              <hr>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"icn-main-container\">\r\n");
      out.write("              <span class=\"icn-container\">$98</span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry.</p>\r\n");
      out.write("            <ul class=\"pricing\">\r\n");
      out.write("              <li>150 Mb Storage</li>\r\n");
      out.write("              <li>1 Domain</li>\r\n");
      out.write("              <li>2 Sub Domains</li>\r\n");
      out.write("              <li>3 MySQL DBs</li>\r\n");
      out.write("              <li>2 Emails</li>\r\n");
      out.write("              <li>WordPress Installation</li>\r\n");
      out.write("              <li>24/7 Support</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <a class=\"btn btn-primary\" href=\"#\">Order Now</a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- end custombox -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end col-4 -->\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end container -->\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- end section1 -->\r\n");
      out.write("\r\n");
      out.write("  <section class=\"section3\">\r\n");
      out.write("    <div class=\"container withpadding\">\r\n");
      out.write("      <div class=\"message\">\r\n");
      out.write("        <div class=\"col-lg-9 col-md-9 col-sm-9\">\r\n");
      out.write("          <h3>Grab the attention of your customers!</h3>\r\n");
      out.write("          <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\"s standard dummy text ever since the 1500s..</p>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-lg-3 col-md-3 col-sm-12\">\r\n");
      out.write("          <a class=\"dmbutton button large pull-right\" href=\"#\"><i class=\"fa fa-download\"></i> GET A QUOTE</a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- end message -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end container -->\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- end section3 -->");
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
