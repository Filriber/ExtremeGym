package br.com.XtremeGym.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-gym")
public class CreateGymServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String clienteName = req.getParameter("cliente-name");

        System.out.println(clienteName);

        req.getRequestDispatcher("index.html").forward(req, resp);
    }
}
