/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-11-22 22:38:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Escolha_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"Escolha.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<button id=\"btnAbrirPopup\">Abrir seção de gerenciamento</button>\r\n");
      out.write("\r\n");
      out.write("<div id=\"meuPopup\" class=\"fundo\">\r\n");
      out.write("  <div class=\"pop-up\">\r\n");
      out.write("    <h2>Escolha uma opção</h2>\r\n");
      out.write("    <p>Você gostaria de ir para a área de alteração de treinos ou para a de alteração de usuários?</p>\r\n");
      out.write("    <button onclick=\"location.href='/listar-todos-treinos'\">Alteração de Treinos</button>\r\n");
      out.write("    <button onclick=\"location.href='/achar-todos-usuarios'\">Alteração de Usuários</button>\r\n");
      out.write("    <button id=\"btnFecharPopup\">Fechar</button>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var popup = document.getElementById(\"meuPopup\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var btnAbrirPopup = document.getElementById(\"btnAbrirPopup\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var btnFecharPopup = document.getElementById(\"btnFecharPopup\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("btnAbrirPopup.onclick = function() {\r\n");
      out.write("  popup.style.display = \"block\";\r\n");
      out.write("}\r\n");
      out.write("btnFecharPopup.onclick = function() {\r\n");
      out.write("  popup.style.display = \"none\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("window.onclick = function(event) {\r\n");
      out.write("  if (event.target == popup) {\r\n");
      out.write("    popup.style.display = \"none\";\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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