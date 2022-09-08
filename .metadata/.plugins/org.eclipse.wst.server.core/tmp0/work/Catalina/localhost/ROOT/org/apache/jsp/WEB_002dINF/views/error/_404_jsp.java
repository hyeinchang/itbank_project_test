/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-08-25 12:15:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.error;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _404_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <section class=\"post-wrapper-top\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("        <ul class=\"breadcrumb\">\r\n");
      out.write("          <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("          <li>404 - Not Found</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <h2>404 - NOT FOUND</h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("        <!-- search -->\r\n");
      out.write("        <div class=\"search-bar\">\r\n");
      out.write("          <form action=\"\" method=\"get\">\r\n");
      out.write("            <fieldset>\r\n");
      out.write("              <input type=\"image\" src=\"img/pixel.gif\" class=\"searchsubmit\" alt=\"\" />\r\n");
      out.write("              <input type=\"text\" class=\"search_text showtextback\" name=\"s\" id=\"s\" value=\"Search...\" />\r\n");
      out.write("            </fieldset>\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- / end div .search-bar -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- end post-wrapper-top -->\r\n");
      out.write("\r\n");
      out.write("  <section class=\"section1\">\r\n");
      out.write("    <div class=\"container clearfix\">\r\n");
      out.write("      <div class=\"content col-lg-12 col-md-12 col-sm-12 clearfix\">\r\n");
      out.write("        <div class=\"notfound\">\r\n");
      out.write("          <h1 class=\"big-title\">Are you lost?</h1>\r\n");
      out.write("          <h4 class=\"small-title\">The page you are looking for no longer exists.<br>\r\n");
      out.write("        Perhaps you can return back to the site's homepage and see if you can find what you are looking for.</h4>\r\n");
      out.write("          <a class=\"button\" href=\"index.html\">BACK TO HOME</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end message -->\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- end content -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- end container -->\r\n");
      out.write("  </section>\r\n");
      out.write("  <!-- end section -->");
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