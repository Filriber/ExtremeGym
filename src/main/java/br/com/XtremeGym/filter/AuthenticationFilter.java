package br.com.XtremeGym.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter({"/admin/*"})
public class AuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) { }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        if (isUserLoggedOn(httpServletRequest)) {
            chain.doFilter(servletRequest, servletResponse);

        } else {
            servletRequest.setAttribute("message", "Usuario nao autenticado!");

            servletRequest.getRequestDispatcher("telaLogin/loginCadastro.jsp").forward(httpServletRequest, servletResponse);
        }

    }

    @Override
    public void destroy() { }

    private boolean isUserLoggedOn(HttpServletRequest httpServletRequest) {

        return  httpServletRequest.getSession().getAttribute("loggedUser") == null;

    }

}
