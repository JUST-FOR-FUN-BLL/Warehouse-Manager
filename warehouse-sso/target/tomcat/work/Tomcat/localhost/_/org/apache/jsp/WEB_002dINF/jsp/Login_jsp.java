/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-26 14:40:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/commons/common-js.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form method=\"post\" id=\"LoginForm\" >\r\n");
      out.write("<table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"#e5f6cf\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"608\" background=\"/images/login_03.gif\"><table width=\"862\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"266\" background=\"/images/login_04.gif\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"95\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"424\" height=\"95\" background=\"/images/login_06.gif\">&nbsp;</td>\r\n");
      out.write("            <td width=\"183\" background=\"/images/login_07.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"21%\" height=\"30\"><div align=\"center\"><span class=\"STYLE3\">工号</span></div></td>\r\n");
      out.write("                <td width=\"79%\" height=\"30\"><input type=\"text\" id=\"id\" name=\"id\"  style=\"height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"30\"><div align=\"center\"><span class=\"STYLE3\">密码</span></div></td>\r\n");
      out.write("                <td height=\"30\"><input type=\"password\" id=\"password\" name=\"password\"  style=\"height:18px; width:130px; border:solid 1px #cadcb2; font-size:12px; color:#81b432;\"></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"30\">&nbsp;</td>\r\n");
      out.write("                <td height=\"30\"><input type=\"button\" id=\"login\" value=\"登录\"  onclick=\"Login.login()\">\r\n");
      out.write("                \t\t\t\t<input type=\"reset\" id=\"reset\" value=\"重置\" /></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              \t\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td width=\"255\" background=\"/images/login_08.gif\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"247\" valign=\"top\" background=\"/images/login_09.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"22%\" height=\"30\">&nbsp;</td>\r\n");
      out.write("            <td width=\"56%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"22%\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("            <td height=\"30\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">                   \t\r\n");
      out.write("                          \t\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"44%\" height=\"20\">&nbsp;</td>\r\n");
      out.write("                <td width=\"56%\" class=\"STYLE4\">\t<p>还未注册<a href=\"/page/register\">立即注册</a></p> </td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td bgcolor=\"#a2d962\">&nbsp;</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("<map name=\"Map\"><area shape=\"rect\" coords=\"3,3,36,19\" href=\"#\"><area shape=\"rect\" coords=\"40,3,78,18\" href=\"#\"></map>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\tvar Login={\r\n");
      out.write("\t\t\tbefore:function(){\r\n");
      out.write("\t\t\t\t$(\"#password\").val($.trim($(\"#password\").val()))\r\n");
      out.write("\t\t\t\t$(\"#id\").val($.trim($(\"#id\").val()))\r\n");
      out.write("\t\t\t\tif($(\"#id\").val()== \"\"){\r\n");
      out.write("\t\t\t\t\talert('请填写员工号,不要输入空格')\r\n");
      out.write("\t\t\t\t\t$(\"#id\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif($(\"#password\").val() == \"\"){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\talert('请填写员密码,不要输入空格')\r\n");
      out.write("\t\t\t\t\t$(\"#password\").focus();\r\n");
      out.write("\t\t\t\t\treturn false;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tlogin:function(){\r\n");
      out.write("\t\t\t\tif(Login.before()){\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tLogin.doSubmit();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdoSubmit:function(){\r\n");
      out.write("\t\t\t\t$.post(\"/user/login\",$(\"#LoginForm\").serialize(), function(data){\t\r\n");
      out.write("\t\t\t\t\tif(data.status == 200){\r\n");
      out.write("\t\t\t\t\t\tmsg:\"欢迎您登录用户系统\"\r\n");
      out.write("\t\t\t\t\t\tlocation.href = \"http://localhost:8081\"\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\tmsg:\"密码或员工号ID不正确，请重新输入\"\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}