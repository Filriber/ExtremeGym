package br.com.XtremeGym.servlet;

import br.com.XtremeGym.dao.UserDao;
import br.com.XtremeGym.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-User")
public class CreateUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("User-name");
        String userCpf=req.getParameter("User-cpf");
        String userEmail=req.getParameter("User-email");
        String userSenha=req.getParameter("User-senha");
        String userSenhaConfirma=req.getParameter("User-senhaConfirma");

        User user= new User();
        user.setName(userName);
        user.setCpf(userCpf);
        user.setEmail(userEmail);
        user.setSenha(userSenha);

        new UserDao().createUser(user);

        req.getRequestDispatcher("telaLogin/loginCadastro.html").forward(req, resp);
    }
}
