/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.16
 * Generated at: 2019-05-10 01:21:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/views/./includes/header.jsp", Long.valueOf(1557450998125L));
    _jspx_dependants.put("/WEB-INF/views/./includes/footer.jsp", Long.valueOf(1557451104686L));
    _jspx_dependants.put("jar:file:/C:/Workspace/study-spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BBS/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/C:/Workspace/study-spring/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BBS/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1554876572045L));
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>Spring 게시판 예제</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Core CSS -->\r\n");
      out.write("<link href=\"/resources/vendor/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- MetisMenu CSS -->\r\n");
      out.write("<link href=\"/resources/vendor/metisMenu/metisMenu.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- DataTables CSS -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"/resources/vendor/datatables-plugins/dataTables.bootstrap.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- DataTables Responsive CSS -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"/resources/vendor/datatables-responsive/dataTables.responsive.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom CSS -->\r\n");
      out.write("<link href=\"/resources/dist/css/sb-admin-2.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom Fonts -->\r\n");
      out.write("<link href=\"/resources/vendor/font-awesome/css/font-awesome.min.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Navigation -->\r\n");
      out.write("\t\t<nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\"\r\n");
      out.write("\t\t\tstyle=\"margin-bottom: 0\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\">SB Admin v2.0</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.navbar-header -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"fa fa-user fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login\"><i class=\"fa fa-user fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tlogin</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"signUp\"><i class=\"fa fa-user fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tSign Up</a></li>\r\n");
      out.write("\t\t\t\t\t</ul> <!-- /.dropdown-user --></li>\r\n");
      out.write("\t\t\t\t<!-- /.dropdown -->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<!-- /.navbar-top-links -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("\t\t\t\t<div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"sidebar-search\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group custom-search-form\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"input-group-btn\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-default\" type=\"button\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"fa fa-search\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div> <!-- /input-group -->\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"/board/list\"><i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-dashboard fa-fw\"></i>Board List</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.sidebar-collapse -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.navbar-static-side -->\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"page-wrapper\">\r\n");
      out.write("\t\t\t<script\r\n");
      out.write("\t\t\t\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("<div class=\"page-header\">\n");
      out.write("\n");
      out.write("<h1>Hello world!</h1>\n");
      out.write("<P class=\"lead\">  The time on the server is ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${serverTime}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(". </P>\n");
      out.write("<!-- <P class=\"lead\"> <a href=\"/board/list\">Board List</a> </P> -->\n");
      out.write("\n");
      out.write("</div><!-- /.page-header -->\n");
      out.write("</div><!-- /.container -->\n");
      out.write("\n");
      out.write("<script src=\"/webjars/jquery/3.3.1/jquery.min.js\"></script> \n");
      out.write("<script src=\"/webjars/bootstrap/4.3.1/js/bootstrap.min.js\"></script> \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("  $(function () {\n");
      out.write("    console.log(\"jQuery ready\");\n");
      out.write("  });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /#page-wrapper -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 주석처리 -->\r\n");
      out.write("<!--     <script src=\"/resources/vendor/jquery/jquery.min.js\"></script> -->\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Core JavaScript -->\r\n");
      out.write("<script src=\"/resources/vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Metis Menu Plugin JavaScript -->\r\n");
      out.write("<script src=\"/resources/vendor/metisMenu/metisMenu.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- DataTables JavaScript -->\r\n");
      out.write("<script src=\"/resources/vendor/datatables/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"/resources/vendor/datatables-plugins/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"/resources/vendor/datatables-responsive/dataTables.responsive.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Custom Theme JavaScript -->\r\n");
      out.write("<script src=\"/resources/dist/js/sb-admin-2.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- 반응형 웹 처리 (jquery의 최신 버전을 사용한 상태에서는 모바일 크기에서 '새로고침'시 메뉴가 펼쳐지는 문제가 발생함으로) -->\r\n");
      out.write("<script>\r\n");
      out.write("  $(document).ready(function() {\r\n");
      out.write("    $('#dataTables-example').DataTable({\r\n");
      out.write("      responsive: true\r\n");
      out.write("    });\r\n");
      out.write("    $(\".sidebar-nav\")\r\n");
      out.write("      .attr(\"class\",\"sidebar-nav navbar-collapse collapse\")\r\n");
      out.write("      .attr(\"aria-expanded\",'false')\r\n");
      out.write("      .attr(\"style\",\"height:1px\");\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write('\n');
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
