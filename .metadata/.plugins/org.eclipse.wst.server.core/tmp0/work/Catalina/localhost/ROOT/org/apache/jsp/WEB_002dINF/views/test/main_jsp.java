/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-08-26 06:56:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/오후취업반_chi9148/eclipse-jee-2020-06-R-win32-x86_64/project_workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/test/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1654911693999L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      out.write("\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<section class=\"post-wrapper-top\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("        <ul class=\"breadcrumb\">\r\n");
      out.write("          <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("          <li>Page Left Sidebar</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <h2>PAGE LEFT SIDEBAR</h2>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-lg-6 col-md-6 col-sm-6 col-xs-12\">\r\n");
      out.write("        <!-- search -->\r\n");
      out.write("        <div class=\"search-bar\">\r\n");
      out.write("          <form action=\"\" method=\"get\">\r\n");
      out.write("            <fieldset>\r\n");
      out.write("              <input type=\"image\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/MaxiBiz/img/pixel.gif\" class=\"searchsubmit\" alt=\"\" />\r\n");
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
      out.write("      <div class=\"content pull-right col-lg-8 col-md-8 col-sm-8 col-xs-12 clearfix\">\r\n");
      out.write("        <h2>Random Text Title</h2>\r\n");
      out.write("        <p> Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus aliquet erat quis nibh vehicula, condimentum placerat lectus iaculis. Nam ultricies nisi vel ligula pulvinar, quis dapibus velit iaculis. In hac habitasse platea dictumst. In vitae\r\n");
      out.write("          nunc tincidunt, euismod nibh sit amet, convallis arcu. Vestibulum feugiat auctor auctor. Phasellus lacinia auctor metus, in posuere justo egestas eget. Vivamus ornare tincidunt sagittis. Nunc pretium magna eu est condimentum malesuada. Nunc\r\n");
      out.write("          arcu nulla, fringilla in sodales sed, laoreet eget mi. Fusce ac suscipit turpis, sed porttitor mauris. </p>\r\n");
      out.write("        <img class=\"img-resposnive\" src=\"img/demo_01.jpg\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("        <p> Integer convallis justo augue, et condimentum tortor scelerisque ut. Ut mattis ullamcorper lacinia. Donec dignissim eu dui non ultrices. Fusce ullamcorper suscipit ante, eget ultrices ipsum faucibus sagittis. Nunc eu elit orci. Etiam id orci vitae\r\n");
      out.write("          mauris bibendum molestie sit amet sed neque. Cras malesuada vulputate orci sed molestie. Phasellus accumsan nunc sit amet egestas suscipit. Duis non ipsum ac risus consequat dapibus placerat sed dui. Sed vitae risus scelerisque purus euismod\r\n");
      out.write("          ornare. Phasellus ultricies ante vitae molestie adipiscing. </p>\r\n");
      out.write("        <div class=\"clearfix\"></div>\r\n");
      out.write("        <blockquote>\r\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\r\n");
      out.write("          <small>Someone famous in <cite title=\"Source Title\">Source Title</cite></small>\r\n");
      out.write("        </blockquote>\r\n");
      out.write("        <div class=\"clearfix\"></div>\r\n");
      out.write("        <p>Sed rutrum ac leo vel aliquet. Fusce vehicula orci vitae dui posuere, ac luctus tortor aliquam. Morbi ac cursus est. Nam arcu risus, tristique fringilla auctor luctus, congue id felis. Donec at semper turpis. Vivamus id tellus quis massa gravida\r\n");
      out.write("          viverra a vitae urna. Integer facilisis aliquet velit a egestas. Pellentesque orci dui, rutrum ac nulla eget, laoreet sollicitudin nunc. Aliquam vel mollis turpis. Cras vitae sodales felis. Aliquam semper tincidunt nunc. Nullam tempor ipsum\r\n");
      out.write("          purus, at commodo orci volutpat ac. Vivamus scelerisque nunc felis, nec euismod arcu gravida sed. Etiam tempus, purus posuere molestie blandit, tortor felis iaculis nisl, ac rhoncus nisi ipsum a enim. </p>\r\n");
      out.write("        <blockquote class=\"pull-right\">\r\n");
      out.write("          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\r\n");
      out.write("          <small>Someone famous in <cite title=\"Source Title\">Source Title</cite></small>\r\n");
      out.write("        </blockquote>\r\n");
      out.write("        <div class=\"clearfix\"></div>\r\n");
      out.write("        <p>Integer convallis facilisis est, non vehicula ligula tincidunt ac. Curabitur dignissim quam mollis purus rhoncus imperdiet. Aliquam erat volutpat. Duis tempor vestibulum erat, in condimentum eros dignissim at. Maecenas elementum tortor nulla,\r\n");
      out.write("          a suscipit mi tincidunt id. Morbi id felis luctus, aliquet neque cursus, aliquam leo. Pellentesque vel justo tincidunt, pulvinar justo id, vulputate tortor. </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <!-- end content -->\r\n");
      out.write("      \r\n");
      out.write("      ");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/test/main.jsp(3,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("contextPath");
      // /WEB-INF/views/test/main.jsp(3,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/test/main.jsp(3,0) '${pageContext.request.contextPath}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${pageContext.request.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
