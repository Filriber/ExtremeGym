package br.com.XtremeGym.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-Gym")
public class CreateGymServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String gymName=req.getParameter("Gym-name");

        System.out.println(gymName);
        req.getRequestDispatcher("index.html").forward(req, resp);
    }
}
